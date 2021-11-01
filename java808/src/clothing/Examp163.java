package clothing;

public class Examp163 {
	int id;
	String name;
	public Examp163(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp163 p1 = new Examp163(101, "Pen");
		Examp163 p2 = new Examp163(101, "Pen");
		Examp163 p3 = p1;
		boolean an1 = p1 == p2;
		boolean an2 = p1.name.equals(p2.name);
		System.out.println(an1+ " : "+an2);
	}

}
