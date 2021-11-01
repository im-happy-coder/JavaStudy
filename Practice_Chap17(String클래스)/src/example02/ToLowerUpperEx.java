package example02;

public class ToLowerUpperEx {

	public static void main(String[] args) {
		
		String str1 = "Java Programming";
		String str2 = "JAVA Programming";
		
		
		System.out.println("대문자 : " + str1.toUpperCase());
		System.out.println("소문자 : " + str1.toLowerCase());
		
		
		System.out.println(str1.equals(str2));
		
		//대소문자를 구별하지 않고 비교를 하고자 한다면, equalsIgnoreCase()
		//사용을 하시면 된다.
		System.out.println(str1.equalsIgnoreCase(str2)); //equalsIgnoreCase()메서드는 대소문자를 구별하지 않고 값 비교를 하는 메서드이다.
	}

}
