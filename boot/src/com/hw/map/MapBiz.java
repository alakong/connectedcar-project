package com.hw.map;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz2;
import com.hw.frame.Dao2;

@Service("mapBiz")
public class MapBiz implements Biz2<Map, Integer> {
	
	@Resource(name="mapDao")
	Dao2<Map, Integer> dao2;


	@Override
	public void insert(Map t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer s) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Map> select() {
		return dao2.select();
		
	}



}





