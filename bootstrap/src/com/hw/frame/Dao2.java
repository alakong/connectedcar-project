package com.hw.frame;

import java.util.List;

import com.hw.vo.Map;

public interface Dao2<T,S> {
	public void insert(T t);
	public void delete(S s);
	public List<T> select();
	
}
