package sec01.example03;

import java.util.function.Supplier;

public class LamdaEx {

	public static void main(String[] args) {
		
		MyInterface myInterface = null;
		
		myInterface = (x,y) ->{
			int reuslt = x+y;
			return reuslt;
		};
		int result = myInterface.method(100, 200);
		System.out.println("매개변수 2개와 리턴값이 있는 람다식의 값 : "  + result);
		
		
		
		
		myInterface = (x,y) ->{return x+y;};
		result = myInterface.method(300, 200);
		System.out.println("코드를 줄인 람다식의 값 : "  + result);
		
		
		
		
		//return을 생략가능하고 return생략하니 문장이 하나라서 {}도 생략이 가능하다.
		myInterface = (x,y) -> x+y;
		result = myInterface.method(1000, 200);
		System.out.println("return과{}를 생략한 람다식의 값 : "  + result);
		
		
		
		//메서드 호출시 매개값으로 x,y가 넘어간다.
		myInterface = (x,y) -> add(x, y);
		result = myInterface.method(700, 200);
		System.out.println("add메서드 호출 후 람다식의 값 : "  + result);
		
		
		
	}
	public static int add(int x, int y) {
		return x+y;
	}

}
