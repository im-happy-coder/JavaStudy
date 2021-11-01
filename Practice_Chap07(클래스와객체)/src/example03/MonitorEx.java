package example03;

public class MonitorEx {

	public static void main(String[] args) {  //실행 main클래스는 실행만 하는게 바람직하다.
		
		//monitor참조변수는 리모컨과 같은 것이라고 생각하자
		Monitor monitor = new Monitor();
		
		System.out.println(monitor.toString());  //Monitor클래스(모니터설계도에서) toString을 오버라이딩(재정의)했기 때문에
												 //MonitorEx클래스(모니터생산)에서는 toString은생략 가능
		
		monitor.channel = 5;
		monitor.power();
		monitor.channelUP();
		monitor.channelUP();
		monitor.channelDOWN();
		
		monitor.volumeUP();
		monitor.volumeUP();
		monitor.volumeUP();
		
		System.out.println(monitor);
		
		monitor.power();
	}

}
