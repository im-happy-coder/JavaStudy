package examp10;

//스레드의 상태를 알아보기 위한 클래스
public class TargetThread extends Thread{
	@Override
	public void run() {
		//실행상태->실행대기(Runnable상태)->실행상태
		for(long i=0; i<200000000; i++){
		}
		//일시정지(TIMED_WATTING)
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {}
		//실행상태->실행대기(Runnable상태)->실행상태
				for(long i=0; i<200000000; i++){
		}
	}  //종료(TERMINATED)

}
