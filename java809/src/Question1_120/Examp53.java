package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp53 {

	public static void main(String[] args) throws SQLException {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		String query = "SELECT eid FROM employee";
		try(Statement stmt = conn.createStatement()) {
		ResultSet rs = stmt.executeQuery(query);    
		stmt.executeQuery("SELECT id FROM Customer");  //ResultSet이 열리지 않아 예외가 발생합니다. stmt.executeQuery가 13 행에서 호출되면 자동으로 닫힙니다.
		//위 문장을 주석처리하면 employee 정보가 나옴
		while (rs.next()) {
		 //process the results
		System.out.println("Employee ID: "+ rs.getInt("eid"));
		}
		
		} catch (Exception e) {
		System.out.println ("Error");
		}
		
	}

}                   
//                  정답 : The program prints Error.    --------stmt.executeQuery("SELECT id FROM Customer"); 일때 에러
//			rs = stmt.executeQuery("SELECT id FROM Customer"); -----------일때는 정상적으로 출력되고 답은 B. The program prints customer IDs.
//                       ResultSet not open                 