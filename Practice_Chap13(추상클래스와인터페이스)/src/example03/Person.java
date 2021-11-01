package example03;

public class Person implements A{

	@Override
	public void method() {
		System.out.println("인터페이스 A를 구현한 Person클래스 입니다.");
		
	}

	//자체메서드
	
	public void method1() {
		System.out.println("Person클래스의 메서드 입니다.");
	}
}
