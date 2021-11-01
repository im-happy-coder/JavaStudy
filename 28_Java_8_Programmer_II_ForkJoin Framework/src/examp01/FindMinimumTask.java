package examp01;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.RecursiveTask;

public class FindMinimumTask extends RecursiveTask<Integer> {
	   //스레드는 5 가지 요소를 쉽게 처리 할 수 ​​있습니다.
	   private static final int SEQUENTIAL_THRESHOLD = 5;
	   // 숫자가있는 배열 (같은 배열을 많은 배열 생성을 피하기위한 모든 재귀 호출)
	   private int[] data;
	   // (하위) 작업이 시작되는 위치를 알려주는 색인
	   private int start;
	   //(하위) 작업이 끝나는 위치를 알려주는 색인
	   private int end;

	// compute ()는 매개 변수를 사용하지 않으므로
	// 작업의 생성자에 작업 할 데이터 전달
	   public FindMinimumTask(int[] data, int start, int end) {
	      this.data = data;
	      this.start = start;
	      this.end = end;
	   }
	   @Override
	// 반환 유형이 제네릭과 일치합니다.
	   protected Integer compute() {
	      int length = end - start;
	      if (length <= SEQUENTIAL_THRESHOLD) { // 기본 케이스
	    	  int min = computeMinimumDirectly();
	         return computeMinimumDirectly();
	      } else { // 재귀 케이스
	    	// 새로운 하위 작업 범위 계산
	         int mid = start + length / 2;
	         FindMinimumTask firstSubtask =
	            new FindMinimumTask(data, start, mid);
	         FindMinimumTask secondSubtask =
	            new FindMinimumTask(data, mid, end);
	         // 첫 번째 작업 대기열
	         firstSubtask.fork();
	         // 모든 하위 작업의 최소값을 반환합니다.
	         return Math.min(secondSubtask.compute(),
                     firstSubtask.join());
	      }
	   }
	   
//			/ ** 최소값을 찾는 방법 * /
	   private int computeMinimumDirectly() {
	      int min = Integer.MAX_VALUE;
	      for (int i = start; i < end; i++) {
	         if (data[i] < min) {
	            min = data[i];
	         }
	      }
	      return min;
	   }
//	   이 compute()방법은 (서브) 배열에 5 개 이하의 요소가있는 경우 기본 케이스를 정의하며,이 경우 최소값을 순차적으로 찾습니다. 
//	   그렇지 않으면 기본 케이스의 조건이 충족 될 때까지 배열이 반복적으로 두 개의 하위 배열로 분할됩니다.
//
//	   작업을 분할해도 하위 작업이 항상 균등하게 분산되는 것은 아닙니다. 그러나 이것을 간단하게 유지하기 위해 20 개의 요소가있는 클래스를 시도해 보겠습니다.
//	   이 클래스는 4 개의 세트로 나눌 가능성이 매우 높습니다.

	public static void main(String[] args) {
		 int[] data = new int[20];
		   Random random = new Random();
		   for (int i = 0; i < data.length; i++) {
		      data[i] = random.nextInt(1000);
		      System.out.print(data[i] + " ");
		      // 각 하위 배열을 한 줄로 인쇄합시다.
		      if( (i+1) % SEQUENTIAL_THRESHOLD == 0 ) {
		         System.out.println();
		      }
		   }
		   ForkJoinPool pool = new ForkJoinPool();
		   FindMinimumTask task =
		      new FindMinimumTask(data, 0, data.length);
		   pool.invoke(task);
		   //출력
//		   819 997 124 425 669 657 487 447 386 979 31 748 194 644 893 209 913 810 142 565
//		   Minimum value: 31
		   
//		   키 포인트
//		   Fork / Join 프레임 워크는 작은 작업으로 분할 할 수있는 큰 작업과 함께 작동하도록 설계되었습니다.
//		   이것은 재귀를 통해 이루어지며, 기본 사례를 충족 할 때까지 작업을 계속 분할합니다.이 작업은 직접 해결할 수있는 매우 간단한 작업 인 다음 모든 부분 결과를 결합하여 최종 결과를 계산합니다.
//		   문제를 나누는 것을 FORKING이라고하며 결과를 결합하는 것을 JOINING이라고합니다.
//		   Fork / Join 프레임 워크의 기본 클래스는 java.util.concurrent.ForkJoinPool이며 실제로 ExecutorService의 하위 클래스입니다.
//		   ExecutorService가 Runnable 또는 Callable로 표시되는 작업을 실행하는 것처럼 Fork / Join 프레임 워크에서 작업은 
//		   RecursiveAction (값을 반환하지 않음) 또는 RecursiveTask <V> (값을 반환하지 않음)의 하위 클래스로 표시됩니다. 값).
//		   그러나 ExecutorService가 사용하는 작업자 스레드와 달리 ForkJoinPool의 스레드는 작업 도용 알고리즘을 사용합니다. 
//		   즉, 스레드가 사용 가능할 때 다른 작업을 수행하는 데 여전히 바쁜 다른 스레드의 보류중인 작업을 훔칩니다.
//		   ForkJoinTask 객체에는 fork (), join () 및 compute ()의 세 가지 주요 메서드가 있습니다. 메서드를 호출하는 순서는 중요합니다.
//		   먼저 fork ()를 호출하여 첫 ​​번째 하위 작업을 큐에 넣은 다음 두 번째 하위 작업에서 compute ()를 호출하여 재귀 적으로 처리 한 다음 
//		   join ()을 호출하여 첫 ​​번째 하위 작업의 결과를 가져와야합니다.
		   
//		   순서 fork -> compute -> join
	}

}
