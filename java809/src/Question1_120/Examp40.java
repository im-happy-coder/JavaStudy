package Question1_120;
class Canvas implements Drawable {
public void draw () { }
}

abstract class Board extends Canvas { }

class Paper extends Canvas {
protected void draw (int color) { }  //메소드 오버로딩으로 가능함,,, 
//protected void draw () { } //이건 불가능함  가능하게 할려면 => public void draw () { } 하던가 Canvas에 draw를 Protected로 바꿔준다.
}

class Frame extends Canvas implements Drawable {
public void resize () { }
}

interface Drawable {
public abstract void draw ();
}



//All classes compile successfully.




public class Examp40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	
}
