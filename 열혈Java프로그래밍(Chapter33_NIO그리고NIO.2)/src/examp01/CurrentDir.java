package examp01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CurrentDir {

	public static void main(String[] args) {
//		현재 디렉토리 정보의 출력 예
		Path cur = Paths.get(""); //현재 디렉토리 정보 '상대 경로' 형태로 담긴  인스턴스 생성
		String cdir;
		
		
		if(cur.isAbsolute()) //절대경로 스타일로 가지고 있느냐고 물어봄
			cdir = cur.toString();  //true이면 그냥 출력
		else
			cdir = cur.toAbsolutePath().toString(); //false이면 절대경로 출력
		
		System.out.println("Current dir :  "+cdir);
	}

}
