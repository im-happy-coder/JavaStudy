package example01;

public class A extends Phone  {
	
		Phone phone = new Phone("aa", "yellow", "LG");
	
	public A() {
		super("aa", "yellow", "LG");
	}
	
	public void method() {
		System.out.println(phone.getColor());
		System.out.println(phone.getCompany());
		System.out.println(phone.getModel());
	}
}
