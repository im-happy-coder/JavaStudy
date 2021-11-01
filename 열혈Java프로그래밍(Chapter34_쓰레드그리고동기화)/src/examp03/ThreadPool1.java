package examp03;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool1 {

	public static void main(String[] args) {
		
//		쓰레드 풀 기반의 예제 1
		
		Runnable task = () -> { //쓰레드에게 시킬 작업
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + (n1 + n2));
		};
		
		ExecutorService exr = Executors.newSingleThreadExecutor(); //풀 안에 하나의 스레드만 생성하고 유지함
		exr.submit(task); //쓰레드 풀에 작업을 전달
		
		System.out.println("End " + Thread.currentThread().getName());
		exr.shutdown(); //쓰레드 풀과 그 안에 있는 스레드 소멸
		
		
		
		
//		newSingleThreadExecutor : 풀 안에 하나의 스레드만 생성하고 유지한다.
//		newFixedThreadPool : 풀 안에 인자로 전달된 수의 쓰레드를 생성하고 유지한다.
//		newCachedThreadPool : 풀 안의 스레드의 수를 작업의 수에 맞게 유동적으로 관리한다.
	}

}
