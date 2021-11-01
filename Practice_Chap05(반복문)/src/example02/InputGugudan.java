package example02;

import java.util.Scanner;

public class InputGugudan {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("구구단을 출력합니다.");
		System.out.print("몇 단부터 출력할까요 : ");
		int start = sc.nextInt();
		
		System.out.print("끝단은 얼마인가요 : ");
		int end = sc.nextInt();
		
		//System.out.println(start + " " +end);
		
		for(;start<end; start++) {
			System.out.println("*****" + start + "단*****");
			for(int j=1; j<10; j++ ) {
				System.out.println(start + "*" + j + "=" + (start*j));
			}
		}
		
		
		
		//무한루프 for문보다는 while(true)가 좋다
//		for(;;) {
//			System.out.println("-----");
//		}
//		
		sc.close();
		

	}

}
