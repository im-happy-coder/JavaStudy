package Question1_120;

import java.io.IOException;

// AutoCloseable 인터페이스는 
//try-with-resources 문으로 관리되는 객체일 때 close() 메서드가 자동으로 호출된다.
final class Folder implements AutoCloseable{ //line n1
	public void close () throws IOException { System.out.print("Close"); }//line n2
	
	public void open () {
	System.out.print("Open");
	}
	}
public class Examp51 {

	public static void main(String[] args) throws Exception {
		try (Folder f = new Folder()) { 
			f.open();
		}
	}
}

//      A. Replace line n1 with: class Folder implements AutoCloseable {
// 정답 : E. At line n2, insert: public void close () throws IOException { System.out.print("Close"); }