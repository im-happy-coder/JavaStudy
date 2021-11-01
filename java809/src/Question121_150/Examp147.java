package Question121_150;

import java.util.Locale;
import java.util.ResourceBundle;

public class Examp147 {
	public void loadResourceBundle() {
	ResourceBundle resource = ResourceBundle.getBundle("Greetings", Locale.US);;
	System.out.println(resource.getObject(1));  //error 
//	System.out.println(resource.getObject("HELLO_MSG"));  //이렇게 문자열로 키값을 줘야 밸류값이 출력된다, 일때의 답:Hello, everyone!
	}
	public static void main(String[] args) {
		new Examp147().loadResourceBundle();
	}
}


//답 :A. Compilation fails.
