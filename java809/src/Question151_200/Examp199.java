package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp199 {

	public static void main(String[] args)  {
		try{
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
			Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = stmt.executeQuery("SELECT * FROM EMP");
				//line n1
//			ResultSetMetaData rsmd = rs.getMetaData(); int totRows = rsmd.getColumnCount(); //열의 갯수알려줌
//			A. ResultSetMetaData rsmd = rs.getMetaData(); int totRows = rsmd.getRowCount();getRowCount() 메소드는 없음
			int totRows=0; while(rs.next()){ totRows++; } // 3행 출력
			System.out.println(totRows);
		} catch (SQLException e) {
			// TODO: handle exception
		}
	}

}
//Which code fragment, inserted at Line n1, helps you determine the number of records in ResultSet?
//n1 행에 삽입 된 코드 조각은 ResultSet의 레코드 수를 결정하는 데 도움이됩니까? 
//레코드=행


//		답 : B. int totRows=0; while(rs.next()){ totRows++; }


/*
CONCUR_UPDATABLE: 커서의 위치에서 정보 업데이트 가능.ResultSet이 저장하고 있는 레코드들을 직접 수정해야 할 경우.)Resultset Object의 변경이 가능)

CONCUR_READ_ONLY: 커서의 위치에서 정보 업데이트 불가.ResultSet이 저장하고 있는 레코드들을 읽기 전용으로 설정.(Resultset Object의 변경이 불가능)

TYPE_FORWARD_ONLY: SCROLL이 불가능한 forward only값을 지님 

TYPE_SCROLL_INSENSITIVES은 SCROLL가능하나 변경된 상항은 적용되지 않음(양방향, 스크롤 시 업데이트 반영안함)

TYPE_SCROLL_SENSITIVE도  SCROLL가능하면서 변경된 사항도 적용됨 (양방향 스크롤시 업데이트 반영)
*/