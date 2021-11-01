package example01;

class A{}
class B extends A{}
class C extends A{}

interface I{}
class D implements I{}
class E implements I{}
public class ClassCastEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//조상클래스의 참조변수가 참조하고 있는 인스턴스의 타입이 B이다
		A a = new B();
		B b = (B)a; //다운 캐스팅
		System.out.println("실행완료");
		
//		A a1 = new B();  //조상클래스A가 자손클래스B를 참조하고 있기 때문에, 자손클래스C로 다운캐스팅하면 예외가 발생한다.
//		C c = (C)a1; //다운캐스팅 // ClassCastException발생
//		System.out.println("실행완료");
		
		I i = new D();
		D d = (D)i;
		System.out.println("실행완료");
		
		//똑같이 인터페이스 I가 D를 이미 참조했기 떄문에 
		//다운 캐스팅해봤자 먼저 참조한 D클래스를 벗어나지 못한다.
		I i2 = new D();
		E e = (E)i2; // ClassCastException발생
		System.out.println("실행완료");

	}

}
