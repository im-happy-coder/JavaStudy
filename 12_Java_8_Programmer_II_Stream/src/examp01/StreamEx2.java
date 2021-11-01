package examp01;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx2 {

	public static void main(String[] args) {
		int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
		long n = IntStream.of(digits).count();
		System.out.println(IntStream.of(digits).findFirst()); // OK.
		
		
		Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
		.map(str -> {
		    System.out.println("Mapping: " + str);
		    return str.length();
		})
		.filter(i -> {
		    System.out.println("Filtering: " + i);
		    return i > 3;
		})
		.limit(2)
		.forEach(System.out::println);
	}

}
