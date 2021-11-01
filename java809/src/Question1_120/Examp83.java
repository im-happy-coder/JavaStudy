package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp83 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log"); //상대경로
		Path path2 = Paths.get("/server/exe/");  
		Path res2 = path2.resolve("/readme/");   //절대경로 = resovlve X
//		Path res2 = path2.resolve("readme"); // 상대경로 O--  결과 :/server/exe/readme 
		System.out.println(res1);
		System.out.println(res2);
		
		// ("/ readme /")는 절대 경로이므로이 경로는 resolve 메서드로 변경되지 않으며 동일한 경로 / readme를 사용합니다.
		
		//결과 :  /app/./sys/log /readme
	}

}
