package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


//Given the structure of the STUDENT table:
//Student (id INTEGER, name VARCHAR)
//Given:


public class Examp29 {
	static Connection newConnection =null;
	public static Connection getDBConnection() throws SQLException {
		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");) { 
			//Connection con = DriveManager.getConnection(URL, username, password)  Connection 객체를 생성
			newConnection = con;
		}
		return newConnection;
		
	}
	public static void main(String[] args)  throws SQLException { 
		getDBConnection();
		Statement st = newConnection.createStatement();
		st.executeUpdate("INSERT INTO student VALUES (102, 'Kelvin')");  
		}
}


//답 : C. A SQLException is thrown as runtime.
// try{}블록 후에 connection이  close 된다
