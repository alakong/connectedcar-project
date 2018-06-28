package first.common.etc;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class GeocodingAPI {

   private String serviceKey = "AIzaSyDobpPadTJoc1ek6zyb8hu7XFfzeCAQgQ4";

   public String request(String string, String string2) throws Exception {

      // https://maps.googleapis.com/maps/api/geocode/xml?latlng=40.714224,-73.961452&key=AIzaSyDobpPadTJoc1ek6zyb8hu7XFfzeCAQgQ4
      StringBuilder urlBuilder = new StringBuilder("https://maps.googleapis.com/maps/api/geocode/xml");
      urlBuilder.append(
            "?" + URLEncoder.encode("latlng", "UTF-8") + "=" + string + "," + string2);
      urlBuilder.append("&" + URLEncoder.encode("language", "UTF-8") + "=" + URLEncoder.encode("ko", "UTF-8"));
      urlBuilder.append("&" + URLEncoder.encode("key", "UTF-8") + "=" + serviceKey);

      URL url = new URL(urlBuilder.toString());
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();
      conn.setRequestMethod("GET");
      conn.setRequestProperty("Content-type", "application/json");

      BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String result = "";
      String line;

      while ((line = br.readLine()) != null) {
         result = result + line.trim();
      }

      InputSource is = new InputSource(new StringReader(result));
      Document doc = null;
      DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
      factory.setNamespaceAware(true);
      DocumentBuilder builder = factory.newDocumentBuilder();
      doc = builder.parse(is);
      XPathFactory xpathFactory = XPathFactory.newInstance();
      XPath xpath = xpathFactory.newXPath();
      // XPathExpression expr = xpath.compile("//result/address_component");
      XPathExpression expr = xpath.compile("//result");
      NodeList nodeList = (NodeList) expr.evaluate(doc, XPathConstants.NODESET);

      String formattedAddress = null;

      loop : for (int i = 0; i < nodeList.getLength(); i++) {
         NodeList child = nodeList.item(i).getChildNodes();
         for (int j = 0; j < child.getLength(); j++) {
            Node node = child.item(j);
            if (node.getNodeName().equals("formatted_address")) {
               formattedAddress = node.getTextContent();
               break loop;
            }

         }
      }

      br.close();
      conn.disconnect();
      
      return formattedAddress;

   }

}