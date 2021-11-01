package example07;

public class Person implements MyInterface {

	@Override
	public void method() {
		System.out.println(MyInterface.MAX_NUM); //상수 호출방법 -> 인터페이스명.상수명
		System.out.println("MyInterface를 구현한 Person클래스의 매서드 호출");
		
	}
	
	//필요해 의하면 오버라이딩해서 호출하라 = 디폴트메서드
	//구현클래스들에게 전혀 영향을 끼치지 않고, 디폴트메서드가 필요한 구현클래스에서만 오버라이딩 해서 사용하면 된다.
	@Override
	public void dmethod() {
		System.out.println("MyInterface의 디폴트메서드 오버라이딩함.");
	}
	
	

}
