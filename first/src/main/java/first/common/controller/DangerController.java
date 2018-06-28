package first.common.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import first.common.Biz.Biz;
import first.common.vo.Area;
import first.common.vo.CarState;
import first.common.vo.Danger;

@Controller
public class DangerController {
	@Resource(name="dangerBiz")
	Biz<Danger,CarState,String,HashMap,Area> biz;

	
	@RequestMapping(value="/check.do")
	public void checkDanger(HttpServletResponse res,@RequestParam String lat,@RequestParam String longi) {
		// @RequestParam boolean check
		//���� ��ġ���� �ֺ� �������� �����͸� �̾Ƽ� ������
		//1. ���� �����浵�� ��� ������ȣ�� �ش��ϴ� �� ���ϱ�
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("lat", lat);
		map.put("lat2", lat);
		map.put("longi", longi);
		map.put("longi2", longi);
		Integer areaNum= biz.getAreanum(map);
		
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		
		try {
			out = res.getWriter();
			
			//2. ���� �ڽ��� ������ �������� ������
			String latInfo=biz.getArea(String.valueOf(areaNum)).getLat();
			String longInfo=biz.getArea(String.valueOf(areaNum)).getLongi();		
			//out.println("----test");
			out.println(areaNum+","+latInfo+","+longInfo);
				
			//3. 9ĭ�� ���� ������ ����Ʈ�� �޾ƿ���
			//   ���� ������ y ������ 4�� �־����
			//	 14�� �ð� �޾Ƽ� ���� �ڸ�
			/*Date d= new Date();
			SimpleDateFormat dateFormat= new SimpleDateFormat("m");
			String time = dateFormat.format(d);*/
			
			//4. ���� ������ ������
			
			sendDanger(biz.getDangerData(makeMap(areaNum-10,"14")),out);
			sendDanger(biz.getDangerData(makeMap(areaNum,"14")), out);
			sendDanger(biz.getDangerData(makeMap(areaNum+10,"14")),out);
	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}
		
	//���� ��ȣ�� �ð��� ���� �Ķ���� �ؽø� �������ִ� �޼ҵ�
		public HashMap<String, Object> makeMap(int areaNum, String time){
			HashMap<String, Object> map=  new HashMap<String, Object>();
	/*		SELECT * FROM danger WHERE 
			(AREANUM=#{areanum} AND #{btime} >= SP_TIME_B AND SP_TIME_F >= #{ftime}) 
			OR (AREANUM=#{areanum2} AND #{btime2} >= SP_TIME_B AND SP_TIME_F >= #{ftime2})
			OR (AREANUM=#{areanum3} AND #{btime3} >= SP_TIME_B AND SP_TIME_F >= #{ftime3})
			*/
			map.put("areanum",areaNum-1);
			map.put("btime",time);
			map.put("ftime",time);
			map.put("areanum2",areaNum);
			map.put("btime2",time);
			map.put("ftime2",time);
			map.put("areanum3",areaNum+1);
			map.put("btime3",time);
			map.put("ftime3",time);		
			return map;
			
		}
		
		//���� �����͵� �����ϴ� �޼ҵ�
		public void sendDanger(List<Danger> list, PrintWriter out) {
			System.out.println("sendDanger--");
			
		for(Danger d : list) {
				out.println(","+d.getAreaNum()+","+d.getLat()+","+d.getLongi()+","+d.getdLevel());			
				System.out.println(d.getAreaNum()+","+d.getLat()+","+d.getLongi()+","+d.getdLevel());
			}
	
		}
		
		
	}
	
	
	 


