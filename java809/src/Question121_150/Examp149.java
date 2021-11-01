package Question121_150;

public class Examp149 {
//사진참고

//java.sql.SQLException : 유효하지 않은 커서 상태 – 현재 행 없음
//커서가 MoveToInsertRow ()에있을 때 rs.updateRow ()를 호출 할 수 없습니다.
	
	
	
//	D. A SQLException is thrown at run time.
	
//	 absolute(int row)	 지정한 위치로 커서를 이동한다.
/*	현재 커서 위치는 커서가 삽입 행에 있는 동안 저장됩니다. 삽입 행은 업데이트할 수 있는 결과 집합과 연결된 특수한 행으로, 
 * 기본적으로는 결과 집합에 행을 추가하기 전에 updater 메서드를 호출하여 새 행을 생성할 수 있는 버퍼입니다.
	커서가 삽입 행에 있을 때는 updater, getter 및 insertRow 메서드만 호출할 수 있습니다. 이 메서드를 호출할 때마다, 
	또한 insertRow를 호출하기 전에 결과 집합의 모든 열에 값을 지정해야 합니다. 또한 열 값에 대해 getter 메서드를 호출하려면 먼저 updater 메서드를 호출해야 합니다.
	
	updateInt(java.lang.String, int)	열 이름이 지정된 경우 지정된 열을 int 값으로 업데이트합니다.
	updateString(java.lang.String, java.lang.String)	열 이름이 지정된 경우 지정된 열을 문자열 값으로 업데이트합니다.
	
	
이 updateRow 메서드는 java.sql.ResultSet 인터페이스의 updateRow 메서드에 의해 지정됩니다.
커서가 삽입 행에 있는 경우에는 이 메서드를 호출할 수 없습니다.
열 값이 변경되지 않은 경우에 이 메서드를 호출하면 예외가 발생합니다.


이 refreshRow 메서드는 java.sql.ResultSet 인터페이스의 refreshRow 메서드에 의해 지정됩니다.
커서가 삽입 행에 있는 경우에는 이 메서드를 호출할 수 없습니다.

getInt(int)	이 SQLServerResultSet 개체의 현재 행에서 지정된 열 인덱스의 값을 Java 프로그래밍 언어의 int로 검색합니다.
*/
}
