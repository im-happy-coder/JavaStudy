package Question151_200;

import java.util.stream.IntStream;

public class Examp153 {

	public static void main(String[] args) {
		//line n1
		
		IntStream str = IntStream.of (1, 2, 3, 4);
		Double d  = str.average().getAsDouble();
		System.out.println("Average = " + d);
		
		
		
		
		
		
//		 DoubleStream str = Stream.of (1.0, 2.0, 3.0, 4.0);    X
//		 Stream<Double> str = Stream.of (1.0, 2.0, 3.0, 4.0);  O
	}

}
