package Question151_200;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Examp190 {

	public static void main(String[] args) throws IOException {
//		Assume the courses.txt is accessible.
//		Which code fragment can be inserted at line n1 to enable the code to print the content of the courses.txt file?
		Path file = Paths.get ("/courses.txt");
		List<String> fc = Files.readAllLines(file); fc.stream().forEach (s -> System.out.println(s));// line n1
		//답 : C. List<String> fc = Files.readAllLines(file); fc.stream().forEach (s -> System.out.println(s));
		
		
		

		
		// 파일 읽는 방법 2가지
//1. Stream<String> fc = Files.lines (file); fc.forEach (s – > System.out.println(s));
//2. List<String> fc = Files.readAllLines(file); fc.stream().forEach (s -> System.out.println(s));
//		readAllLines()는 받는객체가 List이여야한다,, lines나 readAllLines는 무조건 앞에   "Files." 이 명시되어야 한다.
	}

}
