package clothing;

public class Examp142 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=++x;
		int z=0;
		if( y>=10 | y<=++x) {
			z=x;
		}else {
			z = x++;
		}
		System.out.println(z);
	}

}
