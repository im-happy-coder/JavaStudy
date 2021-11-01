package clothing;
class A {
	public A() {
		System.out.println("A");// TODO Auto-generated constructor stub
	}
}
class B extends A{
	public B() {
		System.out.println("B");// TODO Auto-generated constructor stub
	}
}
class C extends B{
	public C() {
		System.out.println("C");// TODO Auto-generated constructor stub
	}
}
public class Examp207 extends C{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();

	}

}
