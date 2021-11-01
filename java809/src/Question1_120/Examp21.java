package Question1_120;

import java.util.concurrent.atomic.AtomicInteger;

class MyThread implements Runnable {
private static AtomicInteger count = new AtomicInteger (0);
public  void run () {
int x = count.incrementAndGet(); //incrementAndGet()는 값이 자동으로 증가한다.
System.out.print (x+" ");
}
}
public class Examp21 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new MyThread());
		Thread thread2 = new Thread(new MyThread());
		Thread thread3 = new Thread(new MyThread());
		Thread [] ta = {thread1, thread2, thread3};
		for (int x= 0; x < 3; x++) {
		ta[x].start();
		}
	}

}

//답 :  The program prints 1 2 3 and the order is unpredictable.
//	1,2,3을 인쇄하고 순서를 예측할수 없다.


// static이 없으면 1 1 1 을 출력한다.
