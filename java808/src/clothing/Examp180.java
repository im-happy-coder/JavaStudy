package clothing;

import java.util.ArrayList;

public class Examp180 {

	public static void main(String[] args) {
		ArrayList myList = new ArrayList();
		String [] myArray;
		try {
			while(true) {
				myList.add("MySring");
			}
			
		} catch (RuntimeException re) {
			System.out.println("Caught a RuntimeException");
		} catch (Exception e) {
			System.out.println("Caught an Exception");
		}
		System.out.println("Read use");
	}

}
