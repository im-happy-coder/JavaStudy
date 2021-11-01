package Question1_120;

public class Examp06 {
	public static void main(String[] args) {
		int a = 10;
		int b = -1;
		assert (b >=1) : "Invalid Denominator";  //false이면  "Invalid Denominator"를 출력하고  true이면 a/b의 결과가 c로 출력된다.
		int c = a / b;
		System.out.println (c);
		
		
	
		
		
//		asesert를 사용하기 위해서는 Run-Configurations-VM arguments안에 -ea 옵션을 주어야 한다.
		//답 : AssertionError Invalid Denominator
//		-da = -ea옵션을 끔
	}
}
