package examp02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class OutputStreamEx02 {

	public static void main(String[] args) throws Exception {
			//파일로부터 출력스트림을 생성해서 대입을 하고 있다.
			OutputStream oStream = new FileOutputStream("D:\\write.txt");
			//"ABC가나다"문자열을 통해서 바이트 배열을 얻고 있다.
			byte[] data = "ABC가나다".getBytes("UTF-8");  //영문은 항상 1바이트
			//x-windows-949 이클립스 기본 캐릭터 셋은 한글 2바이트로 인식한다. 
			//getBytes()를 사용할 때, 매개변수의 값으로 캐릭터 셋을 줄 수가 있는데,
			//EUC-KR은 한글을 2바이트로 인식,,UTF-8은 한글을 3바이트로 인식한다.,, ISO8859-1은 한글을 1바이트로 인식한다.
			System.out.println("data 바이트 배열의 크기 : " + data.length);
			
			
			//바이트 배열을 한번에 스트림에 보낸다. 앞서서 본 write(int b)메서드에 비해서
			//훨씬 효율적이다.
			oStream.write(data); //write(byte[] b) 
			System.out.println("저장이 완료되었습니다.");
			oStream.flush();
			
			
			
			
			
			//출력으로 내보낸 파일인 write.txt파일을 읽어 들인다.
			InputStream iStream = new FileInputStream("D:\\write.txt"); //읽어들이기
			int count = 0;
			byte[] readBytes = new byte[3];
			int i = 0;
			while((count=iStream.read(readBytes)) != -1 ) {
				i++;
				String str = new String(readBytes, "UTF-8"); //디코딩
				System.out.println("읽은 값 : " + str);
				System.out.println("읽은 바이트 수 : " + count);
				
			}
			
			System.out.println("루핑 수 : " + i);
			
			
			
			iStream.close();
			oStream.close();
	}
}
