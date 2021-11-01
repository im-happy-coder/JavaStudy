package Question1_120;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

class Sum extends RecursiveAction { 
	//line n1 
	static final int THRESHOLD_SIZE = 3; int stIndex, lstIndex; int [ ] data;  //THRESHOLD_SIZE 쓰레드의 갯수
	public Sum (int [ ]data, int start, int end) { 
		this.data = data; this.stIndex = start; this. lstIndex = end;
}
	
protected void compute ( ) {  //RecursiveAction의 추상메서드 꼭 구현해야한다.
	int sum = 0;
	if (lstIndex - stIndex <= THRESHOLD_SIZE) {
		for (int i = stIndex; i < lstIndex; i++) {
		sum += data [i];
		}
	System.out.println(sum);
	} else {
	new Sum (data, stIndex + THRESHOLD_SIZE, lstIndex).fork( );  //fork()를 호출하여 다른 쓰레드에서 작업이 처리되도록 합니다.
	new Sum (data, stIndex,Math.min(lstIndex, stIndex + THRESHOLD_SIZE)).compute(); //결과값을 반환
		}
	}
}
public class Examp09 {

	public static void main(String[] args) {
		ForkJoinPool fjPool = new ForkJoinPool ( );
		int data [ ] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		fjPool.invoke (new Sum (data, 0, data.length));//recursiveTask.invoke가 호출되면 관리되는 스레드 풀 방식으로 exec와 compute가 호출됩니다.
		
		
//		답 : A. The program prints several values that total 55. 
//		 	프로그램은 총 55개의 값을 출력합니다.
	}

}
