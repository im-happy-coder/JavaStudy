package example01;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		//Ctrl + shift + O  자동 import
		//Scanner 클래스는 입력을 받기 위한 클래스이고 입력스트림이다, println은 출력스트림
		//자원(Resource)은 사용하고 나서 반드시 닫아줘야 된다. 
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 한자리를 입력 : ");  //print는 줄바꿈x println은 줄바꿈o
		int num = sc.nextInt();
		System.out.println("사용자로부터 입력받은 숫자 : " + num);
		
		System.out.print("실수 한자리를 입력 : ");  
		double dnum = sc.nextDouble();
		System.out.println("사용자로부터 입력받은 숫자 : " + dnum);
		
// 드래그 + Ctrl + / = 드래그한 범위 주석처리됨
		
		System.out.print("문자열을 입력 : "); 
		//next()는 공백을 기준으로 해서 문자를 입력--단어를 입력
		// String str = sc.next();
		
		//nextLine()는 공백이 아니라 엔터키를 입력할때까지   문자를 입력--단어를 입력
		String str = sc.nextLine();
		System.out.println("사용자로부터 입력받은 문자열 : " + str);
		
		
		int result = 100;
		String num1 = sc.nextLine();
		//Integer.parseInt()역할은 문자열로 입력받은 숫자들을 문자열이 아니라 숫자로 바꾸어주는 역할을 하는 메서드
		int temp = Integer.parseInt(num1);
		int total = result + temp;
		System.out.println("연산결과 : " + total);
		
		sc.close();
		

	}

}
