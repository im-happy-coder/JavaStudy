package examp01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReaderEx03 {

	public static void main(String[] args) throws Exception {
		
		InputStream iStream = new FileInputStream("D:\\test.txt");
		int count;
		byte[] readbytes = new byte[8];
		
		
		
		//시작 인덱스가 2이고 3개만 읽어서 저장하는 코드를 작성한다.
		count = iStream.read(readbytes, 2, 4); //2번째 인덱스부터 4개를 가져와라
		System.out.println("읽은 바이트 수 : " + count);
		System.out.println();
		for(byte b : readbytes) {
			System.out.println("읽은 바이트 : " + (char)b);
		}
		
		
		
		
		
		iStream.close();
	}

}
