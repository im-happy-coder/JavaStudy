package Question151_200;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class Examp191 {

	public static void main(String[] args) throws IOException {
		//.walk(Paths.get("경로"))  하위 디렉토리 파일 불러오기
		//아래 스트림이 walk면 하위 디렉토리 모든 것을 가져옴
		Stream<Path> files = Files.list(Paths.get(System.getProperty("user.home"))); 
		files.forEach (fName -> { //line n1 
			try {
			Path aPath = fName.toAbsolutePath(); //line n2    toAbsolutePath()는 상대경로를 절대경로로 반환한다.
			System.out.println(fName + ":"
			+ Files.readAttributes(aPath, BasicFileAttributes.class).creationTime//생성시간
			());
			} catch (IOException ex) {
			ex.printStackTrace();
			}
			});
		//답 : C. The files and folders in the home directory are listed along with their attributes.
	}
}

//결론 Files.list는 user.home의 리스트만 가져옴 = 답 : C
// 	 Files.Walk는 user.home의 하위디렉토리까지 가져옴 = 답 :A 



//31번 문제와 똑같음
//31번은 A. All files and directories under the home directory are listed along with their attributes.
//A. 홈 디렉토리 아래의 모든 파일과 디렉토리가 속성과 함께 나열됩니다.
//directories =  Files.walk



//191번 문제는 C. The files and folders in the home directory are listed along with their attributes.
//C. 홈 디렉토리의 파일과 폴더가 해당 속성과 함께 나열됩니다.
//folders = Files.list