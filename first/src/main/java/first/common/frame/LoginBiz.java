package first.common.frame;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.common.Biz.MemberBiz;
import first.common.vo.CarInfo;
import first.common.vo.CarState;
import first.common.vo.Member;
import first.common.vo.Member_Car;

@Service("loginBiz")
public class LoginBiz implements MemberBiz<Member,CarInfo,Member_Car,CarState,String> {
	@Resource(name="loginDao")
	LoginDao dao;
	
	//insert member - id&pwd 
	//insert carinfo - carid
	//select member where id=param

	@Override
	public int registerm(Member m) {
		return dao.insert(m);
	}
	
	@Override
	public int registerc(CarInfo c) {
		return dao.insert(c);
	}
	
	@Override
	public int registern(Member_Car n) {
		return dao.insert(n);
	}
	@Override
	public int registers(CarState s) {
		return dao.insert(s);
	}

	@Override
	public String get(String s) {
		return dao.select(s);
	}
	

	@Override
	public String getid(Member_Car n) {
		return dao.select(n);
	}
	
	//update CarState
	@Override
	public void updateState(CarState c) {
		updateState(c);
	}

	
	
}










