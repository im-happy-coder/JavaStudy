package examp01;

import java.awt.Toolkit;

public class BeepPrintEx {
	//main()메소드는 JVM이 실행한다.
	public static void main(String[] args) {
		//현재 실행중인 스레드 명을 출력함
//		System.out.println(Thread.currentThread().getName()); //main메서드가 실행시키는 스레드가 누군지 확인
		
		
		//툴킷은 자바가 제일 처음에 생겨났을 때 어떠한 이미지나 소리같은 것을 처리하기 위해서 추상클래스 중에서 Gui관련된 기본적인 메서드들을 구현해놓은 클래스
		//Toolkit은 AWT추상클래스인데, 그 중에 GUI관련된 메서드들로 구성되어진 인스턴스를
		//getDefaultToolkit()를 통해서 Toolkit클래스의 참조를 얻어낸다
		Toolkit toolkit = Toolkit.getDefaultToolkit(); //getDefaultToolkit 기본적으로 만들어진 GUI를 얻어낼수있다.
//		for(int i=0; i<5; i++) {
//			System.out.println("for문을 실행하는 스레드 이름 :" + Thread.currentThread().getName());
//			toolkit.beep(); //비프음을 출력
//			//쓰레드가 너무 빨리 실행하니까 0.5초동안 멈춰야 5번 비프음 발생한다.
//			try {
//				Thread.sleep(500); //500=0.5초
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
		
		
			for(int i=0; i<5; i++) {
				System.out.println("삐웅~");
				toolkit.beep();
				try {
					Thread.sleep(500); //500=0.5초
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
//			싱글스레드를 멀티스레드로 바꿔서 프로그램을 만드는 것이 우리가 할 일이다.
		
	}

}
