package examp07;

public class User1 extends Thread {

	//공유 객체 선언
	private Calcurator calcurator;
	
	public void setCalcurator(Calcurator calcurator) {
		this.calcurator = calcurator;
		this.setName("User1"); //스레드 이름을 지정
	}
	@Override
	public void run() {
		//공유 객체의 필드인 memory라는 값에 100으로 변경
		this.calcurator.setMemory(100);
		System.out.println("User1 쓰레드가 출력한 값 : " + this.calcurator.getMemory());
	}

}
