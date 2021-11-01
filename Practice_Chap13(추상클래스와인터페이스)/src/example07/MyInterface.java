package example07;

public interface MyInterface {

	int MAX_NUM = 100; //static final 상수
	public void method(); //추상 메서드 선언(본질)
	
	//default메서드는 접근제어자 default 무조건 써줘야한다.
	//JDK 1.8부터 추가된 멤버
	default void dmethod() {
		System.out.println("MyInterface의 디폴트메서드 호출");
	};
	static void smethod() {
		System.out.println("MyInterface의 정적메서드 호출");
	};
	
}
