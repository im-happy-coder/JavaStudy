package Question201_248;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp214 {

	public static void main(String[] args) throws IOException {
		Path file = Paths.get ("/courses.txt");
		// line n1
		Stream<String> fc = Files.lines(file); fc.forEach(n -> System.out.println(n));
		
//			lines()메서드는 Stream<String>으로 받아야한다.  
			//readAlllines()는public static List<String> readAllLines(Path path, Charset cs) throws IOException
//		List<String> lines = Files.readAllLines(path, charset);


		
		
//		line n1 to enable the code to print the content of the courses.txt file?
//		답 : Stream<String> fc = Files.lines(file); fc.forEach(n -> System.out.println(n));
		
		
		
//		A. List<String> fc = Files.list(file); fc.stream().forEach (s - > System.out.println(s));
		// 이건 불가능한 식
//		B. Stream<String> fc = Files.readAllLines (file); fc.forEach (s - > System.out.println(s));
		// 이건 List(String)으로 받아주면 가능
//		C. List<String> fc = readAllLines(file); fc.stream().forEach (s - > System.out.println(s));
		// 이건 readAllLines를 Files.readAllLines로 바꿔줘야함
//		D. Stream<String> fc = Files.lines (file);fc.forEach (s – > System.out.println(s));
		
		
//		 

	}

}

//12번문제