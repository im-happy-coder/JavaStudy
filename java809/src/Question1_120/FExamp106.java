package Question1_120;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FExamp106 {

	public static void main(String[] args) throws SQLException {
		try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		String query = "SELECT * FROM Employee where eid=111";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(query);
//		while(rs.next()) {  // 이 문장으로 해야 출력이 된다. 일때의 답 : C. The code prints the employee ID.ㄴ
//		System.out.println("Employee ID:"+ rs.getInt("eid"));
//		}
		System.out.println("Employee ID:"+ rs.getInt("eid"));  
		} catch (Exception e) {
			System.out.println ("Error");
		}    
	}       //답 : D. The code prints Error.

}






/* 올바른 출력문
try {
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
String query = "SELECT * FROM Employee where eid=111";
Statement stmt = conn.createStatement();
ResultSet rs = stmt.executeQuery(query);
while(rs.next()) {
System.out.println("Employee ID:"+ rs.getInt("eid"));
}
} catch (Exception e) {
	System.out.println ("Error");
}
*/