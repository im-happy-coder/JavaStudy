package example02;

public class BitOperatorEx {

	public static void main(String[] args) {

		//& | ^ 3개를 비트 연산자라고 한다
		
		int x = -8;
		int y = -5;
		
		System.out.println("x를 2진수로 변환 결과  : " + Integer.toBinaryString(x));
		System.out.println("y를 2진수로 변환 결과  : " + Integer.toBinaryString(y));

		//AND연산은 둘다 1일때만 1을 준다
		//OR연산은 하나라도 1이면 1을 준다.
		//XOR(exclusive or)베타적논리합 : 서로 다를때 1을 준다.
		System.out.println("x와 y를 비트 &(AND)연산결과 : " + (x & y));
		System.out.println("x와 y를 비트 |(OR)연산결과 : " + (x | y));
		System.out.println("x와 y를 베타적논리합 ^(XOR)연산결과 : " + (x ^ y));
	}

}
