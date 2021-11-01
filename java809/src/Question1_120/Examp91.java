package Question1_120;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

import javax.sound.sampled.Line;

//Given the content of the employee.txt file:
//Every worker is a master.
//Given that the employee.txt file is accessible and the file allemp.txt does NOT exist, and the code fragment:
//employee.txt 파일에 액세스 할 수 있고 allemp.txt 파일이 존재하지 않고 코드 조각이 존재하는 경우 
public class Examp91 {

	public static void main(String[] args) {
		try {
			List<String> content = Files.readAllLines(Paths.get("D:/employee.txt"));
			content.stream().forEach(line ->{
				try {
					Files.write(
							Paths.get("D:/allemp.txt"), 
							line.getBytes(), 
							StandardOpenOption.APPEND);//APPEND가 아닌 CREATE여야한다.
				} catch (IOException e) {System.out.println("Exception 1");}
				});
			}catch (IOException e) {System.out.println("Exception 2");}
		}
	}
				// APPEND 인경우 답----  Exception 1
/*
StandardOpenOption.APPEND 대신 StandardOpenOption.CREATE 인 경우  -- 
그런 다음 allemp.txt 파일을 만들고 employee.txt에서 데이터를 복사합니다.
D. allemp.txt is created and the content of employee.txt is copied to it. 이게 답이 됨
*/