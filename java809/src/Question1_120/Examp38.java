package Question1_120;

import java.util.Arrays;
import java.util.List;

public class Examp38 {

	public static void main(String[] args) {
		List<String> listVal = Arrays.asList("Joe", "Paul", "Alice", "Tom");
		System.out.println (
		listVal.stream().filter(x -> x.length()>3).count()
		// line n1
		);
	}

}
