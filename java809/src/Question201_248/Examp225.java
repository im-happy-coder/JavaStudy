package Question201_248;
class Canvas implements Drawable {
public void draw () { }
}
abstract class Board extends Canvas { }
class Paper extends Canvas {
protected void draw (int color) { }
}
class Frame extends Canvas implements Drawable {
public void resize () { }
}
interface Drawable {
public abstract void draw ();
}

//E. All classes compile successfully.
public class Examp225 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
