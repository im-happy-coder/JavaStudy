package clothing;

public class Examp147 {
	private static int stock = 10;
	static int qty;
	public static void purchase(int qty) {
		stock += qty;
		}
	public static void sell(int qty) {
		stock -= qty;
		}
	public static void printStock(String action) {
		System.out.println(action + " : "+qty+" items.Stock int Hand: "+stock);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp147 k1 = new Examp147();
		k1.sell(5);
		k1.printStock("sold");
		Examp147 k2 = new Examp147();
		k2.purchase(5);
		k2.printStock("Purchsed");
	}

}
