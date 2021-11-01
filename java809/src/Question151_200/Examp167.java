package Question151_200;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Examp167 {

	public static void main(String[] args) throws IOException {
//		Given that these files exist and are accessible:
//			/sports/info.txt
//			/sports/cricket/players.txt
//			/sports/cricket/data/ODI.txt
//			and given the code fragment:
//		디렉토리 구조의 파일에 대한 소프트 링크 / 기호 링크가 없다고 가정하면 결과는 무엇입니까?
//		Assuming that there are NO soft-link/symbolic links to any of the files in the directory structure, what is the result?

		//문제에서 기호 링크가 없다고 가정했기 때문에 답은 D가 된다.

//		답:	파일 구조가 없다면 D. An Exception is thrown at runtime.
		//있다면 2를 출력한다.
		
		//나는 D드라이브에 파일을 만들어 놨기 때문에 2를 출력한다.
		//즉, txt파일이 spots 디렉토리 하위에 3개가 있기때문에 maxDepth를 4를하면 3개만 나오고, 2를하면 2개만 나온다.
//			maxDepth를 2로 주었기 때문에 2개까지만 찾는다. 5개주면 txt파일이 3개있으므로 3개만 출력된다.
		int maxDepth =2;
		Stream<Path> paths = Files.find(Paths.get("/sports"),
		maxDepth,
		(p, a) -> p.getFileName().toString().endsWith ("txt"), //txt파일만 찾는다.
		FileVisitOption.FOLLOW_LINKS);
		Long fCount = paths.count();
		System.out.println(fCount);
	}

}
/*
Files.find(start, maxDepth, (path, attr) -> true)
Integer.MAX_VALUE로 하면 모든 파일을 가져올 수 있다


예를 들어 .java파일만 찾고 싶다면
(path, attr) -> path.toString().endsWith(".java")
*/