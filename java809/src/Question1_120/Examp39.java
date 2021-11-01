package Question1_120;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class Caller implements Callable<String> {
String str;
public Caller (String s) {this.str=s;}
public String call()throws Exception { return str.concat ("Caller");}
}
class Runner implements Runnable {
String str;
public Runner (String s) {this.str=s;}
public void run () { System.out.println (str.concat ("Runner"));}
}
public class Examp39 {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2); //고정된 개수를 가진 쓰레드풀
		Future f1 = es.submit (new Caller ("Call")); //submit 객체를 전달한다.
		Future f2 = es.submit (new Runner ("Run"));
		String str1 = (String) f1.get();   //get()으로 데이터가 set될때까지 기다린다
		String str2 = (String) f2.get(); //line n1
		System.out.println(str1+ ":" + str2);
		//str1은 Call과 Caller를 출력하며, Run과 Runner는 프로그램이 실행되면 자동으로 실행된다.
		//str2는 null이 발생
		//결론 : f1은  .get()으로 호출해야 실행되지만, f2는 자동으로 실행되서 get이 필요없다.
		}
	}

/*
Future에 데이터가 set되지 않으면 Future.get()를 호출한 Thread는 무한히 대기합니다. 
 
Future는 비동기 처리 결과를 표현하기 위해서 사용된다.
 비동기 처리가 완료되었는지 확인하고, 처리 완료를 기다리고, 처리 결과를 리턴하는 메소드를 제공한다. 
 비동기 결과는 처리가 완료되면 get 메소드를 사용해서 얻을 수 있다.
*/