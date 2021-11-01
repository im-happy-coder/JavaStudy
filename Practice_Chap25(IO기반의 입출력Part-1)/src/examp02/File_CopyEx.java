package examp02;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class File_CopyEx {

	public static void main(String[] args) throws Exception {
		
		//입력과 출력을 동시에 하는법
		
		FileInputStream fInputStream = new FileInputStream("D:\\write.txt");
		
		FileOutputStream fOutputStream = new FileOutputStream("D:\\write복사본.txt");
		
		byte[] readBytes = new byte[1000];
		int data = 0;
		
		
		
		
		
		while((data=fInputStream.read(readBytes)) != -1 ) {
			fOutputStream.write(readBytes);
			System.out.println("읽은 바이트 수 : " + data);
		}
		
		
//		data=fInputStream.read(readBytes);
//		fOutputStream.write(readBytes);
//		System.out.println("읽은 바이트 수 : " + data);
		
		
		
		fOutputStream.flush();
		System.out.println("D드라이브에 write복사본.txt 파일이 생성되었습니다.");
		
		
		
		
		
		
		
		
		fInputStream.close();
		
		fOutputStream.close();
	}

}
