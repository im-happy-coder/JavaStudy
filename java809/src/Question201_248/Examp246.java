package Question201_248;

import java.util.Arrays;

class CheckClass {
public static int checkValue (String s1, String s2) {   //static이 붙었으므로 new 생성자는 사용할 수 없음
return s1.length() +s2.length();
}
}
public class Examp246 {

	public static void main(String[] args) {
		String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
		//line n1
		Arrays.sort(strArray, CheckClass :: checkValue);
		for (String s : strArray) {
		System.out.print (s + " ");
		}
		
//		Rat Cat Lion Tiger?
//				Which code fragment should be inserted at line n1 to enable the code to print
//		A. Arrays.sort(strArray, CheckClass : : checkValue);  -- 정답
//		B. Arrays.sort(strArray, (CheckClass : : new) : : checkValue);
//		C. Arrays.sort(strArray, (CheckClass : : new).checkValue);
//		D. Arrays.sort(strArray, CheckClass : : new : : checkValue);
	}

}
