package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp172 {

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
			System.out.println("ID: " + rs.getInt(1)); // 이렇게 열이름을 주어도 값이 나옴
			System.out.println("Description: " + rs.getString(2)); //숫자가 열번호를 가리킨다
			System.out.println("Price: " + rs.getDouble(3));
			System.out.println("Quantity: " + rs.getInt(4));
			}
			} catch (SQLException se) {
			System.out.println("Error");
			}
	}

}


//답 : D. The code prints information about Item 110.