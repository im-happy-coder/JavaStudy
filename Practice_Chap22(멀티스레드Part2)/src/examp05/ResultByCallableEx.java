package examp05;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ResultByCallableEx {
	
	
	public static void main(String[] args) {
		
		//스레드 풀 생성
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		
		//Callable익명 구현 객체를 생성(즉, 작업객체를 생성) --> 리턴값이 있음 <T>타입
		System.out.println("[작업처리요청]");
		Callable<Integer> callable = new Callable<Integer>() {
			@Override
			public Integer call() throws Exception {
				int sum = 0;
				for(int i=1; i<=100000; i++) {
					sum += i;
				}
				return sum;
			}
		};
		//작업 큐에 작업객체를 넣는다.
		//Future의 제네릭값도 역시 T타입으로 통일을 해 줘야한다.
		System.out.println("블로킹 시작 : " + System.currentTimeMillis());
		Future<Integer> future = executorService.submit(callable);
		try {
			int value = future.get();  //언박싱이 이루어짐
			System.out.println("블로킹 끝 : " + System.currentTimeMillis());
			System.out.println("[작업처리결과] : " + value);
			System.out.println("[작업처리완료]");
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
		//스레드 풀 종료
		executorService.shutdown();
	}

}
