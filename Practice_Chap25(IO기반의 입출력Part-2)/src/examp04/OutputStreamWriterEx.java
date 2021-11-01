package examp04;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterEx {

	public static void main(String[] args) throws Exception {
		//주 스트림을 생성함.
		FileOutputStream fStream = new FileOutputStream("D:\\writer.txt");   //c드라이브에 파일 권한이 없으면 에러가 날수도있다.
		
		//보조스트림 연결함.
		Writer writer = new OutputStreamWriter(fStream); //보조스트림에 주스트림을 연결
		
		
		//저장할 데이터
		String data = "문자 데이터를 보조 출력스트림으로 보내어 바이트 기반으로 변환되어 저장됨";
		writer.write(data); //보조 스트림 즉, 문자기반 스트림인 outputStreamWriter로 data를 보내어 바이트 기반으로 변환 시켜주는 역할을 함.
		
		System.out.println("파일이 저장되었습니다.");
		
		
		
		
		
		
		
		
		writer.flush();
		writer.close();
	}

}
