package examp01;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;

public class PathCopyMove {

	public static void main(String[] args) throws IOException {
//		파일 및 디렉토리의 복사
		Path src = Paths.get("D:\\JavaStudy\\CopyFileFormFiles.java"); //Source파일 - 애는 존재하고
		Path dst = Paths.get("D:\\JavaStudy\\CopyFileFormFiles2.java"); //targer파일 - 애는 존재하지 않는다는 가정
//		Path dst = Paths.get("D:\\CopyFileFormFiles2.java"); 경로가 이러면 src의 파일이 이경로로 CopyFileFormFiles2라는 파일의 이름으로 복사가 된다.
		
		
		//src가 지시하는 파일을 dst가 지시하는 위치와 이름으로 복사
		Files.copy(src, dst, StandardCopyOption.REPLACE_EXISTING); //REPLACE_EXISTING : 이미 파일이 존재한다면 해당 파일을 대체한다.
//		src를 dst로 복사해라
		//REPLACE_EXISTING : 이미 파일이 존재한다면 해당 파일을 대체한다.		
		//COPY_ATTRIBUTES : 파일의 속성까지 복사를 한다.
		
//		파일 및 디렉토리의 이동
		
		Path src2 = Paths.get("D:\\JavaStudy\\Dir1");  //소스파일인 애가 존재하지 않으면 nosuchFileException 발생
		Path dst2 = Paths.get("D:\\JavaStudy\\Dir2");
//		Path dst2 = Paths.get("D:\\Dir2"); 경로가 이거면 src2의 dir1이 D:\\경로에 Dir2가 복사가 된다.
		
		//src2가 지시하는 디렉토리를 dst가 지시하는 디렉토리로 이동
		Files.move(src2, dst2, StandardCopyOption.REPLACE_EXISTING);
		//dir1을 dir2로 바꿔라(이동) 뜻
		//REPLACE_EXISTING : 이미 파일이 존재한다면 해당 파일을 대체한다.
		
		
		
	}

}
