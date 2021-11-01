package Question1_120;

import java.io.Console;

public class FExamp107 {

	public static void main(String[] args) {
		Console console = System.console();
		char[] pass = console.readPassword("Enter password:"); //line n1
		String password = new String(pass); //line n2
		
		
//		답 : C. The code reads the password without echoing characters on the console.
//		코드는 콘솔에서 문자를 에코하지 않고 암호를 읽습니다.
	}

}
