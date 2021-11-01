package Question1_120;

import java.util.function.UnaryOperator;

public class FExamp101 {

	public static void main(String[] args) {
		final String str1= "Java";
		StringBuffer strBuf = new StringBuffer("Course"); 
//		String strBuf = new String("Course");// 이걸 사용하면 답이 : Javacourse
		UnaryOperator<String> u = (str2) -> str1.concat(str2); //line n1    Java와 Course를 연결함.
		UnaryOperator<String> c = (str3) -> str3.toLowerCase();  //str3는 Course가  소문자로 나옴
		System.out.println(u.apply(c.apply(strBuf)));  //line n2  

	}

}

//답 :D. A compilation error occurs at line n2.