package clothing;

import java.util.ArrayList;
import java.util.List;

class Product3{
	int id;
	String name;
	public Product3(int id, String name) {
		this.id=id;
		this.name=name;
	}
}
public class Examp77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Product3> st1 = new ArrayList<>();
		st1.add(new Product3(10, "IceCream"));
		st1.add(new Product3(11, "Chocolate"));
		Product3 p1 = new Product3(10, "IceCream");
		System.out.println(st1.indexOf(p1));
	}

}
