package examp01;

public class StreammapEx1 {

	public static void main(String[] args) {
//		map()
//		map() 스트림 요소의 값 또는 유형을 변환하는 데 사용됩니다.
		<R> Stream<R> map(Function<? super T,? extends R> mapper)

		IntStream mapToInt(ToIntFunction<? super T> mapper)

		LongStream mapToLong(ToLongFunction<? super T> mapper)

		DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper)

//		보시다시피 map ()은 T 유형의 스트림 요소를 유형 R로 변환하는 Function을 취하여 해당 유형의 스트림을 반환합니다.
		Stream.of('a', 'b', 'c', 'd', 'e')
		    .map(c -> (int)c)
		    .forEach(i -> System.out.format("%d ", i));
//		출력 :
		97 98 99 100 101
		
//		기본 유형으로 변환하는 버전이 있습니다. 예를 들면 다음과 같습니다.
		IntStream.of(100, 110, 120, 130 ,140)
		    .mapToDouble(i -> i/3.0)
		    .forEach(i -> System.out.format("%.2f ", i));

//		출력 :
		33.33 36.67 40.00 43.33 46.67
	}

}
