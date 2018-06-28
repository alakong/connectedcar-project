package first.common.frame;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;
import first.common.vo.CarInfo;
import first.common.vo.CarState;
import first.common.vo.Member;
import first.common.vo.Member_Car;

@Repository("loginDao")
public class LoginDao extends AbstractDAO {
	
	public int insert(Member t) {
		return insert("member.insertm", t);
	}
	
	public int insert(CarInfo t) {
		return insert("member.insertc", t);
	}
	
	public int insert(Member_Car n) {
		return insert("member.insertmc", n);
	}
	public int insert(CarState s) {
		return insert("member.inserts", s);
	}


	public String select(String id) {
		return (String) selectOne("member.select",id);
	}
	
	public String select(Member_Car n) {
		return (String)selectOne("member.selectid",n);
	}
	
	public void updateState(CarState c) {
		update("manage.update",c);	
	}
	

	
}








