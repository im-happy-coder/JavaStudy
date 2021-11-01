package clothing;

public class Examp135 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 100;
		int a = x++;
		System.out.println("a="+a);
		int b = ++x;
		System.out.println("b="+b);
		int c = x++;
		System.out.println("c="+c);
		int d = (a<b) ? (a<c) ? a:(b<c) ? b:c:x;
		System.out.println(d);

	}

}
