package examp13;

//공유 객체
public class WorkObject {
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 실행");
		notify(); //wait()에 의해 BLOCKED된 스레드들을 실행대기 상태로 깨운다
		
		try {
			wait(); //영원히 잔다.  다른 스레드에서 notify(),notifyAll()호출 해야만 깨어난다.
		} catch (InterruptedException e) {}
	}

	
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 실행");
		notify(); 
		
		try {
			wait(); 
		} catch (InterruptedException e) {}
	}

	
}
