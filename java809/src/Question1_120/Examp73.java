package Question1_120;

import java.time.LocalTime;
import java.util.Locale;
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
public class Examp73 {

	public static void main(String[] args)throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(4); //line n1
		Future f1 = es.submit (new CallerThread("Call"));
		String str = f1.get().toString();
		System.out.println(str);
//		Future에 데이터가 set되지 않으면 Future.get()를 호출한 Thread는 무한히 대기합니다. 그럼 프로그램은 응답없는 상태가 됩니다.
		// 주로 타임아웃으로 무한대기상태를 푼다
	
	}

}
//B. The program prints Call Call and does not terminate.
//답 : B. 프로그램이 Call Call을 인쇄하고 종료되지 않습니다

/*
Runnable : return 값이 없는 쓰레드
Callable : return 값이 존재하는 쓰레드 + 제네릭으로 리턴값을 받는다

또한 Callable은, Runnable처럼 바로 Thread에 인자로 전달할 수는 없구요. 
아래와 같이, ExecutorService객체에 submit()메소드를 사용하여서 전달합니다. (쓰레드 풀을 사용한다는 거죠)
ExecutorService는 병렬작업 시 여러개의 작업을 효율적으로 처리하기 위해 제공되는 JAVA의 라이브러리이다.
*/