package example01;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.nextLine();
		System.out.println(str);
		
//		byte[] b1 = str.getBytes();       //byte값으로 받으면 아스키코드 값으로 받는다고 생각하면 된다.
		char[] ch = str.toCharArray();    //문자는 한글같은 경우는 toCharArray()로 받는다
//		System.out.println(Arrays.toString(b1)); //입력한 값은 아스키코드로 출력 //한글은 2바이트이므로 2개씩 나옴
		
		System.out.println(ch.length);
		for(int i=0; i<ch.length; i++) {
			System.out.println(ch[i]);
		}
		
		
		
		sc.close();

	}

}
