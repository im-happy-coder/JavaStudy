package examp02;

import java.util.stream.Stream;

public class StreamConcatEx1 {

	public static void main(String[] args) {
//		스트림의 연결
//		static <T> Stream<T> concat(Stream<? extends T> a, Stream<? extends T> b)
//		static DoubleStream concat(DoubleStream a, DoubleStream b)
//		static IntStream concat(IntStream a, IntStream b)
//		static LongStream concat(LongStream a, LongStream b)
		
		
		Stream<String> ss1 = Stream.of("Cake", "Milk");
		Stream<String> ss2 = Stream.of("Lemon", "Jelly");
		
		//스트림을 하나로 묶은 후 출력
		Stream.concat(ss1, ss2)
			.forEach(s -> System.out.println(s));
	}

}
