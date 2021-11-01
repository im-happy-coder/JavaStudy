package example01;

//A클래스는 아무런 생성자가 존재하지 않으므로,
//컴파일시에 컴파일러가 알아서 기본 생성자를 추가해준다.
class A {
	int value;
}

class B {
	int value;
//	public B() {	
//	}
	public B(int value) { //매개변수 생성자
		this.value = value;
	}
}

public class ConstructorEx { //public 클래스는 단 하나만 가능하다

	public static void main(String[] args) {
		
		A a = new A(); //컴파일러가 기본 생성자를 만들어주니까 상관없다
		
		//컴파일 예외를 잡는 방법
		//1. B클래스에 기본생성자를 추가
		//2. B클래스 생성자 호출시 매개변수 값으로 int값을 지정을 해주면 된다.
//		B b = new B(); 
		B b = new B(100);

	}

}
