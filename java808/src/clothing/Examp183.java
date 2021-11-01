package clothing;

abstract class Robot implements Speakable{
	public abstract void process();
}
abstract class Humanoid extends Robot{
	public void speak(String s) {System.out.println(s);}
	public void proccess() {System.out.println("Heloping...");}
}
interface Speakable{
	public void speak(String s);
}
public class Examp183 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
