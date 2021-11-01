package examp04;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy_ReaderWriter {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:\\text.txt");
		Writer writer = new FileWriter("D:\\text_복사본.txt");
	
		
		String str = "";
		int readBytes;
		char[] cArr = new char[2];  //char[1000];과 char[2];의 차이
		int i=0;
		while( (readBytes=reader.read(cArr)) != -1) {
			i++;
			String str1 = new String(cArr);
			str += str1;
			System.out.println("루핑 수 : " + i);
			System.out.println("읽은 바이트 수 : " + readBytes);
		}
		
//		char[1000], 즉 바이트수를 1000으로 주면 아래 처럼 사용해도 된다.
//		readBytes=reader.read(cArr);
//		String str1 = new String(cArr);
//		writer.write(str1);
//		
		
		writer.write(str);
		
		
		
		writer.flush();
		System.out.println("D드라이브에 text_복사본.txt파일이 생성되었습니다.");
		writer.close();
		reader.close();
	}

}
