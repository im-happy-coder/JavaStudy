package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp13_1 {

	public static void main(String[] args) throws IOException {
		Path source = Paths.get ("/data/december/log.txt");
		Path destination = Paths.get("/data");
//		Path destination = Paths.get("/data/log.txt"); //이렇게 하면 복사됨
		Files.copy (source, destination);

//		답 : . D. A FileAlreadyExistsException is thrown at run time.
		
		
		
//		A. A file with the name log.txt is created in the /data directory and the content of the
//		/data/december/log.txt file is copied to it.
//		B. The program executes successfully and does NOT change the file system.
//		C. A FileNotFoundException is thrown at run time.
//		D. A FileAlreadyExistsException is thrown at run time.
	}

}
