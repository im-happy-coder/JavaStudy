package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;


public class Examp31 {

	public static void main(String[] args) throws Exception {
	
	  						//.walk(Paths.get("경로"))  하위 디렉토리 파일 불러오기
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home"))); files.forEach (fName ->  //line n1 
		{
			try {
				Path aPath = fName.toAbsolutePath();
				System.out.println(fName + ":" + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime()); //파일생성날짜를가져옴
			} catch (IOException ex) {
				ex.printStackTrace();
				}
		});
		
//		답 : A. All files and directories under the home directory are listed along with their attributes.
//		A. 홈 디렉토리 아래의 모든 파일과 디렉토리가 속성과 함께 나열됩니다.	
		
//			try {
//				Path aPath = fName.toAbsolutePath(); //line n2   //toAbsolutePath()는 상대경로를 절대경로로 반환한다.
//				System.out.println(fName + ":"
//				+ Files.readAttributes(aPath,   //Files.readAttributes(파일 패스, View 클래스); 파일속성을 가져온다.
//				BasicFile.Attributes.class).creationTime());  //creationTime()파일의 생성 날짜
//				} catch (IOException ex) {
//				ex.printStackTrace();
//				}});
		
		
	}

}
