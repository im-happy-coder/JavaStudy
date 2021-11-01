package examp07;

//공유객체
public class Calcurator {
	private int memory;
	
	public int getMemory() {
		return this.memory;
	}
	
	//비동기화 메서드 -> 데이터 신뢰성을 보장하기 위해서는 반드시 동기화처리가 필수다.
	public void setMemory(int memory) {
		this.memory = memory;
		System.out.println(Thread.currentThread().getName());
		//2초간 일시정지
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {}
	}
	/*
	public void print() {
		System.out.println(Thread.currentThread().getName() + "  " + );
	} */
}
