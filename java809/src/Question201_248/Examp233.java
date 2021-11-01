package Question201_248;

import java.io.IOException;
//"final" 클래스는 상속을 금지 시킵니다.
//"final" 이라는 예약어가 붙은 클래스와 메소드는 상속과 오버라이드가 막히게 되기 때문입니다. 
final class Folder implements AutoCloseable { //line n1
	//line n2
	public void close () throws IOException {
		System.out.print("Close");
		}
	public void open () {
	System.out.print("Open");
	}
	}
public class Examp233 {

	public static void main(String[] args) throws Exception {
		 try (Folder f = new Folder()) { 
			 f.open();
		 }
	}
}
//Open Close?
//Which two modifications enable the code to print



//A. Replace class Folder implements AutoCloseable { line n1 with:
//	E. At line n2, insert: public void close () throws IOException { System.out.print("Close");



//https://www.briefmenow.org/oracle/which-two-modifications-enable-the-code-to-print-open-close/