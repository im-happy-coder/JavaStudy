package Question201_248;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallerThread implements Callable<String> {
String str;
public CallerThread(String s) {this.str=s;}
public String call() throws Exception {
return str.concat("Call");
}
}
public class Examp245 {

	public static void main(String[] args) throws InterruptedException, ExecutionException
	{
		ExecutorService es = Executors.newFixedThreadPool(4); //line n1
		Future f1 = es.submit (new CallerThread("Call"));
		String str = f1.get().toString();
		System.out.println(str);
	}
//	A. The program prints Call Call and does not terminate.
	// call call 인쇄되고 프로그램은 종료되지 않음
	
//	프로그램을 종료하려면 메인 끝에서 es.shutdown ()을 호출해야합니다.

}
