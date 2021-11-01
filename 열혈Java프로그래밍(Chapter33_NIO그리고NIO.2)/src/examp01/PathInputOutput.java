package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class PathInputOutput {

	public static void main(String[] args) throws IOException {
//		바이트 단위 입력과 출력
//		java.nio.file.Files의 메소드들(바이트 단위 입출력) , 무겁다(데이터의 양이 많을때), open과 close의 과정이 없다. 성능이 좋다는건 아니다.
		Path fp = Paths.get("D:\\JavaStudy\\simple.bin");
		
		//파일 생성, 파일이 존재하면 예외 발생
		fp = Files.createFile(fp);
		
		byte buf1[] = {0x13, 0x14, 0x15}; //파일에 쓸 데이터
		for(byte b: buf1) //저장할 데이터의 출력을 위한 반복문
			System.out.print(b+"\t");
		System.out.println();
		
		//파일에 데이터 쓰기
		Files.write(fp, buf1, StandardOpenOption.APPEND); //APPEND옵션은 파일을 추가한다
		
		//파일로부터 데이터  읽기
		byte buf2[] = Files.readAllBytes(fp);
		
		for(byte b: buf2) //읽어 들인 데이터의 출력을 위한 반복문
			System.out.print(b + "\t");
		System.out.println();
		
		
		
//		StandardOpenOption
//		APPEND 파일을 새로 추가한다.
//		CREATE 파일이 존재하지 않으면 생성한다.
//		CREATE_NEW 새 파일을 생성한다. 이미 파일이 존재하면 예외 발생
//		TRUNCATE_EXISITING 쓰기 위해 파일을 여는데 파일이 존재하면 파일의 내용을 덮어쓴다.
		
		
	}

}
