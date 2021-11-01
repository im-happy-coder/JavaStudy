package example04;

public class AccoutEx {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(50000);
		System.out.println("현재 잔액 : " + account.getBlance());
		
		try {
			//예외처리코드가 반드시 들어가야함.
			//withdraw()에서 예외를 throws하고 있으니 호출한 main메서드 여기서 예외코드를 작성해줘야함.
			account.witdraw(10000);
			account.witdraw(50000);
			System.out.println("현재 잔액 : "+ account.getBlance());
		} catch (BalanceException e) {
			System.out.println("예외 원인 : " + e.getMessage());
//			e.printStackTrace();
		} finally {
			System.out.println("정상 종료됩니다.");
		}

	}

}
