package clothing;

public class Examp25 {
	int x,y;
	public Examp25(int x, int y) {
		init(x,y);
	}
	public void init(int x, int y) {
		this.x=x*x;
		this.y=y*y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3, y=5;
		Examp25 obj = new Examp25(x,y);
		System.out.println(x + " "+ y);
	}

}
