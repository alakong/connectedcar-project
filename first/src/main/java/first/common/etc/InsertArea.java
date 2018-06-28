package first.common.etc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class InsertArea {
//Area table
	 public static void main(String[] args) {
		    // 1. �����ͺ��̽� ���� Ŭ���� �ε�
		 
		   
		    //�����ͺ��̽��� �����ϱ� ���� ����
		    Connection con = null;
		    //SQL ������ �����ϱ� ���� ����
		    Statement stmt = null;
		    //Select ���� �������� �� ����� �����ϱ� ���� ����
		    ResultSet rs = null;		     
		    PreparedStatement pstmt = null;

		    try{
		      Class.forName("oracle.jdbc.driver.OracleDriver");
		      System.out.println("ready");

		    //������ ���� Statement ���� ����
		      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
		          "shop","111111");
		       
		      //sql ������ ������ PreparedStatement ��ü ����
		      System.out.println("con");
		      pstmt = con.prepareStatement("INSERT INTO AREA VALUES(?,?,?)");
		      //?�� �����͸� ���ε�
		      
		      for(int i =1;i<=10;i++) {
		    	  System.out.println("insert");
		    	 double lat= 37.507955; //-0.0018;
		    	 double longi= 127.023286;

		    
		      pstmt.setInt(1,i);
		      pstmt.setString(2, Double.toString(lat));
		      pstmt.setString(3, Double.toString(longi+0.0023*(i-1)));
		      pstmt.executeUpdate();
		      }
		      con.commit();
		      
		       
		   
		       
		    } catch(Exception e){
		      System.out.println(e.getMessage());
		    }
		    finally{
		      try{
		        if(rs != null)rs.close();
		        if(stmt != null)stmt.close();
		        if(con != null)con.close();
		      }
		      catch(Exception e){}
		    }
		 
		  }


}
