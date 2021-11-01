package examp04;

import javax.swing.JOptionPane;

public class TimerEx {

	public static void main(String[] args) throws Exception {  //sleep에 try catch해도 되고 thorws Exception해도 되고 ㅇㅇ
		
		Thread thread = new TimerThread();
		thread.start();
		
		String input = JOptionPane.showInputDialog("10초 안에 값을 입력하시오 : ");
		if(input != null) {
			System.out.println("입력 값 : " + input);
			System.exit(0);
		} else {
		Thread.sleep(10000); //10초 대기     
		System.out.println("입력하지 못했습니다. 펑!~");  //취소버튼을 눌러야 null이 아니라서 이 문장이 나오게 된다.
		System.exit(0);
		}
	}

}
