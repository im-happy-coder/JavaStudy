package examp03;

import java.io.File;
import java.io.FileReader;
import java.io.Reader;

public class ReaderEx02 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		char[] cArr = new char[2];
//		String str = "";     //String클래스를 이용한 방법
		StringBuilder sbBuilder = new StringBuilder();  //StringBuilder를 이용한 방법
		
		//read()매개변수가 char[]타입이라는 것에 주목을 반드시 하자
		while((readData = reader.read(cArr)) != -1) {
//			str += new String(cArr, 0, readData); //읽은 문자를 문자열로 생성한다.  //String클래스를 이용한 방법
			sbBuilder.append(cArr); //StringBuilder를 이용한 방법
			System.out.println("읽은 문자 수 : " + readData);
		}
		//문자열 출력
		System.out.println(sbBuilder);
		
		
		
		
		
		
		
		
		
		
		
		
		reader.close();
		
	}

}
