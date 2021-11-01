package clothing;
class Caller1{
	private void init() {
		System.out.println("Init");
	}
	
	private void start() {
		init();
		System.out.println("start");
	}
}
public class Examp214 extends Caller1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller1 c1 = new Caller1();
		c1.start();
		c1.init();
	}

}
