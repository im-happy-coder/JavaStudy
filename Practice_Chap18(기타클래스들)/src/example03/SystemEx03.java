package example03;

import java.util.Properties;
import java.util.Set;

public class SystemEx03 {

	public static void main(String[] args) {

		String osName = System.getProperty("os.name");
		System.out.println("현재 운영체제 : " + osName);
		
		String userName = System.getProperty("user.name");
		System.out.println("사용자 계정 : " + userName);
		
		//Properties클래스는 Map계열의 컬렉션이다. 그런데 String, String갖는다
		//Key(키)도 String, 값(value)도 String이다.  //getProperties()는 속성들의 값을 다 가져온다
		Properties properties = System.getProperties(); //getProperties 리턴 값이 getProperties이므로 getProperties로 받는다.
		
		
		//Map컬렉션에서 Key값만 Set계열로 가져오는 메서드가 KeySet()이다
		Set set = properties.keySet();
		System.out.println(" KEY        VALUE");
		for(Object objkey : set) {
			String key = (String)objkey;
			String value = System.getProperty(key);
			System.out.println(key + "               "  + value);
		}
		
		
		
	
	}

}
