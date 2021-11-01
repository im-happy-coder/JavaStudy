package examp02;

import java.awt.Toolkit;

public class BeepPrintEx {
	//main()메소드는 JVM이 실행한다.
	public static void main(String[] args) {
		//직접 생성하는 멀티스레드 방법 3가지
		//방법 1 --> 구현객체 대입
		Runnable runnable = new Beep(); //구현객체 대입
		Thread thread = new Thread(runnable);
		thread.start();
		
		//스레드는 한번 start()를 다 실행하고 나면, 재실행이 안된다.
		//재실행을 하고자 한다면 아래와 같이 인스턴스를 한개 더 만들어야한다.
//		thread = new Thread(runnable);
//		thread.start();
		
		
		/*방법 2 --> 익명 구현 객체
		Thread thread = new Thread(new Runnable() {
			
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
		});
		thread.start();
		 */
		
		/* 방법 3 --> 람다식(함수적 인터페이스)에서만 적용(코드 절약, 가독성) ---- 함수적 인터페이스는 인터페이스가 추상메서드가 오직 한개만 있는 것을 말한다.
		Thread thread = new Thread( ()->  {
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
		});
		thread.start();
		*/
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
			for(int i=0; i<5; i++) {
				System.out.println("for문을 실행하는 메소드 명 :" + Thread.currentThread().getName());
				System.out.println("삐웅~" );
				toolkit.beep();
				try {
					Thread.sleep(500); //500=0.5초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
	}

}
