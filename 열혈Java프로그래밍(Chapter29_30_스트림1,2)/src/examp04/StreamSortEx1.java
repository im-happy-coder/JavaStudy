package examp04;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamSortEx1 {

	public static void main(String[] args) {
//		정렬 : 중간연산
//		Stream<T> sorted(Comparator<? super T> comparator) //Stream<T>의 메소드
//		Stream<T> sorted() //Stream<T>의 메소드
//		IntStream<T> sorted() //IntStream<T>의 메소드
//		LongStream<T> sorted() //LongStream<T>의 메소드
//		DoubleStream<T> sorted() //DoubleStream<T>의 메소드
		
		Stream.of("Box" , "Apple", "Robot")
			.sorted() //String 인스턴스는 Comparable<String>인터페이스를 구현! 이를 기반으로 한 정렬 (알파벳순)
			.forEach(s->System.out.println(s+"\t"));
		System.out.println();
		
		Stream.of("Box" , "Apple", "Robot")
		.sorted((s1, s2)->s1.length() - s2.length()) //ComparaTo메소드에 대한 람다식! 이를 기반으로 한 정렬 (문자열 길이가 짧은 순)
		.forEach(s->System.out.println(s+"\t"));
			
		
		
		IntStream.of(3, 9, 4, 2)
		.sorted() 
		.forEach(s->System.out.print(s+"\t"));
		
		System.out.println();
		
		DoubleStream.of(3.3, 9.2, 4.5, 2.6)
		.sorted() 
		.forEach(s->System.out.print(s+"\t"));
	}

}
