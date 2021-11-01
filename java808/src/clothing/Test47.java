package clothing;

public class Test47 {
	private char var;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var1 = 'a';
		char var2=var1;
		var2 = 'e';
		
		Test47 obj1 = new Test47();
		Test47 obj2 = obj1;
		obj1.var='i';
		obj2.var='o';
		System.out.println(var1+ "::"+var2);
		System.out.println(obj1.var+ "::"+obj2.var);

	}

}
