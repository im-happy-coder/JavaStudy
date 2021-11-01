package example02;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public class Calculator {
	
	//인스턴스 메서드
	//인스턴의 특징 : new연산자로 인스턴스를 생성해야지만, 참조변수명.인스턴스메서드명 접근가능
	public int add(int x, int y) {
		int result = x + y;
		double dresult = Calculator.divide(10.5, 11.7);
		System.out.println("dresult : " + dresult);
		return result;
//		return x + y;  //위의 두줄을 한줄로 이와 같이 줄일 수 있다.
	}
	//인스턴스 메서드
	public int substract(int x, int y) {
		return x - y;
	}
	
	//static(정적)메서드
	//static의 특성 : 인스턴스 생성 없이 클래스명.정적메서드명으로 바로 접근이 가능하다.
	public static long multiply(long x, long y) {
		//static메서드는 이미 메모리 상단에 올라가 있고 인스턴스 생성없이 접근이 가능해야되는데
		//아래코드는 인스턴스가  생성되어야지만 사용가능한 add()가 왔기 때문에 예외가 발생하는 것이다.
		//인스턴스가 언제 생성될지 아무도 모르기 때문에 static메서드 안에는 인스턴스메서드가 
		//절대로 오면 안된다.
		//this.add(10,5); 
		return x * y;
	}
	//static(정적)메서드
	public static double divide(double x, double y) {
		return x / y;
	}

}
