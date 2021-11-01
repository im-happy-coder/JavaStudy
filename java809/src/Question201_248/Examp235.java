package Question201_248;

public class Examp235 {

	public static void main(String[] args) {
//		9. Connection conn = DriveManager.getConnection(dbURL, userName, passWord);
//		10. String query = "SELECT id FROM Employee";
//		11. try (Statement stmt = conn.createStatement()) {
//		12. ResultSet rs = stmt.executeQuery(query); 		--여기서 RsultSet를 사용했는데.
//		13. stmt.executeQuery("SELECT id FROM Customer");	 -- 여기서 다시 stmt를 사용함
//		14. while (rs.next()) {
//		15. //process the results
//		16. System.out.println("Employee ID: "+ rs.getInt("id"));
//		17. }
//		18. } catch (Exception e) {
//		19. System.out.println ("Error");
//		20. }

		
		//		프로그램의 13 번째 줄은 Statement 객체의 executeQuery 
//		메서드를 다시 사용하므로 이전 ResultSet이 자동으로 닫히므로 프로그램의 14 번째 줄에서 SQLException이 발생합니다.
//		답 : C. The program prints Error.
	}

}
