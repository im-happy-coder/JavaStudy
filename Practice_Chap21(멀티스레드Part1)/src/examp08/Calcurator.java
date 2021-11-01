package examp08;

//공유객체
public class Calcurator {
	private int memory;
	int value = 100;
	public int getMemory() {
		return this.memory;
	}
	
	//동기화 메서드
	public synchronized void setMemory(int memory) {
		this.memory = memory;
//		System.out.println(Thread.currentThread().getName());
		//2초간 일시정지
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+ " : " + this.getMemory());
	}
	//비동기화 메서드이므로 어떤 스레드라도 얼마든지 접근이 가능하다. 
	public void print() {
		System.out.println(Thread.currentThread().getName() + "  " + "Value 값 : " + this.value);
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " : " + i);
		}
	} 
}
