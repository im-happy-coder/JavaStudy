package example03;

public class A {

	//인스턴스 멤버 클래스
	class B {
		public B() {
			System.out.println("인스턴스멤버클래스 B생성자");
		}
	}
	//정적 멤버 클래스
	static class C{
		public C() {
			System.out.println("정적턴스멤버클래스 C생성자");		
		}
	}
	
	
	//인스턴스 멤버(필드)선언
	B b = new B();
	C c = new C();
	
	
	//메서드 안에 인스턴스 멤버 메서드선언
	//method1()을 사용할 때 쯤은, 이미 외부클래스 A의
	//인스턴스가 만들어진 상태일 것이다.
	public void method1() {  
		//지역변수 선언
		System.out.println("method1 내");
		B b = new B();
		C c = new C();
	}
	
	//정적 멤버 선언
	//B클래스는 인스턴스 멤버 클래스 이기때문에, static 붙이면 안된다.
	//static B b1 = new B(); X	static A.B c2 = new B(); X
	static C c1 = new C();  //static이 제일 먼저 올라감
	
	
	//정적 메서드 선언  //static은 static만 접근 가능하다.!!!!!!!!!!
	public static void method2() {
		//지역변수 선언
		System.out.println("정적 method2 내");
		//B b = new B();  //인스턴스 멤버클래스이므로 안된다.
		C c = new C(); //메서드가 정적메서드 이므로 정적 로컬변수로 선언을 해도 무방하다
	}
	
	
	///////////결론///////////
	// 중첩 클래스에서의 인스턴스나 필드, 메서드는 언제든지 생성가능하지만.
	// 정적필드나 정적메서드는 정적클래스에서만 생성이 가능하다.

	
}
