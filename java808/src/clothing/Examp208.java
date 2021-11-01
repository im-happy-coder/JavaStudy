package clothing;
interface Down{
	public void down();
}
interface Read extends Down{
	public void read();
}
abstract class Book implements Read{
	public void read() {
		System.out.println("READ BBOK");
	}
}
//class EBook extends Book{
//	public void read() {
//		System.out.println("READ EBOOK");
//	}
//}
public class Examp208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
