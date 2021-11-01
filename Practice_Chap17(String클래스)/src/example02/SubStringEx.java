package example02;

public class SubStringEx {

	public static void main(String[] args) {

		String phoneNum = "01012347890";
		
		//subString()문자열을 잘라내어 다시 String으로 반환
		String str1 = phoneNum.substring(3); //010은 짤려서 나온다.
		System.out.println(str1);
		
		
		String str2 = phoneNum.substring(0, 3); //0부터 시작해서 3번째 인덱스까지 => 010만 나온다. //마지막 인덱스(3)은 미포함
		System.out.println(str2);
		
		
		System.out.println(str1.hashCode());  //str1과 str2는 서로다른 주소, 인스턴스이다.
		System.out.println(str2.hashCode());

	}

}
