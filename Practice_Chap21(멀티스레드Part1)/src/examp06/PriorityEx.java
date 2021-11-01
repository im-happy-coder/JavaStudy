package examp06;

public class PriorityEx {

	public static void main(String[] args) {
		
		//메인 스레드의 우선순위 보기
		Thread thread1 = Thread.currentThread();
		System.out.println(thread1.getName() + " : " + thread1.getPriority());  
	
		for(int i=1; i<=5; i++) {
			Thread thread = new CalcThread("Thread : " + i);
			//Thread 1, 2, 3, 4는 우선순위가 가장 낮다
			if(i != 5) {
				thread.setPriority(Thread.MIN_PRIORITY);
//				thread.setPriority(1); 똑같음
			}  
			//Thread5는 우선순위가 10으로 가장 높다
			else { 
				thread.setPriority(Thread.MAX_PRIORITY);
//				thread.setPriority(10); 똑같음
			}
			thread.start();
		}
//		아무리 우선순위가 10으로 주었다 해도, 작업을 마치는 빈도가 높을 뿐이지
//		무조건 100프로 먼저 끝낸다는 보장이 없다.
//		어차피 자바는 순환할당(Round-Robin)방식을 사용하기 때문에
//		CPU스케쥴러의 상태에 따라 달라진다.
	}

}
