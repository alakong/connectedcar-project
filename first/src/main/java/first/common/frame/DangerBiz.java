package first.common.frame;

import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import first.common.Biz.Biz;
import first.common.vo.Area;
import first.common.vo.CarState;
import first.common.vo.Danger;

@Service("dangerBiz")
public class DangerBiz implements 
Biz<Danger,CarState,String,HashMap<String, Object>,Area> {
	@Resource(name="dangerDao")
	DangerDao dao;

	@Override//danger
	public void registert(Danger t) {
		dao.insert(t);
	}
	@Override
	public void registerc(CarState c) {
		dao.insert(c);
	}
	@Override
	public CarState get(String s) {
		return dao.select(s);
	}
	@Override
	public List<Danger> get() {
		return dao.select();
	}
	@Override
	public void modifyc(CarState t) {
		dao.update(t);
	}
	@Override
	public Integer getAreanum(HashMap<String, Object> m) {
		return dao.select(m);
	}
	@Override
	public Area getArea(String s) {
		return dao.selectArea(Integer.parseInt(s));
	}
	@Override
	public List<Danger> getDangerData(HashMap<String, Object> m) {
		return dao.selectone(m);
	}

	
	
	
	
	
	
/*
	@Override
	public void remove(String s) {
		dao.delete(s);
	}

	@Override
	public void modify(Danger t) {
		dao.update(t);
	}
	*/

	
	
}










