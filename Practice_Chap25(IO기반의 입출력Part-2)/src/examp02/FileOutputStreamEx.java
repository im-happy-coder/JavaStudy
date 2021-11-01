package examp02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamEx {

	public static void main(String[] args) throws Exception {
		//파일을 복사를 하기 위해서 경로를 설정
//		String oriFileName = "D:\\java작업\\Practice_Chap25(IO기반의 입출력Part-2)\\src\\examp02\\PPT.ppt";
//		String tarFileName = "D:/Temp/PPT.ppt";
		String oriFileName = "D:\\java작업\\Practice_Chap25(IO기반의 입출력Part-2)\\src\\examp02\\김연아.png";
		String tarFileName = "D:/Temp/김연아.png";

		File file = new File(oriFileName);
		FileInputStream fis = new FileInputStream(file);  //파일로부터 데이터를 복사
		FileOutputStream fos = new FileOutputStream(tarFileName); //복사한 파일을 출력
		
		
		int readByteCount;
		int i=0;
		byte[] bArr = new byte[100]; //바이트 배열을 크게 잡을수록 복사시간이 빨라진다.
		
		
		
		long startTime = System.currentTimeMillis(); //현재 시점을 시간으로 저장
		while((readByteCount=fis.read(bArr)) != -1) {
//			fos.write(bArr); //이걸 쓰면 뒤에 남는 바이트가 있을 수 있기 때문에 아래처럼
			fos.write(bArr, 0, readByteCount);  // 0부터 readByteCount 수 만큼 쓰기때문에 남는 바이트가 없다.
			i++;
		}
		fos.flush();
		long endTime = System.currentTimeMillis(); //복사의 종료 시점 시간
		System.out.println("총 루핑 수 : " + i);
		System.out.println("복사 시간 : " + (endTime - startTime) + "ms");  //300ms = 0.3초
		System.out.println("복사한 파일의 크기 : " + (file.length()/1024) +  "kbyte"); //kb로 표시하기---> 나누기 1024
		fis.close();
		fos.close();
		System.out.println(file.getName() + "파일의 복사가 완료 되었습니다.");
	}

}
