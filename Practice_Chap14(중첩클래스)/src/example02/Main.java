package example02;

import example02.A.C;

public class Main {

	public static void main(String[] args) {
		
		
		
		
		A a = new A();
	
		//Main클래스에서 외부 클래스 A와의 주소가 틀림 = 독립된 객체
		System.out.println("아래는 위와 다른 주소로 호출하는 것이다");
		System.out.println("--------------------------------------");
		
		
		//인스턴스 멤버 클래스 B는 반드시 외부 클래스 A의 인스턴스가 있어야 생성가능하다!!!!
		A.B b = a.new B();
		b.method1();
		
		System.out.println();
		
		//정적 멤버 클래스인 C는 외부 클래스 A의 인스턴스가 있던 없던 상관 없이 접근 가능하다
		//단 정적 멤버 클래스에 인스턴스멤버가 있다면 new생성자를 무조건 만들어 줘야한다. -> A.C c = new A.C();
		A.C.method2();
		System.out.println(A.C.c);
		A.C c = new A.C();
		System.out.println(c.a);
		c.method1();
		
		System.out.println();
		
		//로컬 멤버 메서드 호출
		//외부 클래스 A의 인스턴스를 생성하면 얼마든 로컬메서드를 호출하고, 로컬 클래스를 생성하여 사용할 수 있다
		//-> A a = new A(); 외부클래스A에 로컬 멤버 메서드 method()를 만들었기 때문이다.
		a.method();
	}

}
