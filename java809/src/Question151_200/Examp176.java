package Question151_200;


class Canvas implements Drawable {
public void draw () { }
}
abstract class Board extends Canvas { }
class Paper extends Canvas {
protected void draw (int color) { } //오버 로딩,,, 오버라이딩할려면 매개변수를 지우고, public으로 바꿔줘야한다.
}
class Frame extends Canvas implements Drawable {
public void resize () { }
//abstract void open(); // 추상메서드를 추가할려면, 클래스가 추상클래스여야하거나, 추상메서드를 일반메서드로 만들어야한다.
}
interface Drawable {
public abstract void draw ();
}

//Which statement is true?
// 답 : C. Frame does not compile.



//만약 Frame클래스가 Canvas를 상속하지 않고 Drawable만 구현한다면
//draw()를 오버라이딩 해야한다.



public class Examp176 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
