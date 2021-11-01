package Question1_120;

import java.util.concurrent.CyclicBarrier;
//실행중인 쓰레드 내부 원하는 지점에서 대기를 걸어주고 CyclicBarrier 생성자의 파라미터로 넘겨준 값 만큼 await()을 호출하면 대기하고 있던 쓰레드들의 대기를 풀어주는 동작을 할 수 있습니다.
class Worker extends Thread {
CyclicBarrier cb;
public Worker(CyclicBarrier cb) { this.cb = cb; }
public void run () {
try {
cb.await(); //대기
System.out.println("Worker");
} catch (Exception ex) { }
}
}
class Master implements Runnable { //line n1
public void run () {
System.out.println("Master");
}
}
public class Examp57 {
	public static void main(String[] args) {
		Master master = new Master();
		CyclicBarrier cb = new CyclicBarrier(1, master);//line n2  1은 쓰레드의 갯수이며, master는 Runnable인터페이스를 사용한다.
		Worker worker = new Worker(cb);
		worker.start();
	}
	
}
//public CyclicBarrier(int parties, Runnable barrierAction) {  //int parties는 awit()를 호출하기 위해 필요한 thread의 수
//    if (parties <= 0) throw new IllegalArgumentException();
//    this.parties = parties;
//    this.count = parties;
//    this.barrierCommand = barrierAction;
//}