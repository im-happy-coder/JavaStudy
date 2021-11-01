package examp01;

public class CollectorsEx1 {

	public static void main(String[] args) {
//		Collectors = 수집가 
//		Collectors의 이전 버전 collect()은 Collectors의 작동 방식을 배우는 데 유용하지만 실제로는 다른 버전을 사용하는 것이 좋습니다.

//		Collectors클래스 의 일반적인 수집가는 다음과 같습니다.
		
//		방법			|					collect ()에서 반환 된 값 				|기술
		toList								List							요소를 List.
		toSet								Set								요소를 Set.
		toCollection						Collection						Collection구현에 요소를 축적합니다 .
		toMap								Map								요소를 Map.
		joining								String							요소를 String.
		groupingBy							Map<K, List<T>>					T분류 기능에 따라 목록 의 유형 요소를 유형 키가있는 맵으로 그룹화 합니다 K.
		partitioningBy						Map<Boolean, List<T>>			T술어에 따라 목록에 있는 유형의 요소를 맵으로 분할합니다.
		
//		계산 방법은 reduce로 구현할 수 있으므로 Collectors클래스는이를 Collectors로도 제공합니다.

방법					|				collect ()에서 반환 된 값					|기술
averagingInt
averagingLong								Double							입력 요소의 평균을 반환합니다.
averagingDouble
	
counting									Long							입력 요소의 요소를 계산합니다.

maxBy										Optional<T>						주어진에 따라 최대 요소를 반환합니다 Comparator.
minBy										Optional<T>						주어진에 따라 최소 요소를 반환합니다 Comparator.

summingInt									Integer	
summingLong									Long							입력 요소의 합계를 반환합니다.				
summingDouble								Double

		
		
		
		
	}

}
