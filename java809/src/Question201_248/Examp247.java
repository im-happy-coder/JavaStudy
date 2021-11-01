package Question201_248;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Examp247 {
	public static void main(String[] args) throws IOException {
//		/green.txt and /colors/yellow.txt are accessible, and the code fragment:
		Path source = Paths.get("/green.txt");
				Path target = Paths.get("/colors/yellow.txt");
				Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);//파일이동하고 green.txt는 제거된다
				Files.delete(source); //파일 삭제--green.txt는 move에서 지워 졌기때문에 nosuchException 발생
				
				
				//nosuchfileException이 발생하지만
				//green.txt는 사라지고, 이 내용이 yellow.txt에 들어간다
//				A. The yellow.txt file content is replaced by the green.txt file content and an exception is thrown.
//				. yellow.txt 파일 내용이 green.txt 파일 내용으로 바뀌고 예외가 발생합니다.
//				NoSuchFileException이 발생합니다. 삭제할 소스 파일을 찾을 수 없기 때문입니다.
//
	}

}


//파일 copy 옵션은
//대상이 존재할 때는 복사 또는 이동이 실패한다. 존재하는 대상을 덮어쓰려면 REPLACE_EXISTING 옵션을 사용한다. 
//모든 파일 속성을 복사하려면 COPY_ATTRIBUTES 옵션을 사용한다


//파일 move 옵션은 이동이 원자적으로 동작해야 함을 명시할 수 있다. 이 경우 이동이 성공적으로 완료하거나 소스가 계속되서 존재함을 보장받는다. 원자적인 이동에는 ATOMIC_MOVE 옵션을 사용한다