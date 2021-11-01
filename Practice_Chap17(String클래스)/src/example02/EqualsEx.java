package example02;

public class EqualsEx {

	public static void main(String[] args) {

		String str1 = new String("홍길동");
		String str2 = "홍길동"; //리터럴타입으로 스트링에 대입하고 있다, 똑같이 인스턴스 생성한다.
		String str3 = "홍길동"; // str2와 str3는 같은 인스턴스를 참조한다.

		// ==는 연산자가 주소비교하는 연산자이다
		if(str1 == str2) {
			System.out.println("같은 번지의 인스턴스");
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		
		//같은 리터럴의 경우에는 같은 번지를 참조한다.
		if(str2 == str3) {
			System.out.println("같은 번지의 인스턴스");
		}
		else {
			System.out.println("다른 번지의 인스턴스");
		}
		
		//String의 equals()는 값비교이다(Object클래스의 equals()는오버라이딩해놨다.)
		if(str1.equals(str2)) {
			System.out.println("str1과 str2는 값이 같은 문자열입니다.");
		}
		else {
			System.out.println("str1과 str2는 값이 다른 문자열입니다.");
		}
		
		if(str2.equals(str3)) {
			System.out.println("str2과 str3는 값이 같은 문자열입니다.");
		}
		else {
			System.out.println("str2과 str3는 값이 다른 문자열입니다.");
		}
	}	

}
