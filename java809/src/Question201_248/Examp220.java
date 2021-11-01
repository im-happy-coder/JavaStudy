package Question201_248;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp220 {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get ("/data/december/log.txt");  
		Path destination = Paths.get("/data");  //("/data/log.txt");
		Files.copy (source, destination);
		
//		/data/december/log.txt is accessible and contains:
//			and assuming that the file
//			10-Dec-2014 Executed successfully
//			What is the result?
//			log.txt is created in the /data directory and the content of the /data/december/log.txt file is copied to it.
//		
		
		
//		("/data") 일때 답 : A FileAlreadyExistsException is thrown at run time.
//		
//	("/data/log.txt");로 바꾸게 되면 답이
//	log.txt라는 이름의 파일이 / data 디렉토리에 생성되고 / data / december /log.txt 파일의 내용이 여기에 복사됩니다.
//		A file with the name log.txt is created in the /data directory and the 
//				content of the /data/december/log.txt file is copied to it.
		
		
	}

}
