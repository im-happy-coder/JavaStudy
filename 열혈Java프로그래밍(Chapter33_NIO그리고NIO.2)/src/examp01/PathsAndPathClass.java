package examp01;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathsAndPathClass {

	public static void main(String[] args) {
//		java.nio.file.path 파일 및 디렉토리의 경로표현을 위해 자바 7에서 추가된 인터페이스
//		ex) Path path = Pahts.get("C:\\JavaStudy\\PathDemo.java"); --이경로에 실제가 있어야하는건 아니다
//		path getRoot() 루트 디렉토리 반환
//		path getParent() 부모 디렉토리 반환
//		path getFileName() 파일 이름 반환
		
		Path pt1 = Paths.get("C:\\JavaStudy\\PathDemo.java");  //즉, 이 경로는 파일이 있든 없든 상관없이 이 경로대로 결과를 반환한다.
		Path pt2 = pt1.getRoot();   //Get 메소드 호출의 성공 여부는 해당 파일 또는 디렉토리의 존재 여부와 상관없다.
		Path pt3 = pt1.getParent();
		Path pt4 = pt1.getFileName();
		
		System.out.println("Absolute: "+pt1);
		System.out.println("Root: " +pt2);
		System.out.println("Parent: "+pt3);
		System.out.println("File: "+pt4);
				
	}

}
