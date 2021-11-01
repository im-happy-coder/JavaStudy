package clothing;

class CheckingAccount{
	public int amount;
	public CheckingAccount(int amount) {
		this.amount=amount;
	}
	public int getAmount() {return amount;}
	public void setAmount(int amount) {this.amount=amount;}
	public void changeAmount(int x) {
		amount += x;
	}
}
public class Examp184 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckingAccount acct = new CheckingAccount((int)(Math.random()*1000));
//		acct.changeAmount(-acct.amount); 
//		acct.setAmount(0);
		acct.amount=0;
		//line n1
		System.out.println(acct.getAmount());

	}

}
