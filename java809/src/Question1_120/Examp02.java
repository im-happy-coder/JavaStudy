package Question1_120;

import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;
import java.util.stream.IntStream;

public class Examp02 {

	public static void main(String[] args) {
		IntStream stream = IntStream.of(1,2,3);
//		IntFunction<Integer> inFu= x -> y -> x*y; //line n1
		IntFunction<IntUnaryOperator> infu = x->y->x*y;
		IntStream newStream = stream.map(infu.apply(10)); //line n2 newStream.forEach(System.output::print);
		newStream.forEach(System.out::print);
		
		//´ä : Replace line n1 with: IntFunction<IntUnaryOperator> inFu = x -> y -> x*y;
	}

}
