package example03;

import java.util.Arrays;

public class StringArrayEx {

	public static void main(String[] args) {
		//String 배열
//		String str = new String("자바");
//		System.out.println(str.toString());
		//객체(클래스)배열 -- 2차원 배열 (하지만 더블루프는 사용하지 않아도됨)
		String[] str = new String[] {
										"안녕", "홍길동", "김연아"
									};
		for(int i=0; i<str.length; i++) {
			System.out.println(str[i]);  //내부루프는 필요없다
		}
		
		
		str[0] = "가자";
		
		//향상된 for문
		for ( String str1 : str) {
			System.out.println(str1);
		}
		
		
		
		
//		System.out.println(Arrays.toString(str));
//		System.out.println("String배열의 주소 : " + str.toString());
		//Object클래스는 모든 클래스의 최고조상
		//String클래스는 Object클래스의 toString()오버라이딩(재정의)
//		System.out.println("String배열의 주소 : " + str[0].toString());
	}

}
