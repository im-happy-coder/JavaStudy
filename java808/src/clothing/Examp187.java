package clothing;

public class Examp187 {
	int a1;
	static void doProduct(int a) {
		a = a * a;
	}
	static void doString(String s) {
		s.concat(" "+ s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp187 item = new Examp187();
		
		item.a1 = 11;
		String sb = new String("Hello");
		Integer i = 10;
		doProduct(i);
		doString(sb);
		doProduct(item.a1);
		System.out.println(i + "  "+ sb + " " + item.a1);
		
		
	}

}
