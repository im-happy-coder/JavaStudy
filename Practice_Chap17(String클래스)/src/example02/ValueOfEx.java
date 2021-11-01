package example02;

public class ValueOfEx {

	public static void main(String[] args) {
		
		//valueOf()는 static정적 메서드이다.
		String str1 = String.valueOf(true);
		System.out.println(str1);
		
		//valueOf()메서드는 GUI프로그래밍에서 등장
		String str2 = String.valueOf(777.888);
		System.out.println(str2);
		
	}

}
