package example01;

public class DenyEx {

	public static void main(String[] args) {
		
		// ! 논리 부정 연산자 연습 = not 연산자 --> 반대값을 취하게 하는 연산자.
		boolean power = false; //boolean 1바이트
		System.out.println("power의 값은 : " + power);
		
		power = !power;
		System.out.println("power의 값은 : " + power);
		
		power = !power;
		System.out.println("power의 값은 : " + power);
		
//		if(power) {
//			System.out.println("if문 실행됨");
//		}
	}

}
