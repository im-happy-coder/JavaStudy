package examp02;

import java.awt.Toolkit;

//Runnable인터페이스를 직접 구현 하고 있따.
public class Beep implements Runnable {
	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			System.out.println("Beep음 실행하는 스레드 명 :" + Thread.currentThread().getName());
			toolkit.beep();
			try {
				Thread.sleep(500); //500=0.5초
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
