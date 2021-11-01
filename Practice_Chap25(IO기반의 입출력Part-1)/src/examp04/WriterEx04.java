package examp04;

import java.io.FileWriter;
import java.io.Writer;

public class WriterEx04 {

	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:\\text.txt");
		String str = "안녕하세요. 지금 자바를 가르치고 있어요.";
		
		
		
//		writer.write(str); //writer(String)  매개변수 타입이 String이다
		writer.write(str, 2, 10);  //공백포함,,,문자열 2번째 인덱스부터 10개의 문자를 파일로 저장하라
		
		
		
		
		
		
		writer.flush();
		writer.close();
	}

}
