package examp01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCInterface {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		JDBC를 사용할 때 구현이 아닌 인터페이스로 작업합니다. 이러한 구현은 JDBC 드라이버에서 제공됩니다.
//드라이버는 특정 데이터베이스와 통신하는 방법을 알고있는 클래스가있는 JAR 파일입니다. 예를 들어 MySQL의 경우 mysql-connector-java-XXX.jar, 여기서 XXX는 데이터베이스 버전입니다.
//		4가지 주요 인터페이스
//		java.sql.Driver
//		모든 JDBC 드라이버는 데이터베이스에 연결하는 방법을 알기 위해이 인터페이스를 구현해야합니다.
//		java.sql.Connection
//		구현은 데이터베이스에 대한 정보를 얻고, 문을 만들고, 연결을 관리하는 방법을 제공합니다.
//		java.sql.Statement
//		구현은 SQL 문을 실행하고 결과를 반환하는 데 사용됩니다.
//		java.sql.ResultSet
//		구현은 쿼리 결과를 검색하고 업데이트하는 데 사용됩니다.
		
//		데이터베이스에 연결
//	 	드라이버가 로드되면 static방법으로 데이터베이스에 연결 할 수 있다. DriverManager.getConnection()
//		Connection getConnection(String url)
//		Connection getConnection(String url,
//		                         Properties info)
//		Connection getConnection(String url,
//		                         String user,
//		                         String passw)
//		JDBC URL 형식
//		1. 프로토콜 (항상 동일)
//		2. 서브 프로토콜 (대부분의 경우 데이터베이스 이름 / 드라이버 유형)
//		jdbc:mysql://host:3306/db
//		3. 데이터베이스 특정 연결 속성 (대부분의 경우 // SERVER : HOST / DATABASE_NAME 형식의 데이터베이스 위치)	
		
//		다음은 몇 가지 URL 예입니다.
//		jdbc:postgresql://localhost/test
//		jdbc:sqlserver://localhost\SQLEXPRESS;databasename=db
//		jdbc:derby:db;create=true
		
//		내 주소 
//		"jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC", "root", "a1234"
		
//		Connection객체 를 얻기 위해이 메소드를 호출하여 데이터베이스에 연결할 수 있습니다 .
//		Properties props = new Properties();
//		props.put("user", "db_user");
//		props.put("password", "db_p4assw0rd");
//		Connection con =
//		    DriverManager.getConnection("jdbc:mysql://localhost/db",
//		                                props);
//		또는:
//
//			Connection con =
//			    DriverManager.getConnection("jdbc:mysql://localhost/db",
//			                                "db_user",
//			                                "db_p4assw0rd");
//		Connection con =
//		    DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC\", \"root\", \"a1234\"");
//		Connection은 AutoCloseable를 구현 하기 때문에 try-with-resources 문으로 자동으로 close()시켜준다.
//		String url = "jdbc:mysql://localhost/db";
//		String user = "db_user";
//		String passw = " db_p4assw0rd";
//
//		try(Connection con =
//		        DriverManager.getConnection(url, user, passw)) {
//		    // Database operations
//		} catch(SQLException e) {
//		    System.out.format("%d-%s-%s",
//		                      e.getErrorCode(),
//		                      e.getSQLState(),
//		                      e.getMessage());
//		}
		
		
		
//		쿼리 실행
//		세 가지 Statement인터페이스가 있습니다.
//
//		java.sql.Statement
//		매개 변수없이 데이터베이스에 대한 간단한 SQL 문을 나타냅니다.
//		java.sql.PreparedStatement
//		명령문을 여러 번 효율적으로 실행하기 위해 사전 컴파일 된 SQL 문을 나타냅니다. 입력 매개 변수를 받아 들일 수 있습니다.
//		java.sql.CallableStatement
//		저장 프로 시저를 실행하는 데 사용됩니다. 입력 및 출력 매개 변수를받을 수 있습니다.
		

//createStatement () 메서드를 사용하여 Connection 객체에서 Statement를 가져올 수 있습니다.
//		Statement createStatement()
//		Statement createStatement(int resultSetType,
//		                          int resultSetConcurrency)
//		resultSetType  modes :
//		ResultSet.TYPE_FORWARD_ONLY
//		이것이 기본 유형입니다. 지정된 경우 검색된 순서대로 결과를 한 번만 검색 할 수 있습니다.
//		ResultSet.TYPE_SCROLL_INSENSITIVE
//		지정된 경우 결과를 통해 앞뒤로 이동할 수 있으며 결과 집합의 특정 위치로 이동할 수 있습니다.
//		ResultSet.TYPE_SCROLL_SENSITIVE
//		지정되면 결과 집합의 특정 위치로 앞뒤로 이동할 수도 있지만 데이터를 사용하는 동안 항상 최신 변경 사항을 볼 수 있습니다. 
//		TYPE_SCROLL_INSENSITIVE는 변경 사항에 "민감"하지 않습니다. 데이터.
		
		
//		resultSetConcurrency modes :
//		ResultSet.CONCUR_READ_ONLY
//		이것이 기본 모드입니다. 지정된 경우 결과 집합을 업데이트 할 수 없습니다 (INSERT, UPDATE 또는 DELETE 문 사용)..
//		ResultSet.CONCUR_UPDATABLE
//		결과 집합을 업데이트 할 수 있음을 나타냅니다.
		
//		Statement stmt = con.createStatement();
//		 Statement객체 가 있으므로 SQL 명령을 실행할 수있는 세 가지 방법이 있습니다.
//
//		방법					지원되는 SQL 문				반환 유형
//		execute() :	SELECT INSERT UPDATE DELETE     CREATE	boolean( true에 SELECT, false나머지)
//		executeQuery() :		SELECT				ResultSet
//		executeUpdate()	:	INSERT UPDATEDELETE	    CREATE	영향을받는 행 수 (0은 CREATE)
//		
	try(Connection con =
	      DriverManager.getConnection("jdbc:mysql://localhost:3306/study_java_db?characterEncoding=UTF-8&serverTimezone=UTC\", \"root\", \"a1234\"");
	      Statement stmt = con.createStatement()) {
	   boolean hasResults = stmt.execute("SELECT * FROM user");
	   if(hasResults) {
	      // To retrieve the object with the results
	      ResultSet rs = stmt.getResultSet();
	   } else {
	      // To get the number of affected rows
	      int affectedRows = stmt.getUpdateCount();
	   }
	   ResultSet rs = stmt.executeQuery("SELECT * FROM user");
	   stmt.executeUpdate("INSERT INTO user(id, name) "
	        + "VALUES(1, 'George')"); // Returns 1
	   stmt.executeUpdate("UPDATE user SET name='Joe' "
	        + "WHERE id = 1"); // Returns 1
	   stmt.executeUpdate("DELETE FROM user "
	        + "WHERE id = 1"); // Returns 1
	} catch(SQLException e) {
	   e.printStackTrace();
	}
	
	
//	결과 읽기
//	개체는 현재 행을 가리키는 커서를 유지하며 한 번에 한 행만 읽을 수 있습니다.
//
//	처음에는 커서가 첫 번째 행 바로 앞에 있습니다. next()메서드를 호출하면 커서가 한 위치 앞으로 이동하고 true데이터가 있거나 데이터 false가없는 경우 반환 됩니다 . 
//	이런 식으로 전체 결과 집합에 대해 루프를 반복 할 수 있습니다.
	
	try(Connection con =
		      DriverManager.getConnection(url, user, passw);
		      Statement stmt = con.createStatement();
		      ResultSet rs =
		         stmt.executeQuery("SELECT * FROM user")) {
		   while(rs.next()) {
		      // Read row
		   }
		} catch(SQLException e) {
		   e.printStackTrace();
		}
	
//	ResultSet 오브젝트가 먼저 닫힌 다음 Statement 오브젝트, Connection 오브젝트가 차례로 닫힙니다.
//	ResultSet -> Statement -> Connection 닫히는 순서
//	ResultSet은 동일한 Statement 오브젝트에서 다른 ResultSet이 실행될 때 자동으로 닫힙니다.
//	 Statement 닫으면 ResultSet 오브젝트도 닫힙니다.
//	Connection 닫으면 Statement 그리고 ResultSet 닫힌다.
	
	
//	아래 요소가 없으면 SqlException이 발생한다.
//	if(rs.next) {
//		   // Access the first element if there's any
//		}
//	 데이터를 얻으려면 ResultSet많은 데이터 유형에 대한 getter 메서드가 있습니다. 예를 들면 다음과 같습니다.
//
//	getInt() returns an int
//	getLong() returns a Long
//	getString() returns a String
//	getObject() returns an Object
//	getDate() returns a java.sql.Date
//	getTime() returns a java.sql.Time
//	getTimeStamp() returns java.sql.Timestamp
	
//	각 방법에는 두 가지 버전이 있습니다.
	
	Result rs = stmt.executeQuery(
		      "SELECT id, name FROM user"
		);
		while(rs.next()) {
		   int id = rs.getInt("id"); //( 대소 문자를 구분 하지 않음 ).
		   String name = rs.getString("name");
		   // Do something
		}
//	아래와 동일함.
	
		Result rs = stmt.executeQuery(
			      "SELECT id, name FROM user"
			);
			while(rs.next()) {
			   int id = rs.getInt(1);
			   String name = rs.getString(2);
			   // Do something
			}
//			존재하지 않는 열 (인덱스 또는 이름으로)을 참조하면  SQLException이 발생합니다.
			
			Result rs = stmt.executeQuery(
				      "SELECT insertion_date FROM user"
				);
				while(rs.next()) {
				   // Getting the date part
				   java.sql.Date sqlDate = rs.getDate(1);
				   // Getting the time part
				   java.sql.Time sqlTime = rs.getTime(1);
				   // Getting both, the date and time part
				   java.sql.Timestamp sqlTimestamp =
				                        rs.getTimestamp(1);
				   // Converting date
				   LocalDate localDate = sqlDate.toLocalDate();
				   // Converting time
				   LocalTime localTime = sqlTime.toLocalTime();
				   // Converting timestamp
				   Instant instant = sqlTimestamp.toInstant();
				   LocalDateTime localDateTime =
				                sqlTimestamp.toLocalDateTime();
				}
			
//				커서 이동을위한 전체 메소드 목록
/*	boolean absolute(int row) 커서를 결과 세트의 주어진 행 번호로 이동하여 처음 (인수가 양수인 경우) 또는 끝 (음수 인 경우)부터 계산합니다.
인수가 0이면 커서가 첫 번째 행 앞으로 이동합니다.
커서가 유효한 위치로 이동하면 true를 반환하고 커서가 첫 번째 행 앞이나 마지막 행 뒤에 있으면 false를 반환합니다

void afterLast()	마지막 행 뒤로 커서를 이동합니다.

void beforeFirst()	첫 번째 행 앞으로 커서를 이동합니다.

boolean first()	커서를 첫 번째 행으로 이동합니다.
커서가 유효한 행에 있으면 true를 반환하고 결과 집합에 행이 없으면 false를 반환합니다.

boolean last()	커서를 마지막 행으로 이동합니다.
커서가 유효한 행에 있으면 true를 반환하고 결과 집합에 행이 없으면 false를 반환합니다.

boolean next()	커서를 다음 행으로 이동합니다.
새 현재 행이 유효하면 true를 반환하고 더 이상 행이 없으면 false를 반환합니다.

boolean previous()	커서를 이전 행으로 이동합니다.
새 현재 행이 유효하면 true를 반환하고 커서가 첫 번째 행 앞에 있으면 false를 반환합니다.

boolean relative(int rows)	커서를 양수 또는 음수로 상대적인 행 수만큼 이동합니다.
결과 집합의 첫 번째 / 마지막 행을 넘어 이동하면 커서가 첫 번째 / 마지막 행의 앞 / 뒤에 위치합니다.
커서가 유효한 행에 있으면 true를 반환하고 그렇지 않으면 false를 반환합니다.
*/
				
//				table : 
//				ID	NAME	INSERTION_DATE
//				1	THOMAS	2016 / 03 / 01
//				2	LAURA	2016 / 03 / 01
//				3	MAX	2016 / 03 / 01
//				4	KIM	2016 / 03 / 01
				
			try(Connection con =
		    DriverManager.getConnection(
		                                 url, user, passw);
		    Statement stmt = con.createStatement(
		           ResultSet.TYPE_SCROLL_INSENSITIVE,
		           ResultSet.CONCUR_READ_ONLY);
		    ResultSet rs = stmt.executeQuery(
		                  "SELECT * FROM user")) {
		   System.out.println(rs.absolute(3)); // true
		   System.out.println(rs.getInt(1)); // 3
		   System.out.println(rs.absolute(-3)); // true  ,, -3은 맨 뒤에서 부터 1,2,3 번째 id값을 나타냄
		   System.out.println(rs.getInt(1)); // 2
		   System.out.println(rs.absolute(0)); // false ,, 0번째 ID행에 커서가 올라감
		   System.out.println(rs.next()); // true ,, 다음 커서로 이동 
		   System.out.println(rs.getInt(1)); // 1
		   System.out.println(rs.previous()); // false  ,, 커서의 이전행으로 이동
		   System.out.println(rs.relative(2)); // true  ,, 2행만큼 이동
		   System.out.println(rs.getInt(1)); // 2
		   System.out.println(rs.relative(0)); // true  ,, 0행만큼 이동
		   System.out.println(rs.getInt(1)); // 2
		   System.out.println(rs.relative(10)); // false ,, 10행만큼 이동
		   System.out.println(rs.previous()); // true  ,, 이전행으로 이동
		   System.out.println(rs.getInt(1)); // 4
		} catch(SQLException e) {
		   e.printStackTrace();
		}		
				
				
	}

}
