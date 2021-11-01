package Question201_248;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp202 {

	public static void main(String[] args) throws SQLException {
		
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			String query = "select id from emp";
			try (Statement stmt = conn.createStatement()){
			ResultSet rs = stmt.executeQuery(query);
//			stmt.executeQuery("select id from customer"); //이건 답이 : C. The program prints Exception.
			rs = stmt.executeQuery("select id from customer"); // 이렇게 rs= 하고 열어줘야한다.
			 while(rs.next()) {
				 System.out.println("Employee Id:" + rs.getInt(1));
			 }
		} catch (SQLException e) {
			System.out.println("error");
		}
	
	}
}


//답 : B. The program prints customer IDs.