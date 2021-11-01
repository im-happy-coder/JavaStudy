package example03;

public class SpliEx {

	public static void main(String[] args) {
		
		String str1 = "사랑해,너를/교촌치킨&양념치킨,순살치킨";
		
		//정규표현식(,?/!@$%^ 등)
		//spli() : 매개변수로 정규표현식이 온다. 리턴타입은 정규표현식 구분되어진
		//String[]로 리턴한다.
		String[] strArr = str1.split(",|/|&"); // 문자열에서 |는  -> or (~이거나) 개념
		for(String str : strArr)
			System.out.println(str);
	}

}
