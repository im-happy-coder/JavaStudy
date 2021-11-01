package examp01;

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Properties;

import javax.print.DocFlavor.URL;

public class PropertyfilesEx1 {

	public static void main(String[] args) {
//		Propertyfiles = 속성 파일
//		속성 파일은 행으로 구분 된 키 / 값 쌍의 문자열을 정의합니다.
//		다음과 같은 몇 가지 규칙이 있습니다.
//		줄 시작 부분의 공백 (있는 경우)은 무시됩니다.
//		#또는 !로 시작하는 모든 줄은 주석으로 처리됩니다.
//		가독성을 위해 백 슬래시로 줄을 나눌 수 있습니다.
		
//		Messages.properties를 읽을려면  java.util.Propertiesa, java.io.Reader, java.io.InputStream을 사용한다.
		Properties prop = new Properties();
		try (InputStream is = getClassLoader().getResourceAsStream("Messages.properties"))
		            {
		    prop.load(is); // Load properties
		    // Prints The video has been adde
		    System.out.println(prop.getProperty("video.added"));
		    // 키를 찾을 수없는 경우 기본값을 인쇄합니다.
		    System.out.println(prop.getProperty("video.add", "default"));
		    // 모든 속성 키 가져 오기
		    Enumeration<?> e = prop.propertyNames();
		} catch (IOException e) {
		    e.printStackTrace();
		}
	}

}
