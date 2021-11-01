package Question121_150;

import java.util.Arrays;
import java.util.List;

public class Examp125 {

	public static void main(String[] args) {
//		Which modification enables the code to print Price 5 New Price 4?
		
		List<Integer> prices = Arrays.asList(3, 4, 5);
		prices.stream()
		.filter(e->e > 4)
		.peek(e-> System.out.println("Price"+e))  //line n1
		.map(n->n-1)								//line n2
//		.peek(n-> System.out.println(" New Price " + n));  //line n3
		.forEach (n -> System.out.println ("New Price" + n));
	}

}
/*
A. Replace line n2 with .map (n -> System.out.println ("New Price" + n ""1)) and remove line n3
B. Replace line n2 with .mapToInt (n -> n "" 1);
C. Replace line n1 with .forEach (e -> System.out.print ("Price" + e))
D. Replace line n3 with .forEach (n -> System.out.println ("New Price" + n));


´ä : D
*/