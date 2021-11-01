package examp01;

public class ThreadClass {

	public static void main(String[] args) {
		//쓰레드를 생성하는 방법
//		1단계 Runnable을 구현한 인스턴스 생성
//		2단계 Thread 인스턴스 생성
//		3단계 start 메소드 호출
		
//		Thread ct = Thread.currentThread();
//		String name = ct.getName(); //스레드의 이름을 반환
//		System.out.println(name);
		
		//Runnable void run()
		Runnable task = () -> {//쓰레드가 실행하게 할 내용
			int n1 = 10;
			int n2 = 20;
			String name = Thread.currentThread().getName();
			System.out.println(name + ": " + (n1 + n2));
		};
		
		Thread t = new Thread(task);
		t.start();
		System.out.println("End " + Thread.currentThread().getName());
		
//		실행결과 main쓰레드가 먼저 종료되고, 그다음 Thread-0이 종료되었다.
//		순서는 랜덤이지만 코드가 별로 없어서 main이 먼저 종료된거다 원래는 누가 먼저 종료될지 모른다.
	}

}
