package Question121_150;

//람다 식을 만드는 데 사용할 수있는 두 개의 인터페이스는 무엇입니까? (2 개 선택)
//Which two interfaces can you use to create lambda expressions? (Choose two.)

//이게 답
interface P { public void method1();}
interface Q extends P {public void method1();}

//아래는 람다식으로 이용불가능
interface R extends P { public void method2();}
interface S { public default void method() {}}
interface T {public void method1(); public void method2();}
interface U {public void method1(); public abstract void method2();}

public class Examp131 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		P는 하나의 추상 메소드를 가지고 있습니다 –> 기능 인터페이스
//		Q는 P를 확장하고 method1을 재정의하므로 Q는 하나의 추상 함수를 갖습니다. –> 기능 인터페이스

	}

}
