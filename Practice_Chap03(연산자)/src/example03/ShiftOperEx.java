package example03;

public class ShiftOperEx {

	public static void main(String[] args) {

		
		int a = 8;
		int b = 2;
		
		//shift연산은 그래픽 분야에서 많이 사용된다.
		//이유: 고속처리
		System.out.println("8 << 2 : " + (a << b)); // << left쉬프트연산 x * 2의 n승
		System.out.println("8 >> 2 : " + (a >> b)); // >> right쉬프트연산 x / 2의 n승
	}

}
