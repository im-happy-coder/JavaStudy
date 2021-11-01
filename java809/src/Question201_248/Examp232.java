package Question201_248;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp232 {

	public static void main(String[] args) {
		Stream<Path> paths = Stream.of (Paths. get("/data.doc"),
				Paths. get("/data.txt"),
				Paths. get("/data.xml"));
				paths.filter(s-> s.toString().endsWith("txt")).forEach(
				s -> {
				try {
				Files.readAllLines(s)  //파일 내용 출력
				.stream()
				.forEach(System.out::println); //line n1
				} catch (IOException e) {
				System.out.println("Exception");
				}
			});
	}

}

//답 : A. The program prints the content of data.txt file.   프로그램은 data.txt 파일의 내용을 인쇄합니다.