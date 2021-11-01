package examp03;

import java.io.FileReader;
import java.io.Reader;

public class ReaderEx01 {

	public static void main(String[] args) throws Exception {
		//Reader클래스는 문자 특화 클래스로써 하위 클래스인 FileReader를 생성해서 대입
		Reader reader = new FileReader("D:\\test.txt");
		int readData;
		
		
		
		//방법 1----추천 코드가 짧음
		//readData변수는 int값이므로 끝 2바이트(문자 2바이트이니깐)에 저장된다.
//		while((readData=reader.read()) != -1) {
//			//문자를 출력은 (바이트 정보를 char강제 캐스팅)
//			System.out.println("읽은 문자 : " + (char)readData);
//			//영문자는 아스키코드가 출력이되고, 한글은 유니코드가 출력이 된다.
//			System.out.println("읽은 문자 : " + readData);
//			
//		}
		
		System.out.println("------------------------------------");
		
		//방법2
		while(true) {
			readData = reader.read();
			if(readData == -1 )
				break;
			//문자를 출력은 (바이트 정보를 char강제 캐스팅)
			System.out.println("읽은 문자 : " + (char)readData);
			//영문자는 아스키코드가 출력이되고, 한글은 유니코드가 출력이 된다.
			System.out.println("읽은 문자 : " + readData);
		}
		
		reader.close();
		
	}

}
