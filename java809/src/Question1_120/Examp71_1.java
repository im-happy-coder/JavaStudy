package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp71_1 {

	public static void main(String[] args) {
		try{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
			st.execute("SELECT*FROM Employee1");
			ResultSet rs = st.getResultSet();
			while (rs.next()) { //커서는 하나씩 이동.
			if (rs.getInt(1) == 100) {
			rs.updateString(2, "Jack"); 
//			rs.updateRow(); //변경한 행을 저장
			}
			}
			rs.absolute(2);   //Cursor를 원하는 행으로 이동하는 메소
			System.out.println(rs.getInt(1) + " " + rs.getString(2));
			}catch (SQLException ex) {
					System.out.println("Exception is raised");
			 } 
			
	}

}
//=> ResultSet.TYPE_FORWARD_ONLY : Cursor를 아래로만 이동(기본)
		// => ResultSet.TYPE_SCROLL_INSENSITIVE : Cursor를 원하는 행으로 이동 - 행 조작 미반영
		// => ResultSet.TYPE_SCROLL_SENSITIVE : Cursor를 원하는 행으로 이동 - 행 조작 반영
		//resultSetConcurrency : Cursor 위치의 행 조작 유무를 설정하는 파라미터
		// => ResultSet.CONCUR_READ_ONLY : 행 조작 불가능(기본)
		// => ResultSet.CONCUR_UPDATABLE : 행 조작 가능