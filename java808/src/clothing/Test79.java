package clothing;


public class Test79 {
	int x;
	int y;
	public void doStuff(int x, int y) {
		x=x; // 이것도 효과 없음
		y=this.y; // 이 this는 효과 없음
	}
	public void display() {
		System.out.println(x+ " "+y+" : ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test79 m1 = new Test79();
		m1.x=100;
		m1.y=200;
		Test79 m2= new Test79();
		m2.doStuff(m1.x, m2.y);
		m1.display();
		m2.display();
	}

}
