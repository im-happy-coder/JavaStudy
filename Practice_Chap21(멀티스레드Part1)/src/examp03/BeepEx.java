package examp03;

public class BeepEx {

	public static void main(String[] args) {
		//필드의 다형성 (Beep가 Thread에 상속을 받았기 때문에)
		Thread thread = new Beep();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}

}
