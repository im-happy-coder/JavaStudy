package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FExamp120 {

	public static void main(String[] args) throws IOException {
		Stream<String> lines = Files.lines (Paths.get("D:/data.txt")); 
		lines.forEach(c -> System.out.println(c));
		
/*
 * Assume customers.txt is accessible and contains multiple lines.
Which code fragment prints the contents of the customers.txt file?
Customers.txt에 액세스 할 수 있고 여러 줄이 포함되어 있다고 가정합니다.
Customers.txt 파일의 내용을 인쇄하는 코드 조각은 무엇입니까?

A. Stream<String> stream = Files.find (Paths.get ("customers.txt")); stream.forEach((String c) -> System.out.println(c));
B. Stream<Path> stream = Files.find (Paths.get ("customers.txt")); stream.forEach( c) -> System.out.println(c));
C. Stream<Path> stream = Files.list (Paths.get ("customers.txt")); stream.forEach( c) -> System.out.println(c));
D. Stream<String> lines = Files.lines (Paths.get ("customers.txt")); lines.forEach( c) -> System.out.println(c));
답 : D
 */
	}

}
