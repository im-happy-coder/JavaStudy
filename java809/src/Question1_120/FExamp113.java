package Question1_120;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class R implements Runnable {
	@Override
	public void run() {
		System.out.println("Run...");
	}
}

class C implements Callable<String>{
	@Override
	public String call() throws Exception {
		return "Call...";
	}
}
public class FExamp113 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(new R()); //line n1
		Future<String> f1 = es.submit(new C()); //line n2
		System.out.println(f1.get());
		es.shutdown();
	 // 답 : C. Run... Call...	
	}

}
