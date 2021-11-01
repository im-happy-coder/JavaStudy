package example02;

public class ReplaceEx {

	public static void main(String[] args) {


		//replace()는 문자열 대체하는 메서드이다.
		String oldstr = "자바는 객체지향 언어입니다.";
		String newstr = oldstr.replace("자바", "JAVA"); //자바라는 단어가 있으면  JAVA로 바꾼다. = replace()기능
		
		
		
		
		System.out.println(newstr.toString());
		
		
		System.out.println(oldstr.hashCode());  //hashcode로 주소를 확인하면 서로 다른 주소가 나온다
		System.out.println(newstr.hashCode());	//즉 , oldstr과 newstr은 서로 다른 주소를 가지는 인스턴스이다.
	}

}
