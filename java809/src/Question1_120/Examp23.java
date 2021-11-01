package Question1_120;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp23 {

	public static void main(String[] args)  throws Exception{
		Path source = Paths.get("D:/data/december/log.txt");
//		Path destination = Paths.get("/data"); // 틀린 복사 위치
		Path destination = Paths.get("/data/log.txt"); // 올바른 복사위치
		Files.copy(source, destination);
	}
//	Assuming that the file /data/december/log.txt does not exist  -- 파일이 없다고 가정하면 복사위치가 틀린복사 위치여도 답은 D
//	답: D. A NoSuchFileException is thrown at run time.	
	
	
//	 assuming that the file /data/december/log.txt is accessible and contains:
//		 10-Dec-2014 – Executed successfully  ---파일이 있는데 틀린복사 위치라면 이게 답
//	답 : FileAlreadyExistsException이 발생한다.
	
//	Path destination = Paths.get("/data/log.txt"); //복사위치가 올바르고  december에 원본파일이 있다고 가정한다면
//	이 답은 A file with the name log.txt is created in the /data directory and the content of the /data/december/
//	log.txt file is copied to it. ------------/data 폴더에  log.txt가 복사가 된다.



}
