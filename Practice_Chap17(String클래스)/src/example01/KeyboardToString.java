package example01;

import java.io.IOException;

public class KeyboardToString {

	public static void main(String[] args) {
		
		byte[] bytes = new byte[100];
		//System.out.println(bytes[99]);

		System.out.print("입력 : ");
		int readBtyesNo = 0;
		try {
			//키보드(표준입력)으로부터 입력을 받고 그 내용을 bytes에 저장을 하고
			//입력받은 바이트 수를 리턴함.
		readBtyesNo = System.in.read(bytes);
		//문자셋 EUC-KR로 디코딩(사람이 보기 편한쪽으로 코딩하는 것이 디코딩)
		String str = new String(bytes, 0, readBtyesNo-2, "EUC-KR");  
		//String str = new String(bytes, 0, readBtyesNo-2, "UTF-8");
		System.out.println(str);
		System.out.println("입력받은 바이트 수 : " + readBtyesNo);
		
		//EUC-KR : 한글 2byte, UTF-8 : 한글 3byte
		byte[] b = str.getBytes("EUC-KR"); //인코딩 (아날로그신호를 디지털신호로 바꿈)
		System.out.println(b.length);
		
		//인코딩과 디코딩의 과정에서 반드시 문자젯은 동일하게 가져가야 글자가 깨지거나 
		//하는 오류를 방지할 수 있다.
		byte[] b2 = "안녕하세요".getBytes("UTF-8");  //getBytes()기본값은 EUC-KR
		String str1 = new String(b2, 0, b2.length, "UTF-8");
		System.out.println(str1);
		System.out.println(b2.length);
		} catch (IOException e) {}
		
	}

}
