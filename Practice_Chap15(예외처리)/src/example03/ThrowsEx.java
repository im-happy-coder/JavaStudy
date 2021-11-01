package example03;

public class ThrowsEx {
												//public static void main(String[] args) thows Exception { 
	public static void main(String[] args) {    //main 메서드도 떠넘길 수 있다. -> main은 JVM에게 예외를 던진다.
		//thows 예외를 떠넘기다.  //thow 강제로 예외 발생시킨다.
		
		
		//main에서 method1을 호출하고 있으니 여기서 예외처리를 해야한다.!!!
		try {
			method1();
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}

	}
	//Throws는 메서드 선언부 끝에 작성을 하며, 호출한 곳으로 예외를 되던지며,
	//호출한 곳에서 예외를 반드시 처리해야한다.
	public static void method1() throws Exception {    //method1의 예외는 던져저서  호출한 코드 main으로 넘어간다.
		method2();
	}
	
	public static void method2() throws Exception {    // method2의 예외는 method1으로  던지고
		System.out.println(10/0); //산술예외(실행예외)발생
	}
}
