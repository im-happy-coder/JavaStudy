package examp11;

public class YieldEx {

	public static void main(String[] args) throws Exception {
		ThreadA threadA = new ThreadA();
		ThreadB threadB = new ThreadB();
		threadA.start();
		threadB.start();
		
		//3초 동안은 ThreadA, ThreadB가 번갈아 가면서 작업을 한다.
		Thread.sleep(3000);
		threadA.work = false; //3초뒤에 ThreadA의 work가 false가 되면서 ThreadB만 출력된다.
		
		Thread.sleep(3000);
		threadA.work = true;
		threadB.work = false;   //3초뒤에 A만 출력
		
		
		Thread.sleep(3000);
		threadA.stop = true;
		threadB.stop = true;   //3초뒤 A만 나오다가 B만 나온다
		
		
	}

}
