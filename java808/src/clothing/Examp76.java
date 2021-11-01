package clothing;

public class Examp76 {
	void readCard(int cardNo) throws Exception{
		System.out.println("Reading Card");
	}
	void checkCard(int cardNo) throws RuntimeException{
		System.out.println("checking Card");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Examp76 ex = new Examp76();
		int cardNo = 12344;
		
		ex.readCard(cardNo);
		ex.checkCard(cardNo);
	}

}
