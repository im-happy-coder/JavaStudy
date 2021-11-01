package example01;

public class ForEx02 {

	public static void main(String[] args) {

		int sum = 0;
		int temp = 0;
		
		//디버깅 : debug창으로 의도치 않게 넘어갔다면, 프로그램에 문제
		//발생한 것으로 에러를 잡아나가는 과정을 디버깅이라고 합니다.
		//breakPoint,TogglePoint(종단점)설정 후, 실행 시키면 F8를 누르면서 한단계식
		//진행시켜나가면서 변수의 값들을 살펴나가면 에러를 쉽게 잡을 수 있다.
		
		//누적합계가 2000이상일 때 i의 값을 출력하시오
		for(int i=1; i<=100; i++) {
			sum += i;
			if(sum >= 2000) {
				temp = i;
				break;
			}
			//System.out.println("sum : " + sum);
		}
		System.out.println("2000이상일 때 sum의 값  : " + sum);
		System.out.println("2000이상일 때 i의 값  : " + temp);
	}

}
