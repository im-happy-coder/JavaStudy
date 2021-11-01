package clothing;

public class Examp161 {
	private char var;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char var1 = 'a';
		char var2 = var1;
		var2='e';
		
		Examp161 obj1 = new Examp161();
		Examp161 obj2 = obj1;
		obj1.var='o';
		obj2.var='i';
		
		System.out.println(var1+" :" +var2);
		System.out.print(obj1.var+" : "+obj2.var);
		
	}

}
