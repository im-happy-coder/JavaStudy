package examp02;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreateEx1 {

	public static void main(String[] args) {
//		스트림의 생성 : 스트림 생성에 필요한 데이터를 직접 전달
//		static <T> Stream<T> of(T t)
//		static <T> Stream<T> of(T...values)
		
		Stream.of(11, 22, 33, 44) //네 개의 값으로 이뤄진 스트림 생성
		.forEach(n->System.out.print(n + "\t"));
		System.out.println();
		
		Stream.of("So Simple") // 하나의 String인스턴스로 이뤄진 스트림 생성
		.forEach(s->System.out.print(s + "\t"));
		System.out.println();
		
		List<String> sl = Arrays.asList("Toy", "Robot", "Box");
		Stream.of(sl) // 하나의 컬렉션 인스턴스로 이뤄진 스트림 생성
		.forEach(w->System.out.print(w + "\t"));
		System.out.println();
		
//		스트림의 다양한 of메소드들
		
//		static DoubleStream of(double...values) //DoubleStream의 메소드
//		static DoubleStream of(double t) //DoubleStream의 메소드
		
//		static IntStream of(int...values) //IntStream의 메소드
//		static IntStream of(int t) //IntStream의 메소드
		
//		static LongStream of(long...values) //LongStream의 메소드
//		static LongStream of(long t) //LongStream의 메소드
		
		
//		static IntStream range(int startInclusive, int endExclusive) //IntStream의 메소드,, Inclusive는 자신포함, Exclusive는 자신미포함
//		range(1,9)이면 1부터 8까지만 지정함
//		static IntStream rangeClosed(int startInclusive, int endInclusive) //IntStream의 메소드
		
//		static LongStream range(long startInclusive, long endInclusive) //LongStream의 메소드
//		static LongStream rangeClosed(long startInclusive, long endInclusive) //LongStream의 메소드
	}

}
