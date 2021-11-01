package example01;

public class VarEx01 {

	public static void main(String[] args) {
	

		
		char ch = 'A';
		int year = 0; //기본형 변수
		int age = 42;
		//아래코드는 L는 long타입을 지정하기 위해서 접미사 L,l를 붙였다. 8바이트
		long result = 10L;
		//아래코드는 f는 float를 지정하기 위해서 접미사 F,f를 붙였다. 4바이트
		float result2 = 10.1f;
		double d = 9.999;
		
		
		
		//sys를 치시고 ctrl + space를 누르면 자동오나성 기능이 실행된다.
		//인텔리전스 기능
		
		System.out.println("ch : " + ch);
		System.out.println("long 타입 출력 : " + result);
		System.out.println(result2);
		System.out.println(d);
		System.out.println(year + age);
		
		
		String str = new String("자바"); //참조형 변수
		System.out.println(str + "를 공부합니다.");
		System.out.println(str.toString());
		
		//사용자정의클래스이거나 toString()재정의를 하지 않은
		//클래스의 참조변수는 출력을 하게 되면, 클래스타입@16진수(주소)
		//나온다.
		Object obj1 = new Object();
		System.out.println(obj1 + "자바");
	}

}
