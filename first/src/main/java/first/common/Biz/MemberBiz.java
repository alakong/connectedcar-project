package first.common.Biz;

import first.common.vo.Member;


public interface MemberBiz<M,C,N,A,S> {
	public int registerm(M m);
	public int registerc(C c);
	public int registern(N n);
	public int registers(A a);
	public String get(S s);
	public String getid(N n);
	public void updateState(A a);
}
