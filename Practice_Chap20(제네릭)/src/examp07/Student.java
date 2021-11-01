package examp07;

//조상이 제네릭이면 자손도 제네릭이여야 한다.
//자손 제네릭 확장도 가능
public class Student<T,M,C> extends Person<T, M> {

	private C c;

	public C getC() {
		return c;
	}

	public void setC(C c) {
		this.c = c;
	}
	
}
