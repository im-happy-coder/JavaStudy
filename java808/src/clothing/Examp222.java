package clothing;

public class Examp222 {
	int x;
	int y;
	public void doStuff(int x, int y) {
		x = x;
		y = this.y;
	}
	public void display() {
		System.out.println(x+" "+ y + " :");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp222 m1 = new Examp222();
		m1.x=100;
		m1.y=200;
		Examp222 m2 = new Examp222();
		m2.doStuff(m1.x, m1.y);
		m1.display();
		m2.display();

	}

}
