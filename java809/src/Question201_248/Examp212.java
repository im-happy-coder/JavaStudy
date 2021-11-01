package Question201_248;
abstract class Shape {
Shape ( ) { System.out.println ("Shape"); }
protected void area ( ) { System.out.println ("Shape"); }
}

class Square extends Shape {
int side;
Square(int side) {
/* insert code here */
this.side = side;
}
public void area ( ) { System.out.println ("Square"); }
}
class Rectangle extends Square {
int len, br;
Rectangle (int x, int y) {
super(x);/* insert code here */                               //여기 super(x);
len = x; br = y;
}
public void area ( ) { System.out.println ("Rectangle"); }    //여기 public 
}
public class Examp212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

// 답 : 
//- line 17: insert super(x);
//- line 20: insert public

//At line 17, insert super (x)
//At line 20, use public void area ( ) {