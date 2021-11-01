package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.function.IntFunction;

public class Examp154 {

	public static void main(String[] args) throws SQLException {
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		Statement st = conn.createStatement();
		String query = "DELETE FROM Student WHERE id = 103";
		System.out.println("Status :" + st.execute(query));
	}

}


// fasle를 출력하고 2개의 레이블은 삭제가 됨.
//B. The program prints Status: false and two records are deleted from the Student table.
