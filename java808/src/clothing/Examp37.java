package clothing;


interface I3{
	public void displayI();
}

abstract class C222 implements I3{
	public void displayC2() {
		System.out.println("C2");
	}
}


class C1111 extends C222 {
	public void displayI() {
		// TODO Auto-generated method stub
		System.out.println("C1");
		
	}
}
public class Examp37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C222 obj1 = new C1111();
		I3 obj2 = new C1111();
		
		C222 s = (C222) obj2; // (c222)캐스팅필요함
		I3 t = obj1;  //(I)캐스팅 필요없음
		t.displayI();
		s.displayC2();
	}

}
