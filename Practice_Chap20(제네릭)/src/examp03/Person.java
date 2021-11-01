package examp03;

public class Person<T> {
	
	private T t;
	
	public Person() {
	}

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}
