package examp06;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedReaderEx {

	public static void main(String[] args) throws Exception {
		
		//주 스트림은 바이트 기반
		InputStream iStream = System.in;
		
		//보조스트림 첫번째 : 바이트를 문자로 바꿔주는 InputStreamReader를 연결함.
		Reader reader = new InputStreamReader(iStream);
		
		//보조스트림 두번째 : 버퍼를 문자로 바꿔주는 BufferedReader를 연결함.  (속도 및 성능 향상을 해준다.)
		BufferedReader bReader = new BufferedReader(reader);
		
		System.out.print("입력 : ");  //보통, BufferedReader보조스트림은 readLine()를 사용하기 위해서 많이 사용된다.
		String lineString = bReader.readLine(); //readLine()한줄 단위로 읽어 들인다.
		
		System.out.println("출력 : " + lineString);
		
		
		iStream.close();
		reader.close();
		bReader.close();
	}

}
