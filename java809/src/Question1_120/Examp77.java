package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Examp77 {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get("D:/green.txt");
				Path target = Paths.get("D:\\colors/yellow.txt");
				Files.move(source, target, StandardCopyOption.ATOMIC_MOVE); //source(green)이 targer(yellow)로 이동(move)한다.
				Files.delete(source);   //green.txt가 move에서 yellow로 이동되어서 삭제되었기 떄문에 delete는 green.txt가 없기때문에 예외가 발생된다.
	}

}
//B. The yellow.txt file content is replaced by the green.txt file content and an exception is thrown.
//B. yellow.txt 파일 내용이 green.txt 파일 내용으로 바뀌고 예외가 발생합니다.


//원자적 이동을 명시하려면 ATOMIC_MOVE 옵션을 사용해야 한다.Files.move(fromPath, toPath, StandardCopyOption.ATOMIC_MOVE);
//ATOMIC_MOVE는 FileAlreadyExistsException이 발생하지 않도록합니다. 파일이 원자 이동 조치에 의해 이미 제거되었으므로 delete 메소드는 예외를 발생시킵니다. 
//  즉, ATOMIC_MOVE는 FileAlreadyExistsException예외를 발생시키지 않는 대신에 source파일을 제거하고 target에 내용을 저장한다.


//만약 Files.move(source, target) ATOMIC_MOVE옵션이 없다면, 
//D. A FileAlreadyExistsException is thrown at runtime. 이게 정답임


// copy 할때는
//빈 디렉터리(empty directory)를 이동할 때도 이 명령을 사용할 수 있다.
//대상이 이미 있으면 복사나 이동에 실패한다. 기존 대상에 덮어쓸 때는 REPLACE_EXISTING 옵션을 사용한다. 
//모든 파일 속성(file attribute)을 복사할 때는 COPY_ATTRIBUTES 옵션을 사용한다. 다음 방법으로 이 옵션들을 전달한다.
//Files.copy(fromPath, toPath, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.COPY_ATTRIBUTES);
//REPLACE_EXISTING 기존대상 덮어쓰기
//COPY_ATTRIBUTES  모든 파일 속성을 복사
