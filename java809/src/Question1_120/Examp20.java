package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp20 {

	public static void main(String[] args) {
		
		Path p1 = Paths.get("/Pics/MyPic.jpeg");
		System.out.println(p1.getNameCount() +":" + p1.getName(1) + ":" + p1.getFileName());
		//p1.getName(1)의 인덱스가 1부터 시작이여서 pics는 0번째 인덱스고,, Mypic이 1번째 인덱스여서 이것을 출력한다.
		
		
//		Path 개체의 getNameCount 메서드는 경로 구조에있는 파일 또는 디렉터리 이름의 수를 계산합니다. 
//		이 질문의 경로는 "/Pics/MyPic.jpeg"이므로 "Pics"와 "MyPic.jpeg"라는 두 가지 이름이 있습니다.
//
//		Path 개체의 getName 메서드는 경로 구조에서 파일 또는 디렉터리 이름을 가져옵니다. 인덱스 값은 0부터 시작합니다.
//
//		Path 개체의 getFileName 메서드는 마지막 파일이름을 가져옵니다.
//
//		따라서이 질문은 파일 또는 디렉토리가 존재하는지 여부에 관계없이 출력됩니다.
		
		
//		답 : 2:MyPic.jpeg:MyPic.jpeg 
	}

}
