package first.common.Biz;

import java.util.List;


public interface Biz<T,C,S,M,A> {
	public void registert(T t);
	public void registerc(C c);
	//public void remove(S s);
	//public void modify(T t);
	public void modifyc(C c);
	public C get(S s);
	public A getArea(S s);
	public List<T> get();
	public Integer getAreanum(M m);
	public List<T> getDangerData(M m);


}
