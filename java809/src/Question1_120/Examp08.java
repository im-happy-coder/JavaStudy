package Question1_120;



abstract class Shape {
	Shape ( ) { System.out.println ("Shape"); } //메서드가 아닌 생성자
	protected void area ( ) { System.out.println ("Shape"); }
	}


	class Square extends Shape {
	int side;
	Square(int side) {
		this.side = side;
	}
	public void area ( ) { System.out.println ("Square"); }
	}
	
	
	
	class Rectangle extends Square {
	int len, br;
	Rectangle (int x, int y) {
	super(x);
	len = x;
	br = y;
	}
	public void area ( ) { System.out.println ("Rectangle"); }         

}
public class Examp08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*문제
 
 
 
Given:
1. abstract class Shape {
2. Shape ( ) { System.out.println (“Shape”); }
3. protected void area ( ) { System.out.println (“Shape”); }
4. }
5.
6. class Square extends Shape {
7. int side;
8. Square int side {
9. /* insert code here 
10. this.side = side;
11. }
12. public void area ( ) { System.out.println (“Square”); }
13. }

14. class Rectangle extends Square {
15. int len, br;16. Rectangle (int x, int y) {
17. /* insert code here 
18. len = x, br = y;
19. }
20. void area ( ) { System.out.println (“Rectangle”); }
21. }


답 : D. At line 17, insert super (x);
	F. At line 20, use public void area ( ) {









 
 */
