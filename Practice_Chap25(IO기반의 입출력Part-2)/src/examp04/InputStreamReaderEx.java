package examp04;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderEx {

	public static void main(String[] args) throws Exception {
		//주 입력스트림을 바이트 기반인 InputStream으로 설정한다.
		InputStream iStream = System.in; //콘솔로부터 입력 받는다.(키보드로 입력받음)
		
		
		//문자를 받기 위해 보조스트림을 주 입력스트림에 연결한다.
		Reader reader = new InputStreamReader(iStream); //보조 스트림
		
		int readCount;
		char[] cArr = new char[100];
		System.out.print("문자열을 입력하세요.");
		
		
		//콘솔에서 입력을 받을 때는 -1를 리턴하는 경우는 Ctrl+z를 누르면 된다.
		//콘솔창의 실행, 중지창을 자세히 살펴보도록 합시다.
		while((readCount=reader.read(cArr)) != -1) {
			String str = new String(cArr, 0, readCount); //String으로 생성
			System.out.println("키보드로 부터 읽은 문자열 : " + str);
		}
		
		
		
		
		
		
		reader.close();
		iStream.close();
		
	}

}
