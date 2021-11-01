package Question1_120;

import java.io.FileInputStream;
import java.util.Properties;

public class Examp18 {

	public static void main(String[] args) throws Exception {
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream ("D:\\courses.txt"); //이파일 내용이 welcome1="Good day!"가 들어있다.
		prop.load(fis);
		System.out.println(prop.getProperty("welcome1")); //welcome1의 값인 Good day!를 리턴한다.
		System.out.println(prop.getProperty("welcome2", "Test"));//line n1  welcome2내용은 없기때문에 Test를 리턴한다.
		System.out.println(prop.getProperty("welcome3"));  //이 내용도 없기때문에 null은 리턴한다.

//public String getProperty(String key)는
//첫번째 메소드는 key를 키값으로 갖는 프로퍼티가 있을 경우 그 값을 리턴하고,없다면 null을 리턴한다. 
		
//public String getProperty(String key, String defaultValue)는
//두번째 메소드는 key를 키값으로 갖는 프로퍼티가 있을 경우 그 값을 리턴하고, 없다면 두번째 파리미터로 넘겨준 defaultValue를 리턴한다
		
	}

}
