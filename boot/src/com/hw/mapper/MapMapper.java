package com.hw.mapper;

import java.util.List;

import com.hw.vo.Map;

public interface MapMapper {
	public List<Map> select();
	public void delete(Integer obj);

}
