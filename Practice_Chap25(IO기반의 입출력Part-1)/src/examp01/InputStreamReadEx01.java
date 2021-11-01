package examp01;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;

public class InputStreamReadEx01 {

	public static void main(String[] args) throws Exception{
		//일반예외가 발생하는데 그 예외를 JVM에게 던지고 있다.	파일이 없으면 IOException이 발생한다.
		//다형성이 적용된 코드---FileInputStream은 InputStream을 상속받고 있다.
		InputStream iStream = new FileInputStream("D:\\test.txt"); //입력 스트림
		int readByte; //읽은 바이트 수를 리턴 받는 변수
		
		//InputStream의 read()는 더이상 읽을게 없다면, -1값을 리턴한다.
		//기본적으로 이클립스는 한글은 2바이트로 읽어들인다.
		//방법 1
		while((readByte = iStream.read()) != -1) {  //read()는 1byte씩 읽는다.
			System.out.println("읽은 Byte 수 : " + readByte);   //아스키 코드값을 출력
			System.out.println("읽은 문자 : " + (char)readByte); //강제 타입 캐스팅 후 문자를 출력
		}
		System.out.println(Charset.defaultCharset());
		
		//방법2  허나, 위처럼 코드를 줄여주는게 가장 좋다.
//		while(true) {
//			readByte = iStream.read();
//			if(readByte == -1) {
//				break;
//			}
//			System.out.println("읽은 Byte 수 : " + readByte);   //아스키 코드값을 출력
//			System.out.println("읽은 문자 : " + (char)readByte); //강제 타입 캐스팅 후 문자를 출력
//		}
		iStream.close();//리소스를 닫음
	}

}
