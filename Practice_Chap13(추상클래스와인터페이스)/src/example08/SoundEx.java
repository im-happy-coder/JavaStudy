package example08;

public class SoundEx {

	public static void main(String[] args) {
		//익명 구현 객체( 이름 없음 ) 근본이 인터페이스이다. ---- UI이벤트 처리나 스레드 객체 간편생성에 쓰인다.
		Soundable soundable = new Soundable() { //타입(근본)이 인터페이스이기 때문에  익명구현객체가 된다.
			//내부적으로 클래스니깐 멤버들을 선언 할 수 있습니다 .(양념을 쳐줌)
			//하지만 외부에서는 접근 불가다 . 왜? 근본이 먼가?
			int a = 10;
			public void method() {
				System.out.println("익명 구현 객체 메서드");
			}
		
			@Override
			public void sound() {
				String str = "냄비";
				System.out.println("첫 번째 익명 구현 객체 :  " + str );
				System.out.println(str + "에 물을 담습니다.");
				System.out.println(str + "에 숟가락으로 탕탕합니다.");
				this.method();
				System.out.println(this.a);
			}
		};
		
		soundable.sound();
		
		
		System.out.println();
		
		
		
		
		
		Soundable soundable1 = new Soundable() { //타입(근본)이 인터페이스이기 때문에  익명구현객체가 된다.
			//내부적으로 클래스니깐 멤버들을 선언 할 수 있습니다 .(양념을 쳐줌)
			//하지만 외부에서는 접근 불가다 . 왜? 근본이 먼가?
			int a = 20;
			public void method() {
				System.out.println("익명 구현 객체 메서드");
			}
		
			@Override
			public void sound() {
				String str = "밥그릇";
				System.out.println("두 번째 익명 구현 객체 :  " + str );
				System.out.println(str + "에 물을 담습니다.");
				System.out.println(str + "에 숟가락으로 탕탕합니다.");
				this.method();
				System.out.println(this.a);
			}
		};
		
		soundable1.sound();
	}

}
