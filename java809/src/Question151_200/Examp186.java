package Question151_200;

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
public class Examp186 {

	public static void main(String[] args)throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		Future f1 = es.submit (new Caller ("Call"));
		Future f2 = es.submit (new Runner ("Run"));
		String str1 = (String) f1.get();
		String str2 = (String) f2.get(); //line n1
		System.out.println(str1+ ":" + str2);
//		System.out.println(str1+ ":" + "Run"); //이렇게하면  B가 답
		es.shutdown(); // 이 문장을 주석처리하면 A가 답임
	}

}

//A. The program prints: Run Runner Call Caller : null And the program does not terminate.
//     es.shutdown();이 없다면 이게 답이겠지
//B. The program terminates after printing: Run Runner Call Caller : Run -- 위 식으로는 이게 정답

//C. A compilation error occurs at line n1. -- 이게 답 이될려면 STring이 Integer나 이런걸로 바뀔듯
//D. An ExecutionException is thrown at run time. -- 이건 main메서드 throws에서 던져주지 않으면 오류날듯

//답이 애매함 , es.shoutdown이 없어야 A답이 유효하고

// B답은  Run Runner Call Caller : Run이 아니라 null이 붙기때문에 애매함
//B답이 유효할려면 코드를 System.out.println(str1+ ":" + "Run"); 수정해야함

