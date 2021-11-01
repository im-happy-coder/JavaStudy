package Question121_150;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp133 {

	public static void main(String[] args) throws IOException {
//		Which code fragment can be inserted at line n1 to enable the code to print only /company/emp?
		Stream<Path> stream = Files.list(Paths.get ("/company/emp"));//line n1  //\company\emp 출력
		stream.forEach(s->System.out.println(s));
		
	}

}
//find를 이용해서 어떤 디렉토리에 존재하는 모든 파일을 가져오도록 하는 함수
//Files.walk(path); 모든 하위디렉토리의 파일을 불러온다.
//Files.list(path);  /company의 현재 디렉토리에 있는 파일만 가져옴



//Stream<Path> stream = Files.find( Paths.get ("/company"), 1, (p,b) -> b.isDirectory (), 
//		 FileVisitOption.FOLLOW_LINKS); => \company
//											\company\emp   둘다 출력


//walk는 \company
//\company\emp
//\company\emp\benefits
//\company\emp\benefits\b1.txt
//\company\emp\info.txt        
