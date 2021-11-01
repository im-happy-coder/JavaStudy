package examp01;

public class FlatMapEx1 {

	public static void main(String[] args) {
//		flatMap() 스트림의 요소를 하나의 (새) 스트림으로 "평탄화"(또는 결합)하는 데 사용됩니다.
		<R> Stream<R> flatMap(Function<? super T,
		                       ? extends Stream<? extends R>> mapper)

		DoubleStream flatMapToDouble(Function<? super T,
		                       ? extends DoubleStream> mapper)

		IntStream flatMapToInt(Function<? super T,
		                       ? extends IntStream> mapper)

		LongStream flatMapToLong(Function<? super T,
		                       ? extends LongStream> mapper)

//		flatMap()에서 사용하는 함수가 null을 반환하면 대신 빈 스트림이 반환됩니다.
//		이것이 어떻게 작동하는지 봅시다. 문자 목록이있는 경우 :
		List<Character> aToD = Arrays.asList('a', 'b', 'c', 'd');
		List<Character> eToG = Arrays.asList('e', 'f', 'g');
		Stream<List<Character>> stream = Stream.of(aToD, eToG);

//		그리고 우리는 모든 문자를 int 표현으로 변환하려고합니다. 
//		우리가해야 할 일은 목록의 요소를 하나의 스트림으로 가져온 다음 각 문자를 int로 변환하는 것입니다. 다행히도 "매핑"부분은 flatMap ()이하는 일입니다.
		stream
		    .flatMap(l -> l.stream())
		    .map(c -> (int)c)
		    .forEach(i -> System.out.format("%d ", i));
//		따라서이 코드는 다음을 출력 할 수 있습니다.
		97 98 99 100 101 102 103

//		이렇게하면 flatMap ()을 사용하여 Stream <List <T >>를 Stream <T>로 변환 할 수 있습니다.
		
//		flatMap () 다음에 peek ()를 사용하면 요소가 처리되는 방법을 명확히 할 수 있습니다.
		stream
		    .flatMap(l -> l.stream())
		    .peek(System.out::print)
		    .map(c -> (int)c)
		    .forEach(i -> System.out.format("%d ", i));
//		출력에서 볼 수 있듯이, 반환 된 스트림 flatMap()은 마치 요소 목록 스트림이 아닌 단일 요소 스트림으로 작업하는 것처럼 파이프 라인을 통해 전달됩니다.
//		a97 b98 c99 d100 e101 f102 g103

//		두 경우 모두 map () 및 flatMap ()은 스트림을 반환합니다. map ()은 Stream <Integer>를 반환하고 flatMap ()은 Stream <Character>를 반환합니다.

//		두 경우 모두 map () 및 flatMap ()은 Function를 인수로 취하지 만 각 Function에는 다른 매개 변수가 있습니다. 
//		Function<Character, Integer> and Function<List<Character>, Stream<? extends Character>>를 각각 확장합니다.
	}

}
