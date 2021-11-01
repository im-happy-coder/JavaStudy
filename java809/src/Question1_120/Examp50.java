package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp50 {

	public static void main(String[] args) {
		Stream<Path> paths = Stream.of (Paths. get("D:\\data.doc"),  
				Paths. get("D:\\data.txt"),
				Paths. get("D:\\data.xml"));
//				paths.filter(s-> s.toString().contains("data")).forEach(
				paths.filter(s-> s.toString().endsWith("txt")).forEach(		 //이건 즉, 끝부분이 txt이면 그 내용만 출력한다.
				//	endsWith("txt")이 문자열 txt가 인스턴스의 끝 부분과 지정한 문자열이 일치하는지를 확인합니다.
						
				s -> {
				try {
				Files.readAllLines(s)
				.stream()
				.forEach(System.out::println); //line n1
				} catch (IOException e) {
				System.out.println("Exception");
				}
				}
				);
	}

}
// endsWith("txt")일때의 정답 : The program prints the content of data.txt file.
//							프로그램은 data.txt파일만 출력한다.

// contains("data")일떄의 정답 : D. The program prints the content of the three files.  
//       					 프로그램은 3개의 파일의 내용을 인쇄한다.