package Question201_248;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Examp217 {

	public static void main(String[] args) throws IOException {
//		/resourses/Message.properties: 
//		Given the content of -
//		welcome1="Good day!"
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream ("/resources/Message.properties"); prop.load(fis);
		System.out.println(prop.getProperty("welcome1"));
		System.out.println(prop.getProperty("welcome2", "Test"));//line n1
		System.out.println(prop.getProperty("welcome3"));
		
//		"Good day!"
//		Test
//		null

	}

}
