package clothing;

import java.io.IOException;
class MyExcption extends RuntimeException{}
public class Examp116 {

	public static void main(String[] args) {
		try {
			method1();
		} catch (MyExcption ne) {
			// TODO: handle exception
			System.out.println("A");
		}

	}
	public static void method1() {
		try {
			throw 0.5 > 10 ? new MyExcption() : new RuntimeException();
		} catch (RuntimeException re) {
			// TODO: handle exception
			System.out.println("B");
		}
	}

}