package sec02.example01;

public class RunnableEx {

	public static void main(String[] args) {

		//익명구현객체
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<5; i++) {
					System.out.println(i);
				}
			}
		};
		
		Thread thread = new Thread(runnable);
		thread.start();
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		
		
		System.out.println("---------------------------------------");
		
		//위에껏을 람다식으로 직접 작성하여 Thread의 매개값으로 주는 코드   (방법1)
		runnable = () -> {
			for(int i=0; i<5; i++) {
				System.out.println(i);
			}
		};
		thread = new Thread(runnable);
		thread.start();
		
		
		
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {}
		System.out.println("---------------------------------------");
		
		//Thread객체를 생성할 때, 바로 람다식을 작성함. (방법2) ---------주로 이 방법을 사용한다.
		thread = new Thread( () -> {
			for(int i=0; i<5; i++) {      
				System.out.println(i);
			}
		} );
		thread.start();
	}

}
