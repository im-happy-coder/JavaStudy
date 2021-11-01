package example02;

import java.util.Scanner;

public class SecondArrayEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] student; //2차원 배열을 선언
		int count = 0, num = 0, sum = 0, total = 0; //반수, 인원, 합계, 계
		double avg = 0.0;
		double avgTotal = 0.0;
		
		System.out.print("반수 입력 : ");
		count = sc.nextInt();
		student = new int[count][]; //반의 갯수를 1차원배열로 할당(힙)
//		System.out.println("2차원 배열주소 : " + student);
//		System.out.println("1차원 배열방 크기 : " + student.length);
		for(int i=0; i<student.length; i++) {
			System.out.printf("%d반에 인원 : ",i+1);
			num = sc.nextInt(); //반의 인원 받는다
			student[i] = new int[num];
			
			for(int j=0; j<student[i].length;j++) {
				System.out.printf("%d반의 %d번의 점수 : ", (i+1), (j+1) );
				student[i][j] = sc.nextInt(); //실제 반인원의 점수를 받는다.
			}
			System.out.println();
		}
		System.out.println("반\t합계\t평균\t");
		System.out.println("-----------------------------------------");
		
		for(int i=0; i<student.length;i++) {
			sum = 0; //반의 합계를 초기화 
			for(int j=0; j<student[i].length; j++) {
				sum += student[i][j]; //반별 합계
			}
			total += sum; //총합계
			avg = (double)sum / student[i].length; //반 평균
			avgTotal += avg;  //반 평균의 합
			System.out.printf("%d반\t%d\t%.1f\n", i+1, sum, avg);
		}
		
		avgTotal = avgTotal / student.length; //학년의 총 평균
		System.out.printf("계\t%d\t%.1f\n", total, avgTotal);		
		
		sc.close();
		//점수가 제대로 입력되었는지 확인하는 코드
//		for(int i=0; i<student.length; i++) {
//			for(int j=0; j<student[i].length; j++) {
//				System.out.println(student[i][j]);
//			}
//		}
		

	}

}
