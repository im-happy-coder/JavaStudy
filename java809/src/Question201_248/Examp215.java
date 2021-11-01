package Question201_248;

import java.io.File;
import java.io.IOException;

public class Examp215 {
//	public void recDelete(String dirName) throws IOException {
//	File [] listOfFiles = new File (dirName) .listFiles();
//	if (listOfFiles != null && listOfFiles.length >0) {
//	for (File aFile : listOfFiles) {
//		if (aFile.isDirectory()) {
//			recDelete(aFile.getAbsolutePath ());
//				} else {
//						if (aFile.getName ().endsWith (".class"))
//								aFile.delete ();
//				}
//			}
//		}	
//	}
	
	//위의 코드 일때 정답은 
//	A.The method deletes all the .class files in the Projects directory and its subdirectories.
	//	이 메서드는 Projects 디렉터리 및 하위 디렉터리에있는 모든 .class 파일을 삭제합니다.
	
	public void recDelete (String dirName) throws IOException {
		File [ ] listOfFiles = new File (dirName) .listFiles();
		if (listOfFiles != null && listOfFiles.length >0) {
		for (File aFile : listOfFiles) {
		if (!aFile.isDirectory ()) {
		if (aFile.getName ().endsWith (".class"))
		aFile.delete ();
		}
		}
		}
		}
	
	// 위 코드는 하위디렉토리의 class파일은 삭제하지 않고,, Projects폴더의 class파일만 삭제함
	// 즉, 위의 코드일 시 정답은   B.The method deletes the .class files of the Projects directory only.
//			이 메서드는 Projects 디렉터리의 .class 파일 만 삭제합니다.
	
	
//	C.The method executes and does not make any changes to the Projects directory.
//	메서드가 실행되고 Projects 디렉터리를 변경하지 않습니다.
	//C가 답이 될려면 
	//아래 보면 !와 recDelete를 재귀호출하고, else문까지 사용하면 답이 C
//	public void recDelete(String dirName) throws IOException {
//	File [] listOfFiles = new File (dirName) .listFiles();
//	if (listOfFiles != null && listOfFiles.length >0) {
//	for (File aFile : listOfFiles) {
//		if (!aFile.isDirectory()) {
//			recDelete(aFile.getAbsolutePath ());
//				} else {
//						if (aFile.getName ().endsWith (".class"))
//								aFile.delete ();
//				}
//			}
//		}	
//	}
	
	public static void main(String[] args) throws IOException {
		new Examp215().recDelete ("D:\\Projects");
}
}

/*
A. The method deletes all the .class files of the Projects directory only.
B. The method deletes the Projects directory.
C. The method executes and does not make any changes to the
D. The method throws an IOException.
위 답변이 이상함 아래 참고
A.
The method deletes all the .class files in the Projects directory and its subdirectories.  ---이게 맞는 답변임
이 메서드는 Projects 디렉터리 및 하위 디렉터리에있는 모든 .class 파일을 삭제합니다.
B.
The method deletes the .class files of the Projects directory only.
이 메서드는 Projects 디렉터리의 .class 파일 만 삭제합니다.
C.
The method executes and does not make any changes to the Projects directory.
메서드가 실행되고 Projects 디렉터리를 변경하지 않습니다.
D.
The method throws an IOException.
이 메서드는 IOException을 throw합니다.



https://www.briefmenow.org/oracle/what-is-the-result-936/



*/