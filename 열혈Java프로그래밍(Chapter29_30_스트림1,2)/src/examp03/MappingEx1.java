package examp03;

public class MappingEx1 {

	public static void main(String[] args) {
//		중간연산 
//		맵핑(Mapping)에 대한 추가 정리
//		[Stream<T>의 map시리즈 메소드들] 1:1맵핑
//		ㅁㅁㅁ 3개의 스트림 3 5 6이 하나의 String이 3(int)으로 매핑, 5하나의 String이 5(int)로 매핑, 이렇게 하나의 하나가 1:1매핑
		
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper)
//		IntStream mapToInt(ToIntFunction<? super T> mapper)
//		LongStream mapToLong(ToLongFunction<? super T> mapper)   //반환형이 Long
//		DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) //반환형이 Double
		
//		[Stream<T>의 flatMap시리즈 메소드들] 1:*맵핑
//		하나의 타입이 여려개를 맵핑해서 1:*맵핑
		
//		<R> Stream<R> flatMap(Function<T, Stream<R>> mapper)
//		IntStream flatMapToInt(Function<T, IntStream<R>> mapper)
//		LongStream flatMapToLong(Function<T, LongStream<R>> mapper) 
//		DoubleStream flatMapToDouble(Function<T, DoubleStream<R>> mapper) 
//		flatMap에 전달할 람다식에서는 '스트림을 생성하고 이를 반환'
	}

}
