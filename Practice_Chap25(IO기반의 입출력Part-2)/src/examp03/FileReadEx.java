package examp03;

import java.io.File;
import java.io.FileReader;

public class FileReadEx {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\java작업\\Practice_Chap25(IO기반의 입출력Part-2)\\src\\examp03\\files\\여성가족부 담화문.txt");
		System.out.println(file.getCanonicalPath());
		//~~~Reader, ~~~Writer 붙는 클래스들은 문자 특화 기반 클래스 (( 이미지나, 영상 불가)
		FileReader fiReader = new FileReader(file);
//		System.out.println("파일 크기 : " + file.length());
		
		int readCharNo;
		
		//사이즈가 클수록 많은 데이터를 한번에 읽기 때문에 속도가 향상된다.
		char[] cArr = new char[100]; /// 200바이트 할당  -- 한문자가 2바이트니까
		int i = 0; 
		
		while((readCharNo=fiReader.read(cArr)) != -1 ) {
			String str = new String(cArr, 0, readCharNo);
			System.out.print(str);
			i++;
		}
		
//		System.out.println();
		System.out.write(13); //개행
		System.out.println("루핑 수 : " + i);
		
		
		
		fiReader.close();
	}

}
