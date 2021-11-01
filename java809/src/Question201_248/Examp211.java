package Question201_248;

import java.util.function.Supplier;

class Bird {
public void fly () { System.out.print("Can fly"); }
}
class Penguin extends Bird {
public void fly () { System.out.print("Cannot fly"); }
}
public class Examp211 {
	static void fly (Supplier<Bird> bird) { bird.get().fly(); }
	public static void main(String[] args) {
		fly( ( ) -> new Bird ( ));
		fly (Penguin :: new);
		/* line n1 */
		
		
		
		}
}
//C. static void fly (Supplier<Bird> bird) { bird.get( ) fly (); }