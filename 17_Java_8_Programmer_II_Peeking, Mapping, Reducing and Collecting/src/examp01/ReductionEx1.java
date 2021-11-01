package examp01;

public class ReductionEx1 {

	public static void main(String[] args) {
//		Reduction 절감(축소)

//	 reduction는 많은 요소를 가져 와서 하나의 값이나 객체로 결합 (축소)하는 작업이며 작업을 여러 번 적용하여 수행됩니다.
//	 reduction의 몇 가지 예는 N 개의 요소 합산, N 개의 최대 요소 찾기 또는 요소 계수입니다.
//	  다음 예제와 같이 for 루프를 사용하면 숫자 배열을 합계로 줄입니다.
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int sum = 0;
		for(int n : numbers) {
		    sum += n;
		}
//		물론 루프 대신 스트림을 사용하여 축소하면 병렬화가 더 쉬워지고 가독성이 향상되는 등 더 많은 이점이 있습니다.
//		Stream 인터페이스에는 축소를위한 두 가지 방법이 있습니다. -- reduce(), collect()
		
		
		
//		reduce()
//		이 방법에는 세 가지 버전이 있습니다.
		Optional<T> reduce(BinaryOperator<T> accumulator)

		T reduce(T identity,
		         BinaryOperator<T> accumulator)

		<U> U reduce(U identity,
		             BiFunction<U,? super T,U> accumulator,
		             BinaryOperator<U> combiner)
		

//		BinaryOperator <T>는 BiFunction <T, T, T>와 동일합니다. 여기서 두 인수와 반환 형식은 모두 동일한 형식입니다.	

//		하나의 인수를 취하는 버전부터 시작하겠습니다. 이것은 다음과 동일합니다.
		boolean elementsFound = false;
		T result = null;
		for (T element : stream) {
		    if (!elementsFound) {
		        elementsFound = true;
		        result = element;
		    } else {
		        result = accumulator.apply(result, element);
		    }
		return elementsFound ? Optional.of(result)
		                     : Optional.empty();
		
//		이 코드는 각 요소에 대한 function을 적용하여 결과를 누적하고 그 결과를 래핑하는 Optional을 반환하거나 요소가없는 경우 빈 Optional을 반환합니다.
		
//		구체적인 예를 살펴 보겠습니다. 합계가 어떻게 축소 작업인지 확인합니다.
		int[] numbers = {1, 2, 3, 4, 5, 6};
		int sum = 0;
		for(int n : numbers) {
		    sum += n;
		}
//		여기서 누산기 작업은 다음과 같습니다.
		sum += n;
		Or:
		sum = sum + n;
//		번역 :
		OptionalInt total = IntStream.of(1, 2, 3, 4, 5, 6)
			                .reduce( (sum, n) -> sum + n );
//		(기본 버전의 스트림이 기본 버전의 Optional을 사용하는 방법에 유의하십시오.)
//		이것은 단계적으로 일어나는 일입니다.
//		1. 결과를 누적하는 내부 변수는 스트림의 첫 번째 요소 (1)로 설정됩니다.
//		2.이 누산기와 스트림의 두 번째 요소 (2)는 람다 식 (sum, n)-> sum + x로 표현되는 BinaryOperator에 인수로 전달됩니다.
//		3. 결과 (3)가 누산기에 할당됩니다.
//		4. 누산기 (3)와 스트림의 세 번째 요소 (3)는 BinaryOperator에 인수로 전달됩니다.
//		5. 결과 (6)가 누산기에 할당됩니다.
//		6. 더 이상 요소가 없을 때까지 스트림의 다음 요소에 대해 4 단계와 5 단계를 반복합니다.

		
//		그러나 초기 값이 필요하면 어떻게합니까? 이와 같은 경우 두 가지 인수를 사용하는 버전이 있습니다.
//		T reduce(T identity, BinaryOperator<T> accumulator) ---T identity가 초기값 설정
//		첫 번째 인수는 초기 값이며, 엄밀히 말하면이 값은 누산기 함수의 ID 여야합니다. 
//		즉, 각 값 v에 대해 accumulator.apply (identity, v)는 v와 같아야하기 때문에 identity라고합니다. .
		
//		이 버전 reduce()은 다음과 동일합니다.
		T result = identity;
		for (T element : stream)  {
		    result = accumulator.apply(result, element);
		} 
		return result;
//		Optional스트림이 비어 있으면 ID 값이 반환되므로이 버전은 객체를 반환하지 않습니다 .
//		예를 들어 합계 예제는 다음과 같이 다시 작성할 수 있습니다.
		int total = IntStream.of(1, 2, 3, 4, 5, 6)
		               .reduce( 0,
		                       (sum, n) -> sum + n ); // 21
//		또는 다른 초기 값 사용 :
			int total = IntStream.of(1, 2, 3, 4, 5, 6)
			                .reduce( 4,
			                        (sum, n) -> sum + n ); // 25
//			그러나 마지막 예에서 첫 번째 값은 예를 들어 4 + 1이 4와 같지 않으므로 첫 번째 예에서와 같이 ID로 간주 될 수 없습니다.
//			이것은 다음 장에서 검토 할 병렬 스트림으로 작업 할 때 몇 가지 문제를 일으킬 수 있습니다.
//			이제 이러한 버전에서는 T 유형의 요소를 가져와 T 유형의 축소 된 값도 반환합니다.
//			그러나 다른 유형의 축소 된 값을 반환하려면 reduce ()의 세 가지 인수 버전을 사용해야합니다.
			<U> U reduce(U identity,
		             BiFunction<U,? super T, U> accumulator,
		             BinaryOperator<U> combiner)

//			(유형 T및 사용에주의 U)
//			이 버전은 다음과 동일합니다. 
			U result = identity;
			for (T element : stream) {
				result = accumulator.apply(result, element) 
			}
			return result;
//			예를 들어 스트림의 모든 문자열 길이의 합계를 얻고 자하므로 문자열 (type T)을 얻고 정수 결과 (type U)를 원한다고 생각해보십시오 .
//			이 경우 다음과 같이 사용 reduce()합니다.
			int length =
				    Stream.of("Parallel", "streams", "are", "great")
				        .reduce(0,
				                (accumInt, str) ->
				                   accumInt + str.length(), //accumulator
				                (accumInt1, accumInt2) ->
				                   accumInt1 + accumInt2);//combiner

//				인수 유형을 추가하여 더 명확하게 만들 수 있습니다.
				int length =
				  Stream.of("Parallel", "streams", "are", "great")
				      .reduce(0,
				            (Integer accumInt, String str) ->
				               accumInt + str.length(), //accumulator
				            (Integer accumInt1, Integer accumInt2) ->
				               accumInt1 + accumInt2);//combiner
		
//	누산기 함수가 누산기 함수에 매핑 (변환) 단계를 추가하기 때문에이 버전의 reduce ()는 map ()과 다른 버전의 reduce () 메서드의 조합으로 작성할 수 있습니다 (이를 지도 축소 패턴) :
				int length =
					    Stream.of("Parallel", "streams", "are", "great")
					        .mapToInt(s -> s.length())
					        .reduce(0,
					               (sum, strLength) ->
					                   sum + strLength);
//				또는 간단히 :
					int length = Stream.of("Parallel", "streams", "are", "great")
					                .mapToInt(s -> s.length())
					                .sum();
					
//					사실, 지난 장에서 배운 계산 작업은 내부적으로 작업을 줄이기 위해 구현되기 때문입니다.
					average
					count
					max
					min
					sum
//					또한 동일한 유형의 값을 반환하면 결합기 함수가 더 이상 필요하지 않으므로 (이 함수는 누산기 함수와 동일 함)이 경우 두 인수 버전을 사용하는 것이 좋습니다.

//					다음과 같은 경우 세 가지 버전의 reduce () 메서드를 사용하는 것이 좋습니다.

//					병렬 스트림 작업 (자세한 내용은 다음 장에서)
//					매퍼 및 누산기로 하나의 기능을 갖는 것이 별도의 매핑 및 축소 기능을 갖는 것보다 더 효율적입니다.
					
	}

}
