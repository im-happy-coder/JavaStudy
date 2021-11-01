package examp01;

import java.io.File;
import java.io.FileInputStream;

public class FileInputStreamEx {

	public static void main(String[] args) throws Exception{
		//   '\'기호 두개 '\\'는      '/'하나와 같다,,,, '\'은 이스케이프 문자
		File file = new File("D:\\java작업\\Practice_Chap25(IO기반의 입출력Part-2)\\src\\examp01\\FileInputStreamEx.java");
		System.out.println("파일의 경로 : " + file.getPath());  //파일의 경로를 얻기
		System.out.println("부모 디렉토리 : " + file.getParent());
		System.out.println("파일이 실행가는한가? : " + file.canExecute());
		System.out.println("읽기 가능한가 ? : " + file.canRead());
		System.out.println("쓰기나 수정이 가능한가 ? : " + file.canWrite());
		System.out.println("파일 이름으 뭐냐 ? : " + file.getName());
		System.out.println("숨김파일 인가? : " + file.isHidden());
		System.out.println("파일의 크기 : " + file.length());
		System.out.println("URI 출력 형태 : " + file.toURI());
//		System.out.println("URL 출력 형태 : " + file.toURL());
		
		//생성자의 매개변수로 File객체를 받고 있다.
		FileInputStream fis = new FileInputStream(file);
//		FileInputStream fis = new FileInputStream("D:\\java작업\\Practice_Chap25(IO기반의 입출력Part-2)\\src\\examp01\\FileInputStreamEx.java");
		
		
		
		//Read()에서 1바이트씩 읽어보기
		int data;
		int i = 0 ;
		
		
		
		
		//바이트 배열 이용한 방법--속도가 빠름--- 루핑 횟수가 2번
		
//		byte[] bArr = new byte[1000]; 바이트 배열을 쓰면 속도가 빨라진다.
//		while((data = fis.read(bArr)) != - 1) {
			//콘솔 출력(원래 System.out.println()을 사용해도 무방하나,
			//1바이트씩 읽다 보니 한글이 깨지는 경우가 있기 때문에 write()를 써도 괜찮다.
			//write()도 역시 출력 스트림이기 때문에 가능한 것이다.
//			System.out.write(bArr);
			
			//아래 코드는 한글이 깨진다,,, 1바이트씩 읽기때문에
//			System.out.print((char)data);
//			i++;
//		}
		
		
		
		
		
		
		//일반적인 방법 느림
		while((data = fis.read()) != - 1) {
			//콘솔 출력(원래 System.out.println()을 사용해도 무방하나,
			//1바이트씩 읽다 보니 한글이 깨지는 경우가 있기 때문에 write()를 써도 괜찮다.
			//write()도 역시 출력 스트림이기 때문에 가능한 것이다.
			System.out.write(data);
			
			//아래 코드는 한글이 깨진다,,, 1바이트씩 읽기때문에
//			System.out.print((char)data);
			i++;
		}
		System.out.println("루핑 수 : " + i);
		fis.close();
	}
}
