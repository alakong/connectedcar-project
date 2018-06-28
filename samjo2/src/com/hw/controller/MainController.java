package com.hw.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.frame.Biz2;
import com.hw.vo.Map;

@Controller
public class MainController {

	
	@Resource(name = "mapBiz")
	Biz2<Map, Integer> biz2;

	@RequestMapping("/main.do")
	public String main(Model m) {
		System.out.println("호출됨");
//		m.addAttribute("center", "center");
		return "main";
	}

	@RequestMapping("/map.do")
	public String map(Model m) {
		m.addAttribute("center", "map");
		return "main";
	}

	@RequestMapping("/status.do")
	public String manager(Model m) {
		m.addAttribute("center", "status");
		return "main";
	}
	

	
	

/*	@RequestMapping("/chart1.do")
	public String chart1(Model m) {
		m.addAttribute("center", "manager2");
		return "main";
	}*/
	
/*	@RequestMapping("/map.do")
	public String map(Model m) {		
		m.addAttribute("center", "map");
		return "main";
	}*/
	
	
	
//	
	@RequestMapping(value="/mapimpl.do")
	 // output으로 값 쏘겠다
	public void mapimpl(HttpServletResponse res) throws IOException  {
		List<Map> list = new ArrayList<>();
		list = biz2.select();
		System.out.println(list);
//		return list;
//		obj_arr.put("data", list);

		JSONArray obj_arr = new JSONArray();
		for(int i = 0; i < list.size(); i++ ) {
			JSONObject obj = new JSONObject();
			obj.put("lat", list.get(i).getLat());
			obj.put("lng", list.get(i).getLon());
			obj_arr.add(obj);
			System.out.println(obj);
			
		}
		
		System.out.println(obj_arr);
		
		res.setCharacterEncoding("EUC-KR");
		res.setContentType("application/json");
		PrintWriter out = res.getWriter();
		out.print(obj_arr.toJSONString());
		out.close();
	}
/*	@RequestMapping("/delete.do")
	public String delete(Model m,String id)	{
		System.out.println("여기 들어 옴 ㅋ");
		biz.delete(id);
		System.err.println("id " + id + " 삭제 성공");
		List<Manager> list = null;
		list = biz.get2();
		m.addAttribute("managerlist", list);
		m.addAttribute("center", "manager/list");
		return "main";
	}
	
	@RequestMapping("/chart1impl.do")
	@ResponseBody // output으로 값 쏘겠다
	public void chart1impl(HttpServletResponse res) throws Exception {
		List<Manager> list = new ArrayList<>();
		list = biz.get();
		JSONArray arr = new JSONArray();	
		for (int i = 0; i < list.size(); i++) {
			JSONObject obj_arr = new JSONObject();
			System.out.println(list);
			obj_arr.put("name",list.get(i).getName());
			obj_arr.put("y", list.get(i).getScore());
			arr.add(obj_arr);
		}
		res.setCharacterEncoding("EUC-KR");
		res.setContentType("application/json");
		PrintWriter out = res.getWriter();
		out.print(arr.toJSONString());
		out.close();
	}*/
	

}
