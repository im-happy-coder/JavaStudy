package clothing;

class Book1 {int pages;}
public class Examp22 {
	int count;
	
	public void method(Book1 x, int k) {
		x.pages = 100;
		k = 200;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp22 obj = new Examp22();
		Book1 objBook1 = new Book1();
		System.out.println(objBook1.pages+":"+obj.count);
		obj.method(objBook1, obj.count);
		System.out.println(objBook1.pages+":"+obj.count);
	}

}
