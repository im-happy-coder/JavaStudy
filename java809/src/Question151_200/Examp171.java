package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp171 {

	public static void main(String[] args) {
//		player table
//		pid  pname
//		1	 Dave
//		2	 Jack
//		3	 Sam
		
		try {
		Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");
		Statement st= conn.createStatement(
		ResultSet.TYPE_SCROLL_SENSITIVE,//커서이동방법
		ResultSet.CONCUR_UPDATABLE);//수정가능한 모드
		st.execute ("SELECT * FROM Player");
		st.setMaxRows(2);  //최대 행수,, 아무런 영향 없음,, while문안에 있어도 효과없음
		ResultSet rs = st.getResultSet();
//		rs.absolute(3); // 이동할 행수  ,, while문 안에 있어야 효과있음.
		while (rs.next ()) {
		rs.absolute(3); // 유효함,,, 3행으로 이동하여 3 Sam를 출력하게 된다.
		System.out.println(rs.getInt(1) + " " + rs.getString(2));//숫자가 열번호를 가리킨다 //1열이 int형이기 때문에 getInt(1)로 받아야한다.
//		getString("pname")); // 이렇게 열이름을 주어도 값이 나옴
		} 
		}catch (SQLException ex) {
		System.out.print("SQLException is thrown.");
		
		//답 : D. SQLException is thrown.  
		//rs.absolute(3);가 while문 밖에 있어서 답은  D. SQLException is thrown.  
		// while문안에 존재한다면 답은 C. 3 Sam
		}
	}
}


/*
 CONCUR_UPDATABLE: 커서의 위치에서 정보 업데이트 가능.ResultSet이 저장하고 있는 레코드들을 직접 수정해야 할 경우.)Resultset Object의 변경이 가능)

CONCUR_READ_ONLY: 커서의 위치에서 정보 업데이트 불가.ResultSet이 저장하고 있는 레코드들을 읽기 전용으로 설정.(Resultset Object의 변경이 불가능)

TYPE_FORWARD_ONLY: SCROLL이 불가능한 forward only값을 지님 

TYPE_SCROLL_INSENSITIVES은 SCROLL가능하나 변경된 상항은 적용되지 않음(양방향, 스크롤 시 업데이트 반영안함)

TYPE_SCROLL_SENSITIVE도  SCROLL가능하면서 변경된 사항도 적용됨 (양방향 스크롤시 업데이트 반영)

setMaxRows()최대 행 수를 나타내는 int이며, 제한이 없는 경우에는 0입니다.이 setMaxRows 메서드는 동적 스크롤 가능 커서에는 아무런 영향을 주지 않습니다.

absolute(int i):이동할 행 번호를 나타내는 int입니다. 양수, 음수 또는 0일 수 있습니다.

getInt(int)	이 SQLServerResultSet 개체의 현재 행에서 지정된 열 인덱스의 값을 Java 프로그래밍 언어의 int로 검색합니다.

getString(int)	매개 변수 인덱스가 지정된 경우 지정된 매개 변수의 값을 Java 프로그래밍 언어의 문자열로 검색합니다
*/





/*
previous():Cursor를 이전 Row로 이동 

first():Cursor를 ResultSet의 처음으로 이동 

last():Cursor를 ResultSet의 마지막으로 이동 

isFirst():현재 Cursor가 첫 Row인지를 확인 

isLast():현재 Cursor가 마지막 Row인지를 확인 

getType():ResultSet의 Type을 Return 

getCucurrency():Concurrency의 Type을 Return 

getRow():현재 Cursor가 가리키고 있는 Row Number 

beforeFirst():Before the first row로 이동 

afterLast():After the last row로 이동 

relative(int i):현재 위치에서 i만큼 이동 i값이 음수이면 위로 이동하고 양수이면 아래로 이동 

197번 과 비교
*/