package Question1_120;

import java.util.Arrays;

class CheckClass {
public static int checkValue (String s1, String s2) {
//return s1.length() + s2.length();  //문제가 잘못 나온듯
return Integer.compare(s1.length(), s2.length()); // 이게 맞음
}
}
public class Examp75 {

	public static void main(String[] args) {
		String[] strArray = new String [] {"Tiger", "Rat", "Cat", "Lion"};
		Arrays.sort(strArray, CheckClass :: checkValue);//line n1
		for (String s : strArray) {
		System.out.print (s + " ");
		
//		답 : Arrays.sort(strArray, CheckClass :: checkValue);
		}
	}

}
