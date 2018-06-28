package com.hw.map;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao2;
import com.hw.mapper.MapMapper;
import com.hw.vo.Map;

@Repository("mapDao")
public class MapDao implements Dao2<Map, Integer> {

	@Autowired
	MapMapper mapper2;

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
		return mapper2.select();
	}
	


}











