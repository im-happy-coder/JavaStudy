package examp01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex3 {

	public static void main(String[] args) {
		 
		   List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .min( Comparator.comparing(
			                    (String s) -> s.length())
			       ).ifPresent(System.out::println); // on
	}

}
