package clothing;

class C22 {
	public void displayC2() {
		System.out.println("C2");
	}
}
interface I {
	public void displayI();
	}

class C111 extends C22 implements I{
	public void displayI() {
		System.out.println("C1");
	}
}
public class Examp21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C22 obj1 = new C111();
		I obj2 = new C111();
		
		C22 s =  (C22) obj2;
		I t =  (I) obj1;
		
		t.displayI();
		s.displayC2();
	}

}
 