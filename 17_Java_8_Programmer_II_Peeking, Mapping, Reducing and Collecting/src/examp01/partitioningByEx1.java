package examp01;

public class partitioningByEx1 {

	public static void main(String[] args) {
//		partitioningBy()
//		두 번째 그룹화 방법은 partitioningBy ()입니다.
//		groupingBy ()와의 차이점은 partitioningBy ()는 키 유형으로 부울이 포함 된 Map을 반환한다는 것입니다. 
//		즉, true에 대해 하나와 false에 대해 하나의 두 그룹 만 있음을 의미합니다.
//		이 방법에는 두 가지 버전이 있습니다. 첫 번째는 다음과 같습니다.
		partitioningBy(Predicate<? super T> predicate)
		
//		조건 자에 따라 요소를 분할하고이를 Map <Boolean, List <T >>로 구성합니다.
//		예를 들어 숫자 스트림을 50 미만인 숫자와 그렇지 않은 숫자로 분할하려면 다음과 같이 할 수 있습니다.
		Map<Boolean, List<Integer>> map =
	    Stream.of(45, 9, 65, 77, 12, 89, 31)
	        .collect(partitioningBy(i -> i < 50));
//		출력
		{false=[65, 77, 89], true=[45, 9, 12, 31, 12]}
		
//		보시다시피 Predicate 때문에 맵에는 항상 두 개의 요소가 있습니다.
//		groupingBy ()와 마찬가지로이 메서드에는 다운 스트림 수집기를 사용하는 두 번째 버전이 있습니다.
//		예를 들어, 중복을 제거하려면 다음과 같이 요소를 집합으로 수집하면됩니다.
		Map<Boolean, Set<Integer>> map =
			    Stream.of(45, 9, 65, 77, 12, 89, 31, 12)
			        .collect(
			            partitioningBy(i -> i < 50,
			                           toSet()
			            )
			        );
//		출력:
		{false=[65, 89, 77], true=[9, 12, 45, 31]}   //12가 중복되지 않음
		
		
//		그러나 groupingBy ()와 달리 반환되는 Map의 유형을 변경할 수있는 버전은 없습니다. 하지만 중요하지 않습니다. 사용할 수있는 키는 두 개뿐입니다.
		Set<Integer> lessThan50 = map.get(true);
		Set<Integer> moreThan50 = map.get(false);
		
	}

}
