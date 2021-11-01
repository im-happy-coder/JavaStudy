package examp13;

public class WaitNotifyEx {

	public static void main(String[] args) {
		
		WorkObject workObject = new WorkObject();
		
		//실행코드에 가서 notify()와 wait()를 호출하는데, 동기화 메서드로 되어 있어서
		//메서드 잠금이 일어나면서 서로 번걸아 가면서 깨우고 재우고 깨우고 자고 실행이 되는 것을 알 수가  있다.
		ThreadA threadA = new ThreadA(workObject);
		ThreadB threadB = new ThreadB(workObject);
		
		threadA.start();
		threadB.start();
//		스레드간의 협업 Object클래스의 메서드인 notify()와 wait()를 이용하면 된다.
//		동기화(synchronized) 처리가 된 곳에서 호출하는 것이 바람직히다.
	}

}
