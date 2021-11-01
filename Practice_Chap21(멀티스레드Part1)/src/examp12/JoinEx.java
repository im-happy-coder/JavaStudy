package examp12;

public class JoinEx {

	public static void main(String[] args) {
		double avg = 0.0;
		long total = 0L;
		SumThread sumThread = new SumThread();
		sumThread.start();
	
		try {
			sumThread.join();  //메인 스레드는 sumThread가 끝날때까지 일시정지 기다려야된다.
		} catch (InterruptedException e) {}
		
		total = sumThread.getSum();
		avg = total / 10000.0;
		
		System.out.println("1~10000까지의 합 : " + total);
		System.out.println("1~10000까지의 합의 평균: " + avg);

	}

}
