package clothing;

class Test{

	int x, y;
	public Test(int x, int y) {
		init(x, y);
	}
	public void init(int x, int y) {
		this.x=x*x;
		this.y=y*y;
	}
}
public class Examp129 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=9, y=5;
//		Test obj = new Test(3, 2);
//		System.out.println(obj.x);
		System.out.println(x + " "+ y);

	}

}
