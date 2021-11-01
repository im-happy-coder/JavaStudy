package clothing;

import java.util.function.Predicate;

public class Examp35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = (n) -> n%2==0;
		Boolean s =p.test(100);
		System.out.println(s);

	}

}
