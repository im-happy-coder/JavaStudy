package sec01.example01;

public class LamdaEx {

	public static void main(String[] args) {
		
		
		//람다식을 이용해서 익명 구현 객체를 생성하고 있다.
		//()는 매개변수가 들어가며, 매개변수가 없으면 ()괄호를 쳐주고   {}안에는 추상메서드인 method()의 구현부가 들어가야 하며,
		//여기서 2줄이기 때문에 {}를 생략 할 수가없다.
		MyInterface myInterface = () -> {  
			String str = "람다식으로 만든 익명 구현 객체입니다.";
			System.out.println(str);
		}; 
		myInterface.method();
		
		
		
		//직접 익명 구현 객체를 만드는 것이다.
		MyInterface myInterface2 = new MyInterface() {
			@Override
			public void method() {
				String str = "람다식으로 만든 익명 구현 객체입니다.";
				System.out.println(str);
			}
		};
		
		myInterface2.method();
		
		myInterface = () -> {System.out.println("람다식으로 만든 익명 구현 객체111");};
		myInterface.method();
		
		
		//실행문이 하나일 경우에는 {}는 생략 가능하다.
		myInterface = () -> System.out.println("람다식으로 만든 익명 구현 객체222");
		myInterface.method();
		
		//결론 : 익명구현객체를 생성시에 코드의 절감으로 람다식을 사용 할수가 있다.
		
		
	}

}
