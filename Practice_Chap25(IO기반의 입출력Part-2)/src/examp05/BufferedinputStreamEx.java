package examp05;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class BufferedinputStreamEx {

	public static void main(String[] args) throws Exception {
		long start = 0;
		long end = 0;
		File file = new File("D:\\java작업\\Practice_Chap25(IO기반의 입출력Part-2)\\src\\examp05\\김연아.png");
		//바이트 기반으로 속도의 차이를 보기 위한 프로그램을 작성해본다.
		FileInputStream fStream1 = new FileInputStream(file);
		System.out.println("File의 크기 : " + file.length());
		
		System.out.println("바이트 기반 읽기 시작 ");
		start = System.currentTimeMillis();
		//그냥 읽기만 한다
		while(fStream1.read()!= -1) {}
		System.out.println("바이트 기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용하지 않았을 때 (바이트 기반)" + (end - start));
		fStream1.close();
		
		System.out.println();
		
		//주 입력스트림인 FileInputStream에다가 속도 및 성능 향상 보조스트림인 BufferedInputStream을 연결한다.
		//실직적으로 파일을 읽어오는 스트림은 주 스트림이고 그 읽어온 데이터를 빨리 처리 해주는 역할이 바로 보조 스트림인BufferedInputStream이다.
		FileInputStream fStream2 = new FileInputStream(file);
		BufferedInputStream bStream = new BufferedInputStream(fStream2);
		
		System.out.println("버퍼 기반 읽기 시작");
		start = System.currentTimeMillis();
		while(bStream.read()!= -1) {}
		System.out.println("버퍼 기반 읽기 끝");
		end = System.currentTimeMillis();
		System.out.println("버퍼를 사용 했을때 (버퍼 기반)" + (end - start));  //거이 500배이상 빨라졌다.
		
		fStream2.close();
		bStream.close();
	}
}
