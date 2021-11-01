package examp02;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class ParallelStreamEx1 {

	public static void main(String[] args) {
//		병렬스트림으로 변경
//		Stream<T> parallel() //Stream<T>의 메소드
//		DoubleStream<T> parallel() //DoubleStream의 메소드
//		IntStream<T> parallel() //IntStream의 메소드
//		LongStream<T> parallel() //LongStream의 메소드
		
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		Stream<String> ss = ls.stream(); //스트림 생성
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		String str = ss.parallel() //병렬 스트림 생성
				.reduce("", lc); //스트림이 빈 경우 ""반환
		System.out.println(str);
//		출력 --> Complex
		
		
		
//		스트림을 생성하지 않고 만드는 방법 
//		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
//		
//		BinaryOperator<String> lc = (s1, s2) -> {
//			if(s1.length() > s2.length())
//				return s1;			else
//				return s2;
//		};
//		String str = ls.parallelStream()
//				.reduce("", lc); //스트림이 빈 경우 ""반환
//		System.out.println(str);
////		출력 --> Complex
	}

}
