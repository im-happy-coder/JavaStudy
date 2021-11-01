package clothing;

class A1{
	public void test() {
		System.out.println("A");// TODO Auto-generated constructor stub
	}
}
class B1 extends A1{
	public void test() {
		System.out.println("B");// TODO Auto-generated constructor stub
	}
}
class C1 extends A1{
	public void test() {
		System.out.println("C");// TODO Auto-generated constructor stub
	}
}
public class Examp150 {
	public static void main(String[] args) {
		A1 b1 = new A1();
		A1 b2 = new C1();
		A1 b3 = (B1) b2;
		b1 = (A1) b2;
		b1.test();
		b3.test();
	}
}
