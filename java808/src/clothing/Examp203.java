package clothing;

class C11{}
class C2 extends C11{}
class C3 extends C2{}
public class Examp203 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C11 obj1 = (C11) new C2();
		C2 obj2 = (C2) new C3();
		C2 obj3 = (C2) new C11();
		C3 ojb4 =(C3) obj2;
		 
	}

}
