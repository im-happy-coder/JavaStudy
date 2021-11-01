package example04;

public class Outside {

	//외부 클래스 필드 선언
	String str = "Outside-Field";
	
	//멤버 메서드
	public void method() {
		System.out.println("Outsize-method()호출");
	}
	
	class Inner{
		//필드 선언
		String str = "Inner-Field";
		//멤버 메서드
		public void method() {
			System.out.println("Inner-method()호출");
		}
		//멤버 메서드
		public void showInfo() {
		
			System.out.println(this.str); //Inner의 this이다
			this.method(); // Inner의 method()호출
			
			System.out.println();
			
			//외부 클래스의 접근하는 방법
			//외부 클래스명.this.외부클래스멤버이름
			System.out.println(Outside.this.str); //Outside의 this이다
			Outside.this.method(); //Outside의 method()호출
			
			
		}
	}
	
	public void show() {
		//외부 클래스 영역에서의 this는 당연히 Outside클래스를 말한다.
		System.out.println("------외부-------");
		System.out.println(this.str);
		this.method();
		
		//외부에서 내부로 접근하는 방법  //외부클래스에서 내부 클래스로 접근을 할려면 보이지 않는다.
		//아래와 같이 인스턴스를 하나 생성해서 중첩클래스의 멤버들에게 접근을 하면 된다.
		System.out.println("------외부에서 내부 출력-------");
		Inner in = new Inner();
		System.out.println(in.str);
		in.showInfo();
	}

}
