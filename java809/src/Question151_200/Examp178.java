package Question151_200;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp178 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log"); //resolve()는 조합하는거임
		Path path2 = Paths.get("/server/exe/");
		Path res2 = path2.resolve("/readme/"); //이경우는 /경로가 있기때문에 조합이 불가능함..
		System.out.println(res1);
		System.out.println(res2);

		//답 : C. /app/./sys/log /readme
	
		//D. /app/./sys/log /server/exe/readme 이결과가 나올려면 /readme/ --> readme/로 바꾸셈

	}

}


/*
두 경로를 조합하기
// 고정 경로(fixed path)를 정의한다
Path base = Paths.get("/rafaelnadal/tournaments/2009");


// C:\rafaelnadal\tournaments\2009\BNP.txt"
Path path_1 = base.resolve("BNP.txt");
path_1.toString();


// C:\rafaelnadal\tournaments\2009\AEGON.txt"
Path path_2 = base.resolve("AEGON.txt");
path_2.toString();
*/