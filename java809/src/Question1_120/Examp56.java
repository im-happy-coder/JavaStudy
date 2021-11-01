package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp56 {
	public static void main(String[] args) {
//		Item table -
//		"¢ ID, INTEGER: PK
//		"¢ DESCRIP, VARCHAR(100)
//		"¢ PRICE, REAL
//		"¢ QUANTITY< INTEGER
	 try {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		String query = "Select * FROM Item WHERE ID = 110";
		Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while(rs.next()) {
			System.out.println("ID: " + rs.getInt("Id"));
			System.out.println("Description: " + rs.getString("Descrip"));
			System.out.println("Price: " + rs.getDouble("Price"));
			System.out.println("Quantity:" + rs.getInt("Quantity"));
		}
		} catch (SQLException se) {
		System.out.println("Error");
		}
	}
}
//D. The code prints information about Item 110.             110에 해당하는 item목록이 나온다
//https://vceguide.com/what-is-the-result-510/