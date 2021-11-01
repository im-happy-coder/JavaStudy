package example01;

public class IncreDreEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10;
		int y = 10;
		
		
		
		System.out.println("---------------------");
		System.out.println("x = " + (x++)); //후위증가연산자 ;이 끝나면 1증가
		System.out.println("x = " + (x)); 
		
		System.out.println("y = " + (++y)); //전위증가연산자 ;이 끝나기전에 1증가
		System.out.println("y = " + (y));
		System.out.println("---------------------");
		
		
		System.out.println("(x++) + (++y) : " + ((x++) + (++y)) );		
	}

}
