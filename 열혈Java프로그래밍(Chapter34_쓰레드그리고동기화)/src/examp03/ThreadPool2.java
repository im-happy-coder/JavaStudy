package examp03;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool2 {

	public static void main(String[] args) {
		
//		쓰레드 풀 기반의 예제 2
		
		Runnable task1 = () -> { //쓰레드에게 시킬 작업
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (5 + 7));
		};
		Runnable task2 = () -> { //쓰레드에게 시킬 작업
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (7 - 5));
		};
		
		ExecutorService exr = Executors.newFixedThreadPool(2); //
		exr.submit(task1); //쓰레드 풀에 작업을 전달
		exr.submit(task2);
		exr.submit( () -> {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (5 * 7));
		});
		
		exr.shutdown(); //쓰레드 풀과 그 안에 있는 스레드 소멸
		
		
		
		
//		newSingleThreadExecutor : 풀 안에 하나의 스레드만 생성하고 유지한다.
//		newFixedThreadPool : 풀 안에 인자로 전달된 수의 쓰레드를 생성하고 유지한다.
//		newCachedThreadPool : 풀 안의 스레드의 수를 작업의 수에 맞게 유동적으로 관리한다.
	}

}
