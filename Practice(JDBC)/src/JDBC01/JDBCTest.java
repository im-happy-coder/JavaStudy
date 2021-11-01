package JDBC01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCTest {
	public static void main(String[] args){
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			System.out.println("데이터베이스에 접속했습니다.");
			con.close();
		} catch (ClassNotFoundException cnfe) {
			System.out.println("해당 클래스를 찾을 수 없습니다"+cnfe.getMessage());
			// TODO: handle exception
		}catch(SQLException se) {
			System.out.println(se.getMessage());
		}
	}
}
//"jdbc:mysql://localhost:3306/?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234"
//                            이 사이에 데이타베이스 이름
//"jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234"