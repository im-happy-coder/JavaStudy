package example04;

public class Parent {

	int x = 100;
	
	//매개변수에 타입이 Object라는 것은
	//어떠한 클래스도 다 매개변수로 받아주겠다는 것이다.
	public void type(Object obj) {
		if(obj instanceof Parent) {
			Parent parent = (Parent)obj;  //형변환 (조상Object->자손(Parent)) 다운 캐스팅(형변환 코드를 써줘야함) 
										  //업캐스팅도 형변환코드를 써줘도 됨 (생략도 됨)
			System.out.println("조상클래스의 멤버 x값 "+ this.x);
		}
		else {
			System.out.println("상속관계에 있지 않은 클래스입니다.");
		}
		
	}
	
	public void method() {
		System.out.println("조상 메서드 호출");
	}
}
