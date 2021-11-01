package Question151_200;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Examp197 {

	public static void main(String[] args)   {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234");){
			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);//커서이동방법//수정가능한 모드
			ResultSet rs = stmt.executeQuery("SELECT emp_id, emp_name FROM employee1");
				rs.absolute(-2);//line n1    이동할 행수
				rs.moveToInsertRow(); //moveToInsertRow() : Cursor 위치에 행을 삽입
				rs.updateInt(1, 104); // 열 이름이 지정된 경우 지정된 열을 int 값으로 업데이트합니다. ---1열을 104로 바꿈
				rs.updateString(2, "Michael"); // 열 이름이 지정된 경우 지정된 열을 String 값으로 업데이트합니다. --2열을 문자열로 바꿈
				rs.insertRow();  //insertRow() : Cursor 위치의 행을 삽입하는 메소드
				rs.moveToCurrentRow(); //moveToCurrentRow(): 커서를 이전에 기억된 위치로 이동. moveToInsertRow() 메서드를 사용해서 삽입 열로 이동한 후 에 복귀할 때 사용할 수 있다.
				System.out.println("Employee Id:" + rs.getInt(1) + ", Employee Name: " + rs.getString(2));
			} catch (SQLException e) {
				System.out.println("error");
			}
		
		}
	}

			//답 : D. A new record is inserted and Employee Id: 104, Employee Name: Michael is displayed.





//데이타 추가 ------------------------------------------------------
//rs.moveToInsertRow();
//rs.updateInt (1, 1001);
//rs.updateString (2, "JUNG");
//rs.insertRow();
//
//rs.moveToInsertRow();
//rs.updateInt (1, 1002);
//rs.updateString (2, "PARK");
//rs.insertRow();
// 
//rs.close ();
////------------------------------------------------------------------



//moveToInsertRow 메소드를 호출하여 삽입할 행을 작성하십시오. ResultSet 외부의 버퍼에 행이 작성됩니다.
//ResultSet 인터페이스의 moveToInsertRow () 메소드는 다음 레코드를 삽입해야하는 위치로 커서를 탐색합니다. 따라서이 방법을 사용하여 행을 삽입하려면 커서를 적절한 위치로 이동하십시오.
//삽입 버퍼가 이미 있으면 이전의 모든 값이 버퍼에서 제거됩니다.
//

//absolute(int i)  boolean  양수일 경우에는 Before the first row를 기준으로, 
//음수일 경우에는 After the first row를 기준으로 하여 지정된 행으로 이동. 각 행은 1 혹은 -1 부터 시작한다. 
//양수(+) = Before the first row =첫 번째 행 앞
//음수(-) = After the first row = 첫 번재 행 이후
//행 값이 음수이면 커서가 ResultSet의 마지막 행부터 이 수만큼 이동하여 위치합니다. 
//마지막 행은 -1, 마지막에서 두 번째 행은 -2 등으로 번호가 지정됩니다. 행 값이 지정한 수보다 ResultSet의 행 수가 적은 경우 이 메소드는 beforeFirst와 같은 방식으로 작동합니다.


//rs.moveToInsertRow();
//rs.updateInt("ID", id);
//rs.updateString("First_Name", "Ishant");
//rs.updateString("Last_Name", "Sharma");
//rs.updateDate("Date_Of_Birth", new Date(904694400000L));
//rs.updateString("Place_Of_Birth", "Delhi");
//rs.updateString("Country", "India");
//rs.insertRow();

// 171번 문제와 비교