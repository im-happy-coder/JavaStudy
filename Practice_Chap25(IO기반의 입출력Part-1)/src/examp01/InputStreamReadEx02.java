package examp01;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamReadEx02 {

	public static void main(String[] args) throws Exception{
		InputStream iStream = new FileInputStream("D:\\test.txt"); //----->D:/test.txt   똑같음  //파일을 저장할때 옵션을 ANSI로 해야됨   UTF-8 X
		int readByteNO;
		int i = 0;
		
		//한글은 2바이트인데 크기를 3으로 주면 한글이 깨진다.
		byte [] b = new byte[2];
		
		while( (readByteNO = iStream.read(b)) != -1 ) {
			System.out.println("읽은 byte 수 : "  + readByteNO);
			
			//String클래스로 반드시 디코딩해야 한글이 출력된다.
			String str = new String(b);
			System.out.println("읽은 문자열  : "  + str);
			i++;
		}
		iStream.close();
	}

}
