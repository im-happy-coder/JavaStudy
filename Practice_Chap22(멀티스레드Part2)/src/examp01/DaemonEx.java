package examp01;
//데몬 사용
public class DaemonEx {

	public static void main(String[] args) {
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		
		//daemon설정(필히, start()호출 전에 설정을 해야한다.
		//autoSaveThread는 main스레드와 종속적인 관계가 된다
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		
		//main스레드는 5초 동안 정지하면, daemon스레드인 autoSaveThread가 실행되고, main스레드가 종료되면 더 이상 autoSaveThread가 실행이 안된다.
		//종속적인 관계이기때문에 main스레드가 종료되면 autoSaveThread도 종료된다
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
		System.out.println("main스레드 종료됨");
	}	

}
