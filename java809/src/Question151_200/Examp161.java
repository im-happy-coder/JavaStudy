package Question151_200;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ThreadRunner implements Runnable {
public void run () { System.out.print ("Runnable") ; }
}
class ThreadCaller implements Callable {
 public String call() throws Exception {return "Callable"; }
}
public class Examp161 {

	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool ();
		Runnable r1 = new ThreadRunner ();
		Callable c1 = new ThreadCaller ();
		es.submit(r1); Future<String> f1 = es.submit (c1);// line n1
		es.shutdown();
	}

}
	// ´ä : D. es.submit(r1); Future<String> f1 = es.submit (c1);

//public interface ExecutorService extends Executor { Future<?> submit(Runnable task);
//public interface Executor { void execute(Runnable command);
