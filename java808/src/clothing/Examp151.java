package clothing;

class Bird{
	public void fly() {
		System.out.println("Fly");
	}
}
public class Examp151 extends Bird {
	public void dance() {
		System.out.println("Dance");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Bird b = new Bird(); Examp151 p = (Examp151) b;	x
//		Bird p = new Examp151(); x
//		Examp151 b = new Examp151(); Bird p = (Bird) b; x
		
		Bird b = new Examp151(); Examp151 p = (Examp151) b;
		p.fly();
		p.dance();
		
		

	}

}
