package examp01;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		 List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .sorted( (s1, s2) -> s2.length() - s1.length() )
			       .forEach(System.out::println);
			   
			  
	}

}
