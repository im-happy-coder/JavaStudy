package Question151_200;


class Counter extends Thread {
	int i = 10;
	public synchronized void display(Counter obj) {
		try {
			Thread.sleep(5);
//			obj.increment(this);
			System.out.println(i);
		} catch (InterruptedException e) {		}
	}
	public synchronized void increment(Counter obj) {
		i++;
	}
}
public class Examp159 {

	public static void main(String[] args) {
		final Counter obj1 = new Counter();
		final Counter obj2 = new Counter();
		new Thread(new Runnable() {
			public void run() {
				obj1.display(obj2);
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				obj2.display(obj1);
			}
		}).start();
	}

}
/* 답 : B. deadlock
 * since display method is synchronized, 
 * thread has a lock and cannot release the lock to access synchronized method increment method. 
 * If you remove synchronized from increment – the program will run ok
 obj.increment(this); 이 메서드를 지우면 정상 실행됨-----10 10 결과
 
 
 
 
*/