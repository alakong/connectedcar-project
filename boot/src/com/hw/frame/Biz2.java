package com.hw.frame;

import java.util.List;

import com.hw.vo.Map;
//기능이 정의되어 있음
public interface Biz2<T,S> {
	public void insert(T t);
	public void delete(S s);
	public List<T> select();
//	public List<Map> get();

}
