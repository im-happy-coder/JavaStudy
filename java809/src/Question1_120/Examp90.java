package Question1_120;
class Foo{
	public void methodB(String s) {System.out.println("Foo " + s);}
}
class Bar extends Foo{
	public void methodB(String s) {System.out.println("Bar " + s);}
}
class Baz extends Bar{
	public void methodB(String s) {System.out.println("Baz " + s);}
}
class Daze extends Baz {
	private Bar bb = new Bar();
	public void methodB(String s) {
		bb.methodB(s);   //bb인스턴스 = Bar 출력,, Bar의 methodB를 출력
		super.methodB(s); //super조상 = Baz 출력 ,, Daze의 조상 Baz의 methodB출력
	}
}
public class Examp90 {

	public static void main(String[] args) {
		Baz d = new Daze();
		d.methodB("Hello");
	}

}
//B. Bar Hello Baz Hello