package examp03;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTest {

	public static void main(String[] args) {
//		synchronized를 대신하는 ReentrantLock
		ReentrantLock criticObj = new ReentrantLock(); //자물쇠
		void myMethod(int arg) {
			criticObj.lock(); //문을 잠근다.
//			..//한스레드에 의해서 만 실행 되는 영역
			criticObj.unlock(); //문을 연다
		}
		
		
		
		
		ReentrantLock criticObj = new ReentrantLock(); //자물쇠
		void myMethod(int arg) {
			criticObj.lock(); //문을 잠근다.
			try { ..//한스레드에 의해서 만 실행 되는 영역
			
			}finally {
				criticObj.unlock(); //문을 연다
			} //unlock 호출이 생략되는것을 막기 위해
		}
	}

}
