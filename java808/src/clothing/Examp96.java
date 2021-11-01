package clothing;

import java.io.IOException;

class MyExcption extends RuntimeException{}
public class Examp96 {
	
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
			throw 3 > 10 ? new MyExcption() : new IOException();
		} catch (IOException ie) {
			// TODO: handle exception
			System.out.println("I");
		} catch (Exception re) {
			// TODO: handle exception
			System.out.println("B");
		}
	}

}
