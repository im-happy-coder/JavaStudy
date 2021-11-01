package clothing;

class Caller11{
	private void init() {
		System.out.println("init");
	}
	private void start() {
		init();
		System.out.println("Start");
	}
}
	
public class Test81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Caller11 ca = new Caller11();
//		ca.start();

	}

}
