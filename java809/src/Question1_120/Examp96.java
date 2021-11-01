package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Examp96 {

	public static void main(String[] args) {
		try {
			Properties prop = new Properties();
			prop.put("user", "userName");
			prop.put("password", "passWord");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			if(conn != null) {
				System.out.println("Connection Established");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
//	C. The program prints Connection Established.

}
/*Properties 클래스는 Hashtables의 하위 클래스이다.
Hashtables를 상속 받았기 때문에 Map의 속성 즉, Key와 Value를 갖는다.
HashMap과 큰 차이가 없지만, Properties 클래스는 파일 입출력을 지원한다.
key=value 형식으로 작성 된 파일을 key와 value 로 나누어 저장할 때 유용하다.


*/
