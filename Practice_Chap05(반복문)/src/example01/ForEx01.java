package example01;

public class ForEx01 {

	public static void main(String[] args) {
		
		int sum = 0;
		//1~100까지의 합을 구하는 반복문
		//싱글루프일때...
		//int i=1 -> 초기화 코드(최초 1번만 실행)
		//i<=100 -> 조건식 (참이여야지만, 실행블럭을 실행)
		//i++ -> 증감식
		for(int i=1; i<=100; i++) {
			sum += i;
			//System.out.println("sum : " + sum);
		}
		System.out.println("1~100까지의 합 : " + sum);
	}

}
