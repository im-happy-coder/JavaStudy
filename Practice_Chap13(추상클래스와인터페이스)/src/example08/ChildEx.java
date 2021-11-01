package example08;

public class ChildEx {

	public static void main(String[] args) {
		//익명 자손 객체  (이름 없음) 근본이 클래스이다. ---- UI이벤트 처리나 스레드 객체 간편생성에 쓰인다.
			//그냥 잠깐 사용할 용도로 만드는 것이다
		Parent parent = new Parent() {   //Parent()생성자를 실행을 먼저한다.
			int b = 10;
			public void method1() {
				System.out.println("익명 자손 객체 메서드");
			}
			@Override
			public void method() {
				int a = 10;
				System.out.println("a : " + a);
				System.out.println(this.b);
				this.method1();
			}
		};
		parent.method();

	}

}
