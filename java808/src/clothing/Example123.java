package clothing;

class Caller {
	private void init() {
		System.out.println("Init");
	}
	private void start() {
		init();
		System.out.println("Start");
	}
}

public class Example123 {
	public static void main(String[] args) {
		Caller c = new Caller();
//		c.start();
//		c.init();
	}
}
