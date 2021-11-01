package Question1_120;


interface Moveable<Integer> {
public default void walk (Integer distance) {System.out.println("Walking");}
//디폴트 메서드는 인터페이스에서 선언되며 인스턴스를 생성하면 값을 사용할 수 있는 장점이있다.
public void run(Integer distance);  //이게 람다식이 적용됨
}

public class Examp61 {

	public static void main(String[] args) {
		Moveable<Integer> animal = n -> System.out.println("Running" + n); //람다식은 추상메서드가 하나인 인터페이스만 쓸 수 있다.//디폴트 메서드는 예외
		animal.run(100);
		animal.walk(20);
	}

}
//  Moveable can be used as below: Moveable<Integer> animal = n - > System.out.println("Running" + n); animal.run(100); animal.walk(20);