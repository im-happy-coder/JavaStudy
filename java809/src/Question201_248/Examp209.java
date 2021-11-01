package Question201_248;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Examp209 {

	public static void main(String[] args) {
		IntStream stream = IntStream.of (1,2,3);
		IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;  //line n1
		IntStream newStream = stream.map(inFu.apply(10)); //line n2 
		newStream.forEach(System.out::print);
	}

}

//B. Replace IntFunction<IntUnaryOperator> inFu = x -> y -> x*y; line n1 with: