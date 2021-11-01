package examp01;

public class DataSearchEx1 {

	public static void main(String[] args) {
//		Data Search 데이터 검색
//		이것은 모두 최종 작업
//		Find로 시작하는 방법 :
//			Optional<T> findAny()
//			Optional<T> findFirst()
//		그리고 Match로 끝나는 메서드 :
//			boolean allMatch(Predicate<? super T> predicate)
//			boolean anyMatch(Predicate<? super T> predicate)
//			boolean noneMatch(Predicate<? super T> predicate)
		
//		findAny () 및 findFirst ()
//		findAny()그리고 findFirst()실질적으로 똑같이, 스트림에서 찾은 첫 번째 요소를 반환합니다.
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		stream.findFirst()
		    .ifPresent(System.out::println); // 1

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		stream2.findAny()
		    .ifPresent(System.out::println); // 1

//		스트림이 비어 있으면 비어있는 값을 반환합니다 Optional.
		Stream<String> stream = Stream.empty();
		System.out.println(
		    stream.findAny().isPresent()
		); // false

//		물론 이러한 메서드를 다른 스트림 작업과 결합 할 수 있습니다.
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		stream
		    .filter(i -> i > 4)
		    .findFirst()
		    .ifPresent(System.out::println); // 5
		
//		언제 사용 findAny()하고 언제 사용 findFirst()합니까?  findAny()는 병렬 스트림에 사용하면 첫번째 요소를 찾기 좋다.
//		병렬 스트림으로 작업 할 때 첫 번째 요소를 찾기가 더 어렵습니다. 이 경우 findAny()어떤 요소가 반환되는지 정말 신경 쓰지 않는다면 사용 하는 것이 좋습니다 .
		
		
		
		
		
//		anyMatch() 스트림의 요소가 주어진 술어와 일치하면 true를 반환합니다. ( 하나라도 일치하면 true)
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream.anyMatch(i -> i%3 == 0)
		); // true

//		스트림이 비어 있거나 일치하는 요소가없는 경우이 메서드는 false다음을 반환합니다 .
		IntStream stream = IntStream.empty();
		System.out.println(
		    stream.anyMatch(i -> i%3 == 0)
		); // false

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream2.anyMatch(i -> i%10 == 0)
		); // false

//		allMatch()스트림의 모든 요소가 주어진 술어와 일치하는 경우에만 true를 리턴합니다 . (모든 요소가 일치해야함)
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream.allMatch(i -> i > 0)
		); // true

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream2.allMatch(i -> i%3 == 0)
		); // false

//		스트림이 비어 있으면이 메서드는 조건자를 평가하지 않고 TRUE 를 반환 합니다 .
		IntStream stream = IntStream.empty();
		System.out.println(
		    stream.allMatch(i -> i%3 == 0)
		); // true

//		noneMatch()의 반대 인 allMatch()경우는 true를 돌려 NONE 스트림의 요소는 주어진 조건과 일치하지 않습니다는 :
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream.noneMatch(i -> i > 0)
		); // false

		IntStream stream2 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream2.noneMatch(i -> i%3 == 0)
		); // false

		IntStream stream3 = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		System.out.println(
		    stream3.noneMatch(i -> i > 10)
		); // true

//		스트림이 비어 있으면이 메서드는 조건자를 평가하지 않고 TRUE 도 반환 합니다 .
		IntStream stream = IntStream.empty();
		System.out.println(
		    stream.noneMatch(i -> i%3 == 0)
		); // true
		
		
		
//		이 코드를 고려하십시오.
		IntStream stream = IntStream.of(1, 2, 3, 4, 5, 6, 7);
		boolean b = stream
		                 .filter(i -> {
		                     System.out.println("Filter:" + i);
		                     return i % 2 == 0; })
		                 .allMatch(i -> {
		                     System.out.println("AllMatch:" + i);
		                     return i < 3;
		                 });
		System.out.println(b);

//		출력이 어떻게 될 것이라고 생각하십니까?
//		출력 :
		Filter:1
		Filter:2
		AllMatch:2
		Filter:3
		Filter:4
		AllMatch:4
		false
//		일부 작업에서는 전체 스트림을 처리 할 필요가 없습니다.
//		스트림 작업은 순차적으로 수행되지 않습니다
		
		키 포인트
		Stream API에는 두 가지 유형의 검색 작업이 있습니다. Find로 시작하는 방법 :
		Optional<T> findAny()
		Optional<T> findFirst()
		그리고 Match로 끝나는 메서드 :
		boolean allMatch(Predicate<? super T> predicate)
		boolean anyMatch(Predicate<? super T> predicate)
		boolean noneMatch(Predicate<? super T> predicate)
		두 유형 모두 TERMINAL 연산 으로 간주 됩니다.
		findAny()그리고 findFirst()실제로 그들은 스트림에서 볼 수있는 첫 번째 요소를 반환, 동일한 작업을 수행. 스트림이 비어 있으면 빈 Optional.
		병렬 스트림으로 작업 할 때 첫 번째 요소를 찾기가 더 어렵 기 때문에이 경우 findAny()어떤 요소가 반환되는지 정말 신경 쓰지 않는 경우 사용 하는 것이 좋습니다 .
		anyMatch()스트림의 요소가 주어진 술어와 일치하면 true를 리턴합니다. 스트림이 비어 있거나 일치하는 요소가 없으면을 반환합니다 false.
		allMatch()스트림의 모든 요소가 주어진 술어와 일치하는 경우에만 true를 리턴합니다 .
		noneMatch()경우에 true를 돌려 NONE 스트림의 요소는 주어진 조건과 일치하지 않습니다.
		둘 다 allMatch()및 스트림이 비어 있으면 noneMatch()반환 true합니다.
		이러한 작업은 모두 단락되어 결과가 발견되면 평가가 중지됩니다.
		
	}

}
