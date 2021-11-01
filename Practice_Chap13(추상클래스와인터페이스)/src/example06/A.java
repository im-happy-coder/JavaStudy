package example06;

public class A {
	//B클래스가 만들어져야만 컴파일 예외가 사라진다.
	//B클래스가 A클래스에게 직접적으로 영향을 끼친다.
//	public void method(B b) {
//		b.method();
//	}
	
	
	
	//인터페이스로 이용하는 방법
	//사용하는 측에서 인터페이스를 보고 사용함
	public void method(I i) {
		i.method();
	}
}
