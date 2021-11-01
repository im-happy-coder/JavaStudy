package examp02;

//동기화 메서드 사용
//class Counter1 {
//	int count = 0; //공유되는 변수
//	synchronized public void increment() {
//		count++; //첫 번째 쓰레드에 의해 실행
//	}
//	synchronized public void decrement() {
//		count--; //또 다른 쓰레드에 의해 실행
//	}
//	public int getCount() {return count;}
//}



//동기화 블록 사용
class Counter1 {
	int count = 0; //공유되는 변수
	public void increment() {
		synchronized(this) { //this = 이(this) 인스턴스(count)를 대상으로 동기화 하겠다. = this에는 다른 인스턴스가 올 수 있다. 
							// 하나의 변수만 동기화하면 되기때문에 this를 사용했따.
		count++; //첫 번째 쓰레드에 의해 실행
		}
	}
	synchronized public void decrement() {
		synchronized(this) {
			count--; //또 다른 쓰레드에 의해 실행
		}
	}
	public int getCount() {return count;}
}



public class ThreadmemoryAccessSyncronized {

	public static Counter1 cnt = new Counter1();
	public static void main(String[] args) throws InterruptedException {

		Runnable task1 = () ->{
			for(int i=0; i<1000; i++)
				cnt.increment(); //값 1증가
		};
		Runnable task2 = () ->{
			for(int i=0; i<1000; i++)
				cnt.decrement(); //값 1감소
		};
		
		Thread t1 = new Thread(task1);
		Thread t2 = new Thread(task2);
		t1.start();
		t2.start();
		t1.join(); // t1이 참조하는 쓰레드의 종료를 기다림
		t2.join(); // t2이 참조하는 쓰레드의 종료를 기다림
		System.out.println(cnt.getCount());
		
		
		
		
		
	}

}
