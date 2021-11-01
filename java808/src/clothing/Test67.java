package clothing;

class MyString1{
	String msg;
	MyString1(String msg) {
		// TODO Auto-generated constructor stub
	}
}
public class Test67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello" + new StringBuilder("Java SE 8"));
		System.out.println("Hello" + new MyString("Java SE 8").msg);

	}

}
