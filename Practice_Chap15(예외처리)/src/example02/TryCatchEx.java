package example02;

public class TryCatchEx {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(2/0); //ArithmeticException 발생
			System.out.println(5); //5는 출력이 안된다. 왜? 위에서 예외가 터졌기 때문에.
		}catch (ArithmeticException e) {
			System.out.println(6);
		}
		System.out.println(7);
	}

}
