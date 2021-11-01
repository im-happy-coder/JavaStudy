package example03;

public class MethodEx {
	
	
	//메서드의 선언부 구성  - int add (int x, int y) 가 선언부
	//1. 리턴타입(반환값) : int
	//2. 메서드명 : add
	//3. () : 매개변수, 인자값, Arguments 
	//메서드 선언부 중요도(98%), 메서드 구현부(정의부)
	public static int add(int x, int y, int z1) {
//		int temp = 0;
//		temp = x + y + z1;
		System.out.println("add메서드 호출됨");
		return x + y + z1;
	}
	
	
	
	
	public static int minus(int x1, int y1) {
		System.out.println("minus메서드 호출됨");
		return x1 - y1;
	}
	
	public static int multiply(int x2, int y2) {
		return x2 * y2;
	}
	
	public static int divide(int x3, int y3) {
		return x3 / y3;
	}
	//multiply(곱셈), divide(나눗셈)
	
	
	
	
	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 30;
		
		//값에 의한 복사(Call by Value)
		int result = add(num1, num2, 100); //add라는 메서드
		System.out.println("num1 + num2 : " + result);
		
		
		//값에 의한 복사(Call by Value)
		result = minus(num1, num2);
		System.out.println("num1 - num2 : " + result);
		
		//값에 의한 복사(Call by Value)
		result = multiply(num1, num2);
		System.out.println("num1 * num2 : " + result);
		
		//값에 의한 복사(Call by Value)
		result = divide(num1, num2);
		System.out.println("num1 / num2 : " + result);
		
	}

}
