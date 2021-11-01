package clothing;

class MyString{
	String msg;
	MyString(String msg){
		this.msg=msg;
	}
}
public class Examp12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello "+new StringBuilder("Java SE 8"));
		System.out.println("Hello "+new MyString("Java SE 8"));

	}

}
