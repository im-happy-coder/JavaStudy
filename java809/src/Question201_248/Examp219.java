package Question201_248;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Examp219 {

	public static void main(String[] args) {
		Path p1 = Paths.get("/Pics/MyPic.jpeg"); //디렉토리가 없어도 출력한다. 이경로로 출력함
		System.out.println (p1.getNameCount() + //글자수 기준"/" 즉 pics와 mypic 총 2개
		":" + p1.getName(1) + //1번째 이름  MyPic
		":" + p1.getFileName()); //그리고 경로의 파일 이름MyPic
		
//		Pics directory does NOT exist. Pics 디렉토리가 없습니다.
		
		//getName(1)일때의 답 :B. 2:MyPic.jpeg: MyPic.jpeg
		//getName(0)일때의 답 :D. 2:Pics: MyPic.jpeg
	}

}
