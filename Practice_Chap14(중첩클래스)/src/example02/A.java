package example02;

public class A {
	
//	B b = new B();
//	C c = new C(); 여기서도 생성자를 만드는게 가능한 이유는 같은 멤버니까
//	A.B b = new B();
//	A.C c = new A.C();
	
	public A() {
		System.out.println("--------------------------------------");
		System.out.println("외부 클래스 A의 생성자 호출");
		System.out.println("--------------------------------------");
		
		System.out.println();
		
		System.out.println("--------------------------------------");
		B b = new B(); //이게 왜  가능할까요?  // 외부클래스(A)안에 중첩클래스(B)가 있기 때문에 //인스턴스 멤버 클래스는 외부클래스A의 멤버이다.
		System.out.println(b.a);
		b.method1();
		System.out.println("--------------------------------------");
		
		System.out.println();
		
		System.out.println("--------------------------------------");
		C c = new C();
		System.out.println(c.a);
		System.out.println(A.C.c);
		c.method1();
		A.C.method2();
		System.out.println("--------------------------------------");
		
		System.out.println();
		
		System.out.println("--------------------------------------");
		this.method(); //여기서 this는 외부클래스 A를 의미한다.
		System.out.println("--------------------------------------");
//		D d = new D(); //로컬 클래스는 내부 클래스인데도 불구 하고 생성이 안된다.
		
	}
	
	//인스턴스 멤버 클래스-B
	class B{
		int a = 10;
		//static int cv = 20; //인스턴스 멤버 클래스는 인스턴스를 생성해야 호출 할 수 있기 때문에 정적멤버 static은 사용 불가능
		public B() {
			System.out.println("B 클래스의 생성자 호출");
		}
		public void method1() {
			System.out.println("B 클래스의 멤버 메서드 호출");
		}
		//static void method2() {}
	}
	
	//정적 멤버 클래스 C
	static class C {
		int a = 10;
		static int c = 20;
		
		public C() {
			System.out.println("정적 멤버 클래스 C의 생성자 호출");
		}
		
		public void method1() {
			System.out.println("정적 멤버 클래스 C의 (인스턴스)메서드1 호출");
		}
		public static void method2() {
			System.out.println("정적 멤버 클래스 C의  (정적)메서드2 호출");
		}
	}
	
	public void method() {
		//로컬 클래스 안에는 절대로 static 멤버가 못온다!!!
		class D{
			int a = 1000;
			public D() {
			System.out.println("로컬 클래스 D의 생성자 호출");	// TODO Auto-generated constructor stub
			}
			
			public void lmethod() {
				System.out.println(this.a); //여기서 this는 클래스 D이다.
				System.out.println("로컬 클래스 D의 멤버 메서드 호출");
			}
		}
		//로컬 클래스는 메서드 내부에서만 생성 및 사용이 가능하다.
		D d = new D();
		d.lmethod();
	}
	
	
	
	
}
