package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathCreate {

	public static void main(String[] args) throws IOException {
		Path fp = Paths.get("C:\\JavaStudy\\empty.txt");
		fp = Files.createFile(fp); //파일생성, 단 위에 경로가 유효해야한다.!
		
		Path dp1 = Paths.get("C:\\JavaStudy\\Empty");
		fp = Files.createDirectory(dp1); //디렉토리 생성, 단 위에 경로가 유효해야한다.!
		
		
		Path dp2 = Paths.get("C:\\JavaStudy\\Empty");
		fp = Files.createDirectories(dp2); //경로의 모든 디렉토리 생성, 이건 상위디렉토리(JavaStudy)가 없으면 만들음
		
		
		System.out.println("File : " + fp);
		System.out.println("Dir1 : " + dp1);
		System.out.println("Dir2 : " + dp2);

	}

}
