package example04;
//사용자 정의 예외 클래스  //일반 예외는 Exception이 조상이다  // 실행예외는 RuntimeException이 조상이다
public class BalanceException extends Exception{ 
	
	
	public BalanceException() {
		
	}

	public BalanceException(String message) {
		super(message); //조상 클래스-Exception의 생성자 호출
	}
}
