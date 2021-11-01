package Question201_248;
interface Moveable<Integer> {
public default void walk (Integer distance) {System.out.println("Walking");}
public void run(Integer distance);
}
public class Examp238 {

	public static void main(String[] args) {
	/*	Which statement is true?
				A. 정답--
				Moveable can be used as below:
				Moveable<Integer> animal = n – > System.out.println(“Running” + n);
				animal.run(100);
				animal.walk(20);

				B.
				Moveable can be used as below:
				Moveable<Integer> animal = n – > n + 10;
				animal.run(100);
				animal.walk(20);

				C.
				Moveable can be used as below:
				Moveable animal = (Integer n) – > System.out.println(n);
				animal.run(100);
				Moveable.walk(20);

				D.
				Movable cannot be used in a lambda expression.*/
	}

}
