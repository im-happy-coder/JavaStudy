package examp05;

public class ThreadB extends Thread {
	public ThreadB() {
		this.setName("ThreadB"); //setName이 스레드의 이름을 지정하고 있다.
	}
	
	@Override
	public void run() {
		System.out.println("[현재 실행중인 스레드] : " + this.getName());
		for(int i=0; i<5; i++) {
			System.out.println(this.getName() + "가 출력한 내용 : " + i);
			//스레드의 이름을 얻는 2가지 방법
			//1번째 (정적 메서드 이용)
			//Thread.currentThread().getName()
			//2번쨰(인스턴스 메서드 이용)
			//this.getName() -- 메인메서드에서는 사용할 수 없다.
		}
		
	}
}
