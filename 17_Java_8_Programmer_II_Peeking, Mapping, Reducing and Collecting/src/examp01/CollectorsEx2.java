package examp01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsEx2 {

	public static void main(String[] args) {
//		이렇게하면 이전 예제를 다시 작성할 수 있습니다.
		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(
		           ArrayList::new,
		           ArrayList::add,
		           ArrayList::addAll
		    );
//		같이:
		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(Collectors.toList()); // [1, 2, 3, 4, 5]
		
//		이 모든 메서드는 정적이므로 static가져 오기 를 사용할 수 있습니다 .
		import static java.util.stream.Collectors.*;
		...
		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(toList()); // [1, 2, 3, 4, 5]
		
//		요소를 다음으로 수집하려는 경우 Set:
			Set<Integer> set =
			    Stream.of(1, 1, 2, 2, 2)
			        .collect(toSet()); // [1, 2]
			
//			다른 Collection구현 을 만들고 싶다면 :
			Deque<Integer> deque =
			    Stream.of(1, 2, 3)
			        .collect(
			            toCollection(ArrayDeque::new)
			    ); // [1, 2, 3,]
		
		
//			문자열 스트림으로 작업하는 경우 다음을 사용하여 모든 요소를 ​​하나의 문자열로 결합 할 수 있습니다.
			String s = Stream.of("a", "simple", "string")
		               .collect(joining()); // "asimplestring"

//			구분 기호를 전달할 수도 있습니다.
			String s = Stream.of("a", "simple", "string")
		              .collect(joining(" ")); // " a simple string"

//			접두사와 접미사 :
			String s = Stream.of("a", "simple", "string")
		             .collect(
		                 joining(" ", "This is ", ".")
		             ); // "This is a simple string."
		
		
		
//		map의 경우 필요에 따라 세 가지 옵션이 있기 때문에 상황이 조금 더 복잡해집니다.
//		첫 번째 옵션에서 toMap()두 개의 인수를 사용합니다 (읽기 어렵고 어쨌든 많은 값을 제공하지 않기 때문에 반환 유형을 표시하지 않습니다).
			toMap(Function<? super T,? extends K> keyMapper,
			      Function<? super T,? extends U> valueMapper)
		
//		둘 다 Functions스트림의 요소를 인수로 취하고 키 또는의 항목 값을 반환합니다 Map. 예를 들면 다음과 같습니다.
			Map<Integer, Integer> map =
			    Stream.of(1, 2, 3, 4, 5, 6)
			        .collect(
			            toMap(i -> i, // Key
			                  i -> i * 2 // Value
			            )
			        );
//		여기서 우리는 요소 (1과 같은)를 키로 사용하고 요소에 2를 곱한 값 (2와 같은)을 사용합니다.
//			i-> i를 Function.identity ()로 작성할 수도 있습니다.	
			Map<Integer, Integer> map =
				    Stream.of(1, 2, 3, 4, 5, 6)
				        .collect(
				            toMap(Function.identity(), // Key
				                  i -> i * 2 // Value
				            )
				        );	
			
//			java.util.function.Function.identity ()는 항상 입력 인수를 반환하는 함수를 반환합니다. 즉, t-> t와 동일합니다.
//			그러나 다음과 같이 둘 이상의 요소가 동일한 키에 매핑되면 어떻게됩니까?
			Map<Integer, Integer> map =
				    Stream.of(1, 2, 3, 4, 5, 6)
				        .collect(toMap(i -> i % 2, // Key
				                      i -> i // Value
				                 )
				        );
//			Java는 무엇을 해야할지 모르기 때문에 예외가 발생합니다.
//			Exception in thread "main" java.lang.IllegalStateException: Duplicate key 1
//			   at java.util.stream.Collectors.lambda$throwingMerger$113(Collectors.java:133)
//			   at java.util.stream.Collectors$$Lambda$3/303563356.apply(Unknown Source)
//			   at java.util.HashMap.merge(HashMap.java:1245)
//			   at java.util.stream.Collectors.lambda$toMap$171(Collectors.java:1320)
			
//			이러한 경우 세 가지 인수를 사용하는 버전을 사용합니다.
			toMap(Function<? super T,? extends K> keyMapper,
				      Function<? super T,? extends U> valueMapper,
				      BinaryOperator<U> mergeFunction)
//			세 번째 인수는 중복 키가있을 때 수행 할 작업을 정의하는 함수입니다. 예를 들어 목록을 만들어 값을 추가 할 수 있습니다.
			Map<Integer, List<Integer>> map =
		    Stream.of(1, 2, 3, 4, 5, 6)
		        .collect(toMap(
		                    i -> i % 2,  //key
		                    i -> new ArrayList<Integer>(Arrays.asList(i)),   
		                    (list1, list2) -> {
		                       list1.addAll(list2);
		                       return list1;  //value
		                    }
		                 )
		         );	
//			출력하면:
			{0=[2, 4, 6], 1=[1, 3, 5]}
			
//			toMap ()의 세 번째 버전은 이러한 모든 인수와 결과가 삽입 될 비어있는 새 맵을 반환하는 인수를 모두 취합니다.	
			toMap(Function<? super T,? extends K> keyMapper,
				      Function<? super T,? extends U> valueMapper,
				      BinaryOperator<U> mergeFunction,
				      Supplier<M> mapSupplier)
			
//			따라서 기본 구현 (HashMap)을 ConcurrentHashMap으로 변경할 수 있습니다. 예를 들면 다음과 같습니다.
			Map<Integer, List<Integer>> map =
		    Stream.of(1, 2, 3, 4, 5, 6)
		        .collect(toMap(
		                   i -> i % 2,
		                   i -> new ArrayList<Integer>(Arrays.asList(i)),
		                   (list1, list2) -> {
		                       list1.addAll(list2);
		                       return list1;
		                   },
		                   ConcurrentHashMap::new
		                 )
		        );
			
			
//			계산 방법에 대해서는 사용하기 쉽습니다. counting ()을 제외하고는 함수를 사용하여 작업을 적용 할 값을 생성하거나
//			(maxBy 및 minBy의 경우) 결과를 생성하기 위해 비교기를 사용합니다.
			double avg = Stream.of(1, 2, 3)
	                .collect(averagingInt(i -> i * 2)); // 4.0

			long count = Stream.of(1, 2, 3)
			                .collect(counting()); // 3
		
			Stream.of(1, 2, 3)
			    .collect(maxBy(Comparator.naturalOrder()))
			    .ifPresent(System.out::println); // 3
		
			Integer sum = Stream.of(1, 2, 3)
			    .collect(summingInt(i -> i)); // 6
			
			
			
			
			
			
			
			
			
			
	}

}
