package example03;

public class ReverseEx {

	public static void main(String[] args) {

		String str = "안녕하세요";
		String reverse = "";
		int count = 0;
		
		String r = reverseString(str);
		System.out.println("reverseString()호출 후 : " +  r);
		
		
		//구버젼 역순 출력방식 - 메모리 낭비 - 애는 힙에서 논다.
		count = str.length();
		System.out.println("문자열의 길이 : " + count);
		
		for(int i=0; i<count; i++) {
			reverse += str.charAt(count - (i+1));
			System.out.println(reverse);
			System.out.println(reverse.hashCode());
		}
		System.out.println("역순 출력 : " + reverse);

	}
	
	//신버젼 최근 역순 출력 방식 - 애는 버퍼에서 작동한다 - 즉 빠르다
	public static String reverseString(String str) {
		return new StringBuilder(str).reverse().toString();
	}

}
