package examp01;

public class collectEx1 {

	public static void main(String[] args) {
//		collect()  =  수집
//		이 방법에는 두 가지 버전이 있습니다.
		<R,A> R collect(Collector<? super T,A,R> collector)

		<R> R collect(Supplier<R> supplier,
		              BiConsumer<R,? super T> accumulator,
		              BiConsumer<R,R> combiner)
//		첫 번째 버전은 Collectors 클래스의 미리 정의 된 collect를 사용하는 반면 두 번째 버전에서는 고유 한 collect를 만들 수 있습니다. 
//		원시 스트림 (예 : IntStream)에는이 마지막 버전의 collect () 만 있습니다.

//		collect ()는 스트림의 요소에 대해 변경 가능한 감소를 수행합니다. 
//		즉, Collection 또는 StringBuilder와 같이 누적을 위해 변경 가능한 객체를 사용합니다. 반대로 reduce ()는 두 요소를 결합하여 새로운 요소를 생성하고 변경 불가능한 감소를 나타냅니다.

//		그러나 세 개의 인수를 사용하는 reduce () 버전과 유사하므로 세 개의 인수를 사용하는 버전부터 시작하겠습니다.

//		서명에서 알 수 있듯이 먼저 컨테이너 (누산기)로 사용될 객체를 반환하고 마지막에 반환되는 Supplier를 가져옵니다.

//		두 번째 매개 변수는 추가 할 container와 요소를 사용하는 누산기 함수입니다.

//		세 번째 매개 변수는 중간 결과를 최종 결과로 병합하는 결합기 함수입니다 (병렬 스트림으로 작업 할 때 유용함).
		
//		이 버전 collect()은 다음과 동일합니다.
		R result = supplier.get();
		for (T element : stream) {
		    accumulator.accept(result, element);
		} 
		return result;
		
		
		
//		예를 들어 스트림의 모든 요소를으로 "reduce"하거나 "collect"하려면 다음 List과 같이 할 수 있습니다.

		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(
		           () -> new ArrayList<>(),// container 만들기
		           (l, i) -> l.add(i), // Adding an element
		           (l1, l2) -> l1.addAll(l2) // 요소 결합
		        );
		
//		인수 유형을 추가하여 더 명확하게 만들 수 있습니다.
		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(
		           () -> new ArrayList<>(),
		           (List<Integer> l, Integer i) -> l.add(i),
		           (List<Integer> l1, List<Integer> l2) -> l1.addAll(l2)
		        );

//		또는 메서드 참조를 사용할 수도 있습니다.
		List<Integer> list =
		    Stream.of(1, 2, 3, 4, 5)
		        .collect(
		           ArrayList::new,
		           ArrayList::add,
		           ArrayList::addAll
		        );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
