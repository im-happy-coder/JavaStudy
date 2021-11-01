package examp05;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NoResultEx {

	public static void main(String[] args) {
		//해당 PC CPU의 코어수를 최대 스레드 수로 준다.(ex. 듀얼코어는 2개, 쿼드코어 4개)
		ExecutorService executorService = Executors.newFixedThreadPool(
				Runtime.getRuntime().availableProcessors()
				);
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		
		//Runnable익명 구현 객체 생성(작업 객체만드는것) --> 리턴 값이 없다
		System.out.println("[작업처리 요청]");
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				int sum = 0;
				for(int i=1; i<=10; i++) {
					sum += i;
				}
				System.out.println("[작업처리 결과] : " + sum);
			}
		};
		
		//작업 큐에 작업(ruunable객체)를 넣는다.
		//작업이 완료 될때 까지 블로킹  즉, 기다린다. Future는 지연완료객체이다
		Future<?> future = executorService.submit(runnable);
		
		
		try {
			//get()는 작업객체가 작업을 완료 할때까지 기다린다. 여기서 블로킹이 일어난다.
			Object obj = future.get();  
			String str = (String) obj;
			System.out.println("[작업처리 완료]");
			System.out.println("Future의 get()가 리턴한 값 : " + str);
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
//		스레드 풀 종료
		executorService.shutdown();
				
		
		
	}

}
