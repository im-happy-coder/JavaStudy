package Question1_120;

import java.util.function.Supplier;

class Bird {
	public void fly () { System.out.print("Can fly"); }
	}
class Penguin extends Bird {
	public void fly () { System.out.print("Cannot fly"); }
	}
public class Examp07 {
	public static void main(String[] args) {
		fly(() -> new Bird());
		fly(Penguin::new);
	}

	static void fly(Supplier<Bird> bird) {
	bird.get().fly();}
}
