package clothing;

public class Examp110 {
	public static int stVar = 100;
	public int var = 200;
	public String toString() {
		return stVar + ":" + var;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp110 t1 = new Examp110();
		t1.var = 300;
		System.out.println(t1);
		Examp110 t2 = new Examp110();
		t2.stVar = 300;
		System.out.println(t2);
	}

}
