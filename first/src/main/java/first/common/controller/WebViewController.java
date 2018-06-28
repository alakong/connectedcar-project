package first.common.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import first.common.Biz.Biz;
import first.common.etc.GeocodingAPI;
import first.common.vo.Area;
import first.common.vo.CarState;
import first.common.vo.Danger;
import first.common.vo.Member_Car;

@Controller
public class WebViewController {
	@Resource(name = "dangerBiz")
	Biz<Danger, CarState, String, HashMap<String, Object>, Area> biz;
	GeocodingAPI geocodingAPI = new GeocodingAPI();

	@RequestMapping("/main.do")
	public String main(Model m, HttpSession session,@RequestParam String carid,@RequestParam String id) {
		
		Member_Car n= new Member_Car();
		n.setId(id);
		n.setCarId(carid); 
	
		session.setAttribute("login",n);	
		return "main3";
	}

	@RequestMapping("/map.do")
	public String map(Model m) {

		List<Danger> list = biz.get();
		m.addAttribute("list", list);
		m.addAttribute("center", "map2");
		return "main3";
	}

	@RequestMapping("/status.do")
	public String manager(Model m, HttpSession session) {
		String address="";
		
	/*	String carid= ((Member_Car)session.getAttribute("login")).getCarId();*/
/*		System.out.println("car"+carid);*/
		CarState state=biz.get("3333");
		
		try {
			address = geocodingAPI.request(state.getLat(),state.getLongi());
			address = address.replace("대한민국", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		m.addAttribute("list", address);
		m.addAttribute("id",state.getCarId());
		m.addAttribute("date",	state.getRegDate());
		m.addAttribute("cartemp",state.getCarTemp());
		System.out.println("cartemp"+state.getCarTemp());
		m.addAttribute("center", "status2");
		return "main3";
	}

	// update carstate
	@RequestMapping("/updatestate.do")
	public void insertState(CarState s) {
		System.out.println("cartemp"+s.getCarTemp());
		biz.modifyc(s);
	}

	// dangertable에서 전체 위험지역 불러오기
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/mapimpl.do")
	public void showDanger(HttpServletResponse res, Model model) {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		List<Danger> list = biz.get();
		JSONArray obj_arr = new JSONArray();
		String address = "";
		String[] arr = null;
		StringBuilder shortAdd = null;
		for (Danger danger : list) {
			try {
				address = geocodingAPI.request(danger.getLat(), danger.getLongi());
				address = address.replace("대한민국", "");

			} catch (Exception e) {
				e.printStackTrace();
			}
			JSONObject obj = new JSONObject();
			obj.put("lat", Double.parseDouble(danger.getLat()));
			obj.put("lng", Double.parseDouble(danger.getLongi()));
			obj.put("address", address);
			obj.put("dLevel", " " + danger.getdLevel());
			obj.put("dTime", danger.getSp_time_b() + "시부터 " + danger.getSp_time_f() + "시까지");
			obj_arr.add(obj);
			System.out.println(obj);

		}
		res.setContentType("application/json");
		out.print(obj_arr.toJSONString());
		System.out.println(obj_arr.toJSONString());
		out.close();
	}

	// 차량 상태뽑기
	@SuppressWarnings("unchecked")
	@RequestMapping("/mystate.do")
	public void showState(HttpServletResponse res, HttpSession session, Model model) {
		String carid = "3333";
		// ((Member_Car)session.getAttribute("login")).getCarId();

		res.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = res.getWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
		JSONArray obj_arr = new JSONArray();
		JSONObject obj = new JSONObject();
		CarState state = biz.get(carid);
		System.out.println(state.getLat());
		String address = "";
		try {
			address = geocodingAPI.request(state.getLat(), state.getLongi());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.put("lat", Double.parseDouble(state.getLat()));
		obj.put("lng", Double.parseDouble(state.getLongi()));
		obj.put("carid", carid);
		obj.put("address", address);
		obj_arr.add(obj);
		res.setContentType("application/json");
		out.print(obj_arr.toJSONString());
		System.out.println(obj_arr.toJSONString());
		out.close();

	}

	// select CarState and show on webView
	@RequestMapping(value = "/stateimpl.do")
	public void showState(HttpServletResponse res, Model model) {	

	}
	
	
	// select CarState and show on webView
		@RequestMapping(value = "/chart1impl.do")
		public void showEng(HttpServletResponse res, Model model) {
			
			String carid="3333";
			res.setCharacterEncoding("UTF-8");
			PrintWriter out = null;
			try {
				out = res.getWriter();
			} catch (IOException e) {
				e.printStackTrace();
			}
			JSONArray obj_arr = new JSONArray();
			JSONObject obj = new JSONObject();
			CarState state = biz.get(carid);

			obj.put("gas", state.getGas());
			obj.put("tire", state.getTire());
			obj.put("engtmp", state.getEngTemp());
			obj_arr.add(obj);
			res.setContentType("application/json");
			out.print(obj_arr.toJSONString());
			System.out.println(obj_arr.toJSONString());
			out.close();
			

		}
}
