package clothing;

public class Examp170 {
	public String name;
	public int moons;
	public Examp170(String name, int moons) {
		this.name=name;
		this.moons=moons;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp170[] p1 = {
				new Examp170("Mercury", 0),
				new Examp170("Venus", 0),
				new Examp170("Earth", 1),
				new Examp170("Mars", 2)
		};
		System.out.println(p1);
		System.out.println(p1[2].name);
		System.out.println(p1[2].moons);
	}

}
