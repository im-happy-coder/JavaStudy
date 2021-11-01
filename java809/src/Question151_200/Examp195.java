package Question151_200;

import java.io.File;
import java.io.IOException;

public class Examp195 {
	public void recDelete (String dirName) throws IOException {
		File [ ] listOfFiles = new File (dirName) .listFiles();
			if (listOfFiles != null && listOfFiles.length >0) {
				for (File aFile : listOfFiles) {
					if (!aFile.isDirectory ()) { //aFile.isDirectory ()=하위디렉토리가 있다면 true
												 //!aFile.isDirectory ()=하위디렉토리가 없다면 true
//						recDelete (aFile.getAbsolutePath ());
//					} else {  //문제에 이 문장이 없음
						if (aFile.getName ().endsWith (".class"))
							aFile.delete ();
						}
					}
				}
		}

	 
	//답 : B. The method deletes the .class files of the Projects directory only.
//		B.이 메서드는 Projects 디렉터리의 .class 파일 만 삭제합니다.
	
	
	
	
	
//  https://www.briefmenow.org/oracle/what-is-the-result-936/	
		
//	A. The method deletes all the .class files in the Projects directory and its subdirectories.
	//A.이 메서드는 Projects 디렉터리와 하위 디렉터리에있는 모든 .class 파일을 삭제합니다.
	//  if(aFile.isDirectory())  일때
	
//	B. The method deletes the .class files of the Projects directory only.
	//답 : B.이 메서드는 Projects 디렉터리의 .class 파일 만 삭제합니다.
	//  if(!aFile.isDirectory()) 일때
	
//	C. The method executes and does not make any changes to the Projects directory.
//	메서드가 실행되고 Projects 디렉터리를 변경하지 않습니다. 
	// 이거아마 마지막 조건문이 .class가 아니거나 다른 걸루 줄듯
	
//	D. The method throws an IOException. 
	//이건 main메서드 뒤에 throws를 던져주지 않았다면 오류 날듯
	
	//8번문제 ,, 13번 문제

	public static void main(String[] args) {

	}

}
