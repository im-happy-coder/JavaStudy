package example04;

public class Account {

	private long balance;
	
	public Account() {
		
	}
	//현재 잔액을 가져오기
	public long getBlance() {
		return this.balance;
	}
	//입금하기
	public void deposit(int money) {
		this.balance += money;
	}
	//출금하기
	public void witdraw(int money) throws BalanceException {  //BalanceException클래스로 던짐
		if(this.balance < money) {
			//강제로 예외 발생
			throw new BalanceException("잔액 부족");
		}
		this.balance -= money;
		
	}
}
