package clothing;

interface Downloadable{
	public void download();
}
interface Readable extends Downloadable{
	public void readBook();
}
abstract class Book111 implements Readable{
	public void readBook() {
		// TODO Auto-generated method stub
		System.out.println("Read Book");
	}
	

}
class EBook23  extends Book111{
	public void readBook() {
		System.out.println("Read Book");
	}
	@Override
	public void download() {
		// TODO Auto-generated method stub
		
	}

}
public class Test37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book111 book1 = new EBook23();
		book1.readBook();

	}

}
