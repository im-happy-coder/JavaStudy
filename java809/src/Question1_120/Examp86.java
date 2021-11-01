package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp86 {

	public static void main(String[] args) {
		Path path1 = Paths.get("/software/././sys/readme.txt");
		Path path2 = path1.normalize(); //Path.normalize() 메서드를 호출하면 중복되는 부분을 제거할 수 있다 -- .이 중복되서 사라져서 3개 카운트 
		Path path3 = path2.relativize(path1); //상대경로를 생성
		System.out.print(path1.getNameCount()); //getNameCount()는 각요소의 갯수를 알수 있다 --기준 /
		System.out.print(":"+path2.getNameCount());  
		System.out.print(":"+path3.getNameCount());
		
		
		System.out.println();
		System.out.println("Path2의 normalize 중복제거" + path2);
		System.out.println("Path3의 relativeze 상대경로" + path3);
	}

}
//A. 5 : 3 : 6

//두 위치 사이의 경로 생성하기.
//- relativize() 메서드
//- 두경로 사이의 상대경로를 생성한다,
//- 원본 경로에서 인자로 전달된 위치로 끝나는 경로를 생성한다.
//- 새로운 경로는 원본경로의 상대경로가 된다.