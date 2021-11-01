package clothing;

class Cart{
	Product p;
	double totalAmount;
}
class Product{
	String name;
	Double price;
}
public class Examp07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart c = new Cart();
		System.out.println(c.p+ " : "+c.totalAmount);

	}

}
