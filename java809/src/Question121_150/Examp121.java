package Question121_150;

class MyClass implements AutoCloseable{
	int test;
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}
	public MyClass copyObject() {
		return this;
	}
}
public class Examp121 {

	public static void main(String[] args) throws Exception {
		MyClass obj = null;
		try ( MyClass obj1 = new MyClass()) {
			obj1.test = 100;
			obj = obj1.copyObject(); //line n1
		}
		System.out.println(obj.test);  //line n2
	}

}
