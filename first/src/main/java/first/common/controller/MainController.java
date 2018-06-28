package first.common.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import first.common.Biz.MemberBiz;
import first.common.vo.CarInfo;
import first.common.vo.CarState;
import first.common.vo.Member;
import first.common.vo.Member_Car;

@Controller
public class MainController {
	@Resource(name = "loginBiz")
	MemberBiz<Member, CarInfo, Member_Car,CarState, String> biz;

	Logger log = Logger.getLogger("car");
	// Logger log=Logger.getLogger(this.getClass());

	// ��ü �ڵ��� ������ ���Ϸ� ���
	@RequestMapping(value = "/basicLog.do")
	public void basicLog(CarState carinfo) {
		StringBuilder content = new StringBuilder();
		//time data setting for log
		Date d= new Date();
		SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-M-d-k-m-s");
		String time = dateFormat.format(d);
		String[] array= time.split("-");
		
		
		//���̺� ���̺� ���� �̰ɷ� �������
	
		 //array[0]�⵵
		 //array[1]��
		 //array[2]��
		 //array[3]��
		 //array[4]��
		 //array[5]��

	    content.append(array[0]+","+array[1]+","+array[2]+","+array[3]+","+array[4]+","+array[5]);
		content.append(","+carinfo.getCarId().toString());
		content.append(","+carinfo.getAccel().toString());
		content.append(","+carinfo.getLat().toString());
		content.append(","+carinfo.getLongi().toString());
		

/*		content.append(" id: " + carinfo.getCarId().toString());
		content.append(" accel: " + carinfo.getAccel().toString());*/
		System.out.println(content.toString());
		log.debug(content.toString());
	}

	
	// sign in 
	//http://70.12.114.142/first/signin.do?id= &pwd= &carid=
	@RequestMapping(value = "/signin.do")
	public void signin(HttpServletResponse res, Member m,@RequestParam String carid) {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = null;

		CarInfo c= new CarInfo();		
		Member_Car n=new Member_Car();
		CarState s= new CarState();
		
		c.setCarId(carid);
		n.setCarId(carid);
		n.setId(m.getId());
		s.setCarId(carid);
		
		try {
			out = res.getWriter();
			if (biz.registerm(m) == 1 && biz.registerc(c) == 1 && biz.registern(n) == 1&&biz.registers(s)==1) {
				
				System.out.println("signin");
				out.println("1");
			} else {
				out.println("0");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}
	}

	
	// login
	//http://70.12.114.142/first/login.do?id= &pwd=
	@RequestMapping(value = "/login.do")
	public void login(HttpServletResponse res,HttpSession session, Member m,@RequestParam String carid ) {
		res.setCharacterEncoding("UTF-8");
		PrintWriter out = null;
		try {
			out = res.getWriter();
			String pwd=m.getPwd();
			String id=m.getId();
			System.out.println(biz.get(id)+"pwd");
			
			//for �����ȣ Ȯ��
			Member_Car n= new Member_Car();
			n.setId(id);
			n.setCarId(carid);
			
			if (biz.get(id)!=null&&biz.get(id).equals(pwd)&&biz.getid(n)!=null) {
				System.out.println("login");
				session.setAttribute("login",n);//save member_car VO in session
				out.println("1");
			} else {
				out.println("0");
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (out != null) {
				out.close();
			}
		}

	}
	
	//상태업데이트 컨트롤러
	@RequestMapping(value = "/updateState.do")
	public void updateState(CarState carinfo) {
		
		
		
	}
	
	
	

}
