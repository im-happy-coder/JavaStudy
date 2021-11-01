package Question1_120;

import java.nio.file.Path;
import java.nio.file.Paths;

public class FExamp105 {

	public static void main(String[] args) {
//		1 행에 삽입 할 때 코드가 /First.txt를 인쇄 할 수 있도록하는 코드 조각은 무엇입니까?
//	Which code fragment, when inserted at line n1, enables the code to print /First.txt?	
		Path iP = Paths.get ("/", "First.txt");//line n1
		System.out.println(iP);
	}

}
