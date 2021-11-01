package Question1_120;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp12 {

	public static void main(String[] args) throws Exception {
		Path file = Paths.get ("D:\\courses.txt");
		Files.lines(file); Stream<String> fc = Files.lines(file);   // 가능
//		List<String> fc = Files.readAllLines(file); fc.stream().forEach (s -> System.out.println(s)); //가능
		fc.forEach (s -> System.out.println(s));
		
		
//		1. 파일 읽기 : line
//		String fileName = "D:/file.txt";
//		Stream<String> stream = Files.lines(Paths.get(fileName), Charset.forName("euc_kr"));
//		stream.collect(Collectors.toList()).forEach(System.out::println);
//		stream.close();
		
//		Files.lines 방법
//		Files.lines(file); Stream<String> fc = Files.lines(file);  
		
		
//		2. 파일 읽기 : readAllLines
//		String fileName = "D:/file.txt";
//		List<String> lines = Files.readAllLines(Paths.get(fileName), Charset.forName("euc_kr"));
//		lines.forEach(System.out::println);
		
//		Files.readAllLines 방법
//		List<String> fc = Files.readAllLines(file); fc.stream().forEach (s -> System.out.println(s));
		
		
		
		
		
		
		
//답 D. Stream<String> fc = Files.lines (file); fc.forEach (s - > System.out.println(s));
	
	}
}
