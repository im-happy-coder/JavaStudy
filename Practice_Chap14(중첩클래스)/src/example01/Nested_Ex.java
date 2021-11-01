package example01;

public class Nested_Ex {
	
	//인스턴스 멤버 클래스
	class A {
		int iv = 100;
//		int static cv = 200; //static멤버변수는 사용불가 - 이유 : Nested_Ex.A.cv으로 호출할 수 있지만 A가 static 클래스가 아니기 때문에 불가능
		public A() { //인스턴스 멤버 클래스도 생성자 존재
			System.out.println("A생성자 호출");
		}
		public void method1() {
			System.out.println("A클래스의 method1() 호출");
		}
		// Nested_Ex.A.method2();으로 호출할 수 있지만 A가 static 클래스가 아니기 때문에 불가능
//		public static void method2() {
//			System.out.println("A클래스의 method1() 호출");
//		}
	}
	
	//정적 멤버 클래스
	static class B{
		int iv = 100;
		static int cv = 500;  //Nested_Ex.A.cv 접근 가능하기 때문에 선언된다.
		public B() { //클래스 이기때문에 생성자 올 수 있다.
			System.out.println("B 생성자 호출");
		}
		// 외부 클래스(B)가 static클래스 이므로 선언가능하다.
		public void method1() {
			System.out.println("B클래스의 method1() 호출");
		}
		public static void method2() {
			System.out.println("B클래스의 method2() 호출");
		}
	}
	
	//로컬 클래스 선언과 사용(메서드내에 선언하며, 잠깐사용할 용도로 쓰인다.)
	public void method1() {
		class C {
			int iv = 200;
//			static cv = 700; //로컬 메서드안에서는 static멤버 선언 불가능하다.
			public C() {  //C도 클래스이므로 생성자 호출가능
				System.out.println("로컬클래스 C 생성자 호출");
			}
			public void lmethod() {
				System.out.println("로컬클래스 C의 method1()호출");
			}
		}
		//여기서 사용 가능
		//로컬 클래스는 해당 메서드 내에서만 사용이 가능하는 것에 주목!!!!
		C c = new C();
		System.out.println(c.iv);
		c.lmethod();
	}
	
	//로컬클래스2
	//로컬 클래스 선언과 사용(메서드내에 선언하며, 잠깐사용할 용도로 쓰인다.)
	public void method2() {
		class D {
			int iv = 200;
//			static cv = 700; //로컬 메서드안에서는 static멤버 선언 불가능하다.
			public D() {  //C도 클래스이므로 생성자 호출가능
				System.out.println("로컬클래스 D 생성자 호출");
			}
			public void lmethod() {
				System.out.println("로컬클래스 D의 method2()호출");
			}
		}
		//여기서 사용 가능
		//로컬 클래스는 해당 메서드 내에서만 사용이 가능하는 것에 주목!!!!
		D d = new D();
		System.out.println(d.iv);
		d.lmethod();
	}
	
	public void method3() {
		class E {
			int iv = 200;
//			static cv = 700; //로컬 메서드안에서는 static멤버 선언 불가능하다.
			public E() {  //C도 클래스이므로 생성자 호출가능
				System.out.println("로컬클래스 E 생성자 호출");
			}
			public void lmethod() {
				System.out.println("로컬클래스 E의 method3()호출");
			}
		}
		//여기서 사용 가능
		//로컬 클래스는 해당 메서드 내에서만 사용이 가능하는 것에 주목!!!!
		E e = new E();
		System.out.println(e.iv);
		e.lmethod();
	}
	
	

	public static void main(String[] args) {

		Nested_Ex ne = new Nested_Ex();
		//인스턴스 멤버클래스(A)는 외부클래스(Nested_Ex)의 인스턴스가 있어야 생성이가능하다. ->Nested_Ex ne = new Nested_Ex();이게 외부클래스 인스턴스다.
		//즉, 인스턴스 멤버 클래스를 사용하는 방법은 아래와 같다.
		Nested_Ex.A a = ne.new A();
		System.out.println(a.iv);
		a.method1();
		
		
		System.out.println("---------------------------------");
		
		//정적 클래스(B)의 static멤버 호출 방법      //정적 클래스는 외부클래스의 인스턴스가 없어도 접근 가능하다.(static의 특징)
		System.out.println(Nested_Ex.B.cv);
		Nested_Ex.B.method2();
		
		//정적 클래스(B)에 있는 인스턴스멤버 호출방법
		Nested_Ex.B b = new B();
		System.out.println(b.iv);
		b.method1();
		
		System.out.println("---------------------------------");
		
		
		//로컬 클래스 호출
		ne.method1();
		System.out.println();
		ne.method2();
		
		//멤버 클래스와 로컬클래스를 구분짓는 잣대는 무엇인가?
		//순번이다.
		//로컬클래스는 순번이 붙는다.
		
		//확인하는 방법  상단 도구모음 - > Window -> show view -> Navigator 
		// Practice_Chap14(중첩클래스) 자바 프로젝트 더블클릭 -> example01 더블클릭하면 구분 짓는 잣대 들이 나오는데
		
		//외부 클래스는 Nested_Ex.class 
		//로컬 클래스는 Nested_Ex$1C.class, Nested_Ex$1D.class, Nested_Ex$1E.class
		//인스턴스 멤버 클래스나 정적 멤버 클래스는 Nested_Ex$A.class, Nested_Ex$B.class
		
		//이런 식으로 표현한다.
		

	}

}
