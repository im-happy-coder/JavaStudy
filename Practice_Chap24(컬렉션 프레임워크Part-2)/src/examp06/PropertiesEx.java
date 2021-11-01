package examp06;

import java.io.FileReader;
import java.net.URLDecoder;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws Exception{
		//Properties 객체는 키와 값을 String으로 제한 한 Map컬렉션이다.
		Properties properties = new Properties();
		
		//PropertiesEx클래스와 동일한 곳에 지금 properties파일이 존재하므로 아래와 같이 패스를 알아오는곳
		//database파일의 위치(path)를 알아보자
		String path = PropertiesEx.class.getResource("database.properties").getPath();
		//파일 경로 출력
		System.out.println(path); //유니코드로 출력됨
		//한글로 파일 경로가 출력되도록 디코딩한다.
		path = URLDecoder.decode(path,"UTF-8"); //한글이 3바이트
//		path = URLDecoder.decode(path,"EUC-KR"); //EUC-KR은 한글이 2바이트 -- 한글이 깨짐
		System.out.println(path);
		//database.properties파일을 읽어들인다.
		properties.load(new FileReader(path));
		
		System.out.println("---------------------------------");
		
		//키를 주고 값을 읽어옴
		String driver =properties.getProperty("driver");
		System.out.println("driver : " + driver);
		
		String url =properties.getProperty("url");
		System.out.println("url : " + url);
		
		String username =properties.getProperty("username");
		System.out.println("username : " + username);
		
		String password =properties.getProperty("password");
		System.out.println("driver : " + password);
	}

}
