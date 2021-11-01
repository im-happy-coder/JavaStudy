package Question1_120;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp71 {

	public static void main(String[] args) {
		try{
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		st.execute("SELECT * FROM Employee");
		ResultSet rs = st.getResultSet();
		while (rs.next()) {
		if (rs.getInt(1) == 112) {
		rs.updateString(2, "Jack"); //이 작업이 무시된다.
		}
		}
		rs.absolute(2);   //absolute(int row)	 지정한 위치로 커서를 이동한다. --여기서 112,Jerry 행으로 이동함	
		System.out.println(rs.getInt(1) + " " + rs.getString(2));
		}catch (SQLException ex) {
				System.out.println("Exception is raised");
		 } //답 : C. The Employee table is not updated and the program prints: 112 Jerry
		//	Employee 테이블이 업데이트되지 않고 프로그램이 다음을 인쇄합니다. 112 Jerry
		//이유 : rs.updateRow()가 없으므로 데이터베이스가 업데이트되지 않으므로이 질문은 C 여야합니다.
		// updateRow는 현재 커서의 위치의 행을 바꿈
		//  insertRow는 현재 커서의 위치에 새로운 행을 추가함
		
	}
}












/*
ResultSet.TYPE_FORWARD_ONLY
이것이 기본 유형입니다. 지정된 경우 검색된 순서대로 결과를 한 번만 검색 할 수 있습니다.
ResultSet.TYPE_SCROLL_INSENSITIVE
지정된 경우 결과를 통해 앞뒤로 이동할 수 있으며 결과 집합의 특정 위치로 이동할 수 있습니다.
ResultSet.TYPE_SCROLL_SENSITIVE
지정된 경우 결과 집합의 특정 위치로 앞뒤로 이동할 수도 있지만 데이터를 사용하는 동안 항상 데이터의 최신 변경 사항을 볼 수 있습니다. 
TYPE_SCROLL_INSENSITIVE는 변경 사항에 "sensitive"하지 않습니다. 데이터.

두 가지 동시성 모드가 있습니다.
ResultSet.CONCUR_READ_ONLY
이것이 기본 모드입니다. 지정된 경우 결과 집합을 업데이트 할 수 없습니다 (INSERT, UPDATE 또는 DELETE 문 사용).
ResultSet.CONCUR_UPDATABLE
결과 집합을 업데이트 할 수 있음을 나타냅니다.
*/
//
//업데이터 메서드는 두 가지 방법으로 사용할 수 있습니다.
//
//현재 행의 열 값을 업데이트합니다. 스크롤 가능한 ResultSet개체에서 커서는 앞뒤로, 절대 위치 또는 현재 행에 상대적인 위치로 이동할 수 있습니다. 다음 코드 조각 NAME은 ResultSet개체 의 다섯 번째 행에있는 열 을 업데이트 rs한 다음 메서드 updateRow를 사용하여 rs파생 된 데이터 원본 테이블을 업데이트합니다 .
//
//       rs.absolute (5); // 커서를 rs의 다섯 번째 행으로 이동
//       rs.updateString ( "이름", "AINSWORTH"); // 업데이트
//          // NAME5 행의 열이 될AINSWORTH
//       rs.updateRow (); // 데이터 소스의 행을 업데이트합니다.
//
// 
//열 값을 삽입 행에 삽입합니다. 업데이트 할 수있는 ResultSet개체에는 삽입 할 행을 빌드하기위한 준비 영역 역할을하는 특수 행이 연결되어 있습니다. 다음 코드 조각은 커서를 삽입 행으로 이동하고 3 열 행을 빌드 한 rs다음 메서드를 사용하여 데이터 소스 테이블에 삽입합니다 insertRow.
//
//       rs.moveToInsertRow (); // 커서를 삽입 행으로 이동
//       rs.updateString (1, "AINSWORTH"); // 업데이트
//          // 삽입 행의 첫 번째 열은 AINSWORTH
//       rs.updateInt (2,35); // 두 번째 열을 35
//       rs.updateBoolean (3, true); // 세 번째 열을true
//       rs.insertRow ();
//       rs.moveToCurrentRow ();

