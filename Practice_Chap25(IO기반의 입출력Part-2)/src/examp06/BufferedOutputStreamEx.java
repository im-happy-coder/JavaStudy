package examp06;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamEx {

	public static void main(String[] args) throws Exception {
		
		File file = new File("D:\\java작업\\Practice_Chap25(IO기반의 입출력Part-2)\\src\\examp06\\김연아.png");
		System.out.println("파일의 크기  : " + ((file.length()/1024)/1024) + "MB"); //length()바이트 크기  --> 나누기 1024하면 KB 이걸 또 1024로 나누면 MB
		
		//주스트림
		FileInputStream fInputStream = null;
		FileOutputStream fOutputStream = null;
		
		//보조 스트림
		BufferedInputStream bInputStream = null;
		BufferedOutputStream bOutputStream = null;
		
		int dataCount = 0;
		long start = 0;
		long end = 0;
		
		
		byte[] bArr = new byte[100];
		
		
		
		//주스트림에 보조 스트림을 연결함--입력
		fInputStream = new FileInputStream(file);
		bInputStream = new BufferedInputStream(fInputStream);
		//주스트림에 보조 스트림을 연결함--출력
		fOutputStream = new FileOutputStream("D:\\Temp\\김연아_copy.png");
		bOutputStream = new BufferedOutputStream(fOutputStream);
		
		start = System.currentTimeMillis(); //읽고 저장하기 전 시간을 저장
		
		
		//byte[] 배열로 사용
		while((dataCount=bInputStream.read(bArr)) != -1) {
//			fOutputStream.write(bArr, 0, dataCount);  //버퍼X,,,,,(보조스트림 없음)  byte[] 배열로 이용함  --byte[100]일때 269ms
			bOutputStream.write(bArr, 0, dataCount);  //버퍼O,,,,,(보조스트림 사용) byte[] 배열로 이용함    --byte[100]일때 14ms
		}
		
		
		
		//byte[] 배열 없이 사용
//		while((dataCount=bInputStream.read()) != -1) {
//			fOutputStream.write(dataCount);  //버퍼X,,,,,(보조스트림 없음)  1바이트씩 읽고 1바이트씩 저장하는 것
//			bOutputStream.write(dataCount);  //버퍼O,,,,,(보조스트림 사용)
//		}

		
		fOutputStream.flush();
		end = System.currentTimeMillis(); //읽고 저장 한 후 시간
		
//		System.out.println("BufferedOutputStream를 사용하지 않았을 때 : "  + (end - start) + "ms"); //23995ms가 나왔다
		
		System.out.println("BufferedOutputStream를 사용했을 때 : "  + (end - start) + "ms");  //67ms가 나왔다.
		
		
		//결론 : 배열을 사용해서 적절하게 저장공간을 주고, 속도와 성능향상을 위해 		
		//BufferedInputStream,BufferedOutputStream 보조스트림으로 연결하여 사용하면
		//시간을 더 단축시키고 성능을 향상시킨다.
		
		bInputStream.close();
		fInputStream.close();
		bOutputStream.close();
		fOutputStream.close();
	}

}
