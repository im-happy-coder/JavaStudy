package examp03;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableFuture {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		/*
		 * public interface Runnable {  //반환형이 없음
		 * void run();
		 * };
		 * 
		 * 
		 * @functionalInterface
		 * public interface Callable<V> {    반환형이 존재함
		 * 	V call() throws Exception;
		 * }
		 * 
		 * 
		 */
		
		
		
		
		Callable<Integer> task = () -> {
			int sum =0;
			for(int i=0; i<10; i++)
				sum += i;
			return sum;
		};
		
		ExecutorService exr = Executors.newSingleThreadExecutor();
		Future<Integer> fur = exr.submit(task); //submit(값을 제출)하면 Integer형으로 받아줘야함(Future)
		
		Integer r = fur.get(); //Future로 받은 값을 get()으로 쓰레드의 반환 값 획득
		System.out.println("Result : " + r);
		exr.shutdown();
		
		
		
		
		
	}

}
