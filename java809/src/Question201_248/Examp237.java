package Question201_248;

import java.util.concurrent.CyclicBarrier;

class Worker extends Thread {
CyclicBarrier cb;
public Worker(CyclicBarrier cb) { this.cb = cb; }
public void run () {
try {
cb.await();
System.out.println("Worker…");
} catch (Exception ex) { }
}
}
class Master implements Runnable { //line n1
public void run () {
System.out.println("Master…");
}
}
public class Examp237 {

	public static void main(String[] args) {
		Master master = new Master();
		CyclicBarrier cb = new CyclicBarrier(1, master);//line n2
		Worker worker = new Worker(cb);
		worker.start();
		
//		  CyclicBarrier 를 사용하면 동시에 실행되는 쓰레드 내부 원하는 지점에서 대기를 걸어주고 모든 쓰레드가 대기 상태에 들어갔을때, 대기를 풀어주는 동작을 할 수 있다. 
		// await를 호출한다면 모든 쓰레드의 wait 상태가 종료된다.
//		 public CyclicBarrier(int parties, Runnable barrierAction) {
		
		
//		run methods of both the Worker and Master classes are executed.
//		You have been asked to ensure that the
//		Which modification meets the requirement?
//		답
//		B. Replace line n2, insert CyclicBarrier cb = new CyclicBarrier(1, master);
	}

}
