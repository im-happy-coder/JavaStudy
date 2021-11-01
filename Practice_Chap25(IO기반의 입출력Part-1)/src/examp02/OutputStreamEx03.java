package examp02;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamEx03 {

	public static void main(String[] args) throws Exception{
		OutputStream oStream = new FileOutputStream("D:\\write.txt");
		byte[] data = "ABC이순신장군님".getBytes();
		System.out.println("data바이트 배열의 크기 : " + data.length);
		oStream.write(data, 3, 12); //시작 인덱스가 3이고 12바이트 만큼 파일로 내보낸다.
		oStream.flush();
		System.out.println("파일이 저장 되었습니ㅏㄷ.");
		oStream.close();
	}

}
