package clothing;

class Product1{
	double price;
}
public class Examp75 {
	public void updatePrice(Product1 product, double price) {
		price=price*2;
		product.price=product.price+price;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product1 prt = new Product1();
		prt.price = 200;
		double newPrice=100;
		
		Examp75 t = new Examp75();
		t.updatePrice(prt, newPrice);
		System.out.println(prt.price + " : " + newPrice);
	}

}
