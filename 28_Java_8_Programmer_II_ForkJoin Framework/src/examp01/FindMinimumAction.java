package examp01;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class FindMinimumAction extends RecursiveAction {
	   // A thread can easily handle, let's say, five elements
	   private static final int SEQUENTIAL_THRESHOLD = 5;
	   // The array with the numbers (we'll pass the same array in
	   // every recursive call to avoid creating a lot of arrays)
	   private int[] data;
	   // The index that tells use where a (sub)task starts
	   private int start;
	   // The index that tells use where a (sub)task ends
	   private int end;

	   // Since compute() doesn't take parameters, you have to
	   // pass in the task's constructor the data to work
	   public FindMinimumAction(int[] data, int start, int end) {
	      this.data = data;
	      this.start = start;
	      this.end = end;
	   }
	   @Override
	   protected void compute() {
	      int length = end - start;
	      if (length <= SEQUENTIAL_THRESHOLD) { // base case
	         int min = computeMinimumDirectly();
	         System.out.println("Minimum of this subarray: "+ min);
	      } else { // recursive case
	         // Calcuate new subtasks range
	         int mid = start + length / 2;
	         FindMinimumAction firstSubtask =
	            new FindMinimumAction(data, start, mid);
	         FindMinimumAction secondSubtask =
	            new FindMinimumAction(data, mid, end);
	         firstSubtask.fork(); // queue the first task
	         secondSubtask.compute(); // compute the second task
	         firstSubtask.join(); // wait for the first task result
	      }
	   }
	   /** Method that find the minimum value */
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
		      // Let's print each subarray in a line
		      if( (i+1) % SEQUENTIAL_THRESHOLD == 0 ) {
		         System.out.println();
		      }
		   }
		   ForkJoinPool pool = new ForkJoinPool();
		   FindMinimumAction task =
		      new FindMinimumAction(data, 0, data.length);
		   pool.invoke(task);
		   
		   //출력
//		   885 839 486 27 612 
//		   656 972 375 44 164 
//		   445 817 951 277 219 
//		   316 634 318 365 175 
//		   Minimum of this subarray: 175
//		   Minimum of this subarray: 219
//		   Minimum of this subarray: 27
//		   Minimum of this subarray: 44

//		   풀을 명시 적으로 종료 할 필요가 없습니다. 프로그램이 종료되면 풀이 종료되어 재사용 할 수 있습니다.
//
//		   또한 값을 반환하지 않지만 fork (), compute () 및 join () 메서드를 호출하는 것과 동일한 작업을 수행하는 invokeAll () 메서드도 있습니다. 
//		   따라서 다음과 같은 것을 갖는 대신 :
//		   ...
//		   FindMinimumAction firstSubtask =
//		      new FindMinimumAction(data, start, mid);
//		   FindMinimumAction secondSubtask =
//		      new FindMinimumAction(data, mid, end);
//		   // queue the first task
//		   firstSubtask.fork();
//		   // compute the second task
//		   secondSubtask.compute();
//		   // wait for the first task result
//		   firstSubtask.join();
//		   ...
//		      아래 코드는 더 단순하게 만든 것
//
//		   ...
//		   FindMinimumAction firstSubtask =
//		      new FindMinimumAction(data, start, mid);
//		   FindMinimumAction secondSubtask =
//		      new FindMinimumAction(data, mid, end);
//		   invokeAll(firstSubtask, secondSubtask);
//		   ...
		   
//		   이제 모든 최소값을 반환 할 수 있도록 RecursiveTask를 사용하도록이 예제를 변경해 보겠습니다.
//
//		   실제로 우리가해야 할 유일한 변경 사항은 compute () 메서드입니다.
//		   class FindMinimumTask extends RecursiveTask<Integer> {
//			   // ...
//			   @Override
//			   //Return type matches the generic
//			   protected Integer compute() {
//			      int length = end - start;
//			      if (length <= SEQUENTIAL_THRESHOLD) { // base case
//			         return computeMinimumDirectly();
//			      } else { // recursive case
//			         // Calcuate new subtasks range
//			         int mid = start + length / 2;
//			         FindMinimumTask firstSubtask =
//			            new FindMinimumTask(data, start, mid);
//			         FindMinimumTask secondSubtask =
//			            new FindMinimumTask(data, mid, end);
//			         // queue the first task
//			         firstSubtask.fork();
//			         // Return the miminum of all subtasks
//			         return Math.min(secondSubtask.compute(),
//			                         firstSubtask.join());
//			      }
//			   }
//			   // ...
//			}
		   
//		   main () 메서드에서 유일한 변경 사항은 pool.invoke (task)가 반환하는 값과 약간의 형식을 출력에 인쇄하는 것입니다.
		   //출력
//		   819 997 124 425 669 657 487 447 386 979 31 748 194 644 893 209 913 810 142 565
//		   Minimum value: 31
//		   FindMinimumTask 클래스에 보셈
	}

}
