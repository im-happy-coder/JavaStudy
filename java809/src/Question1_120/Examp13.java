package Question1_120;

import java.io.File;
import java.io.IOException;

public class Examp13 {
	public void recDelete (String dirName) throws IOException {
		File [ ] listOfFiles = new File (dirName).listFiles();
		
		if (listOfFiles != null && listOfFiles.length >0) {
			for (File aFile : listOfFiles) {
				if (aFile.isDirectory ()) {
					recDelete (aFile.getAbsolutePath ()); //recDelete메서드 호출
					} else {
								if (aFile.getName ().endsWith(".class"))
									aFile.delete ();
							}
				}
			}
		}
}

//getPath() : 입력된 경로 출력
//getAbsolutePath() : 현재경로+입력된경로 ( 연산되지 않은경로 )
//getCanonicalPath() : 현재경로+입력된경로( 연산된 경로)
//ex)
//File file = new File("..")
//file.getPath(); ==> 출력 : ..
//file.getAbsolutePath(); ==> 출력 : C:\sou\project\src\..
//file.getCanonicalPath(); ==> 출력 : C:\sou\project


//Projects에 .class 파일이 포함 된 하위 디렉터리가 포함되어 있고 호출시 recDelete () 메서드에 인수로 전달된다고 가정합니다.
//결과는 무엇입니까? A
//A. The method deletes all the .class files in the Projects directory and its subdirectories. // 답
//B. The method deletes the .class files of the Projects directory only.
//C. The method executes and does not make any changes to the Projects directory.
//D. The method throws an IOException.
//A.이 메서드는 Projects 디렉터리와 하위 디렉터리에있는 모든 .class 파일을 삭제합니다.
//B.이 메서드는 Projects 디렉터리의 .class 파일 만 삭제합니다.
//C. 메서드가 실행되고 Projects 디렉터리를 변경하지 않습니다.
//D. 메서드에서 IOException이 발생합니다.