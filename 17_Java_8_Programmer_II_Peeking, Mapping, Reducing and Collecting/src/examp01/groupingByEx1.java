package examp01;

public class groupingByEx1 {

	public static void main(String[] args) {
//		groupingBy()
//		Collectors 클래스는 SQL GROUP BY 스타일의 일종으로 스트림의 요소를 목록으로 그룹화하는 두 가지 함수를 제공합니다.
//		첫 번째 방법은 groupingBy ()이며 세 가지 버전이 있습니다. 이것이 첫 번째입니다.
//		groupingBy(Function<? super T,? extends K> classifier)
//		T 유형의 요소를 분류하고 목록으로 그룹화 한 후 키 (유형 K)가 함수 반환 값인 맵에 결과를 반환하는 함수를 사용합니다.
//		예를 들어, 숫자가 속한 범위 (10, 20 등)별로 숫자 스트림을 그룹화하려면 다음과 같이 할 수 있습니다.
		Map<Integer, List<Integer>> map =
				   Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
				      .collect( groupingBy (i -> i/10 * 10 ) );
//		이 코드를 기존 방식 (for 루프 사용)과 비교하는 순간 스트림의 힘을 깨닫게됩니다.
		List<Integer> stream =
			    Arrays.asList(2,34,54,23,33,20,59,11,19,37);
			Map<Integer, List<Integer>> map = new HashMap<>();  //해쉬는 정렬안하고 null허용

			for(Integer i : stream) {
			    int key = i/10 * 10;
			    List<Integer> list = map.get(key);

			    if(list == null) {
			        list = new ArrayList<>();
			        map.put(key, list);
			    }
			    list.add(i);
			}
//		결과
		{0=[2], 50=[54,59], 20=[23,20], 10=[11,19], 30=[34,33,37]}	
			
		
//		두 번째 버전은 downstream collector를 additional 인수로 사용합니다. 
		groupingBy(Function<? super T,? extends K> classifier,
		           Collector<? super T,A,D> downstream)
		
		
//		downstream collector는 다른 collector의 결과에 적용되는 collector입니다.
//		예를 들어, 여기에서 모든 collector를 사용하여 이전 예제의 각 그룹에있는 요소를 계산할 수 있습니다.
		Map<Integer, Long> map =
	    Stream.of(2, 34, 54, 23, 33, 20, 59, 11, 19, 37)
	        .collect(
	            groupingBy(i -> i/10 * 10,
	                       counting()
	            )
	        );
//		(Map의 값 유형이 다운 스트림 수집기 counting ()에서 반환 된 유형을 반영하도록 어떻게 변경되는지 확인하십시오.)
//		출력 :
		{0=1, 50=2, 20=2, 10=2, 30=3}
		
		
//		다른 groupingBy ()를 사용하여 두 번째 수준의 요소를 분류 할 수도 있습니다. 예를 들어 세는 대신 요소를 짝수 또는 홀수로 추가로 분류 할 수 있습니다.
		Map<Integer, Map<String, List<Integer>>> map =
				   Stream.of(2,34,54,23,33,20,59,11,19,37)
				       .collect(groupingBy(i -> i/10 * 10,
				                  groupingBy(i ->
				                               i%2 == 0 ? "EVEN" : "ODD")
				                )
				       );
		
		//출력 :
		{
		    0 = {EVEN=[2]},
		   50 = {EVEN=[54], ODD=[59]},
		   20 = {EVEN=[20], ODD=[23]},
		   10 = {ODD=[11, 19]},
		   30 = {EVEN=[34], ODD=[33, 37]}
		}
//		첫 번째 groupingBy ()가 Integer를 반환하기 때문에 상위 수준 맵의 키는 Integer입니다.
//
//		상위 레벨 맵의 값 유형이 다운 스트림 수집기 groupingBy ()에서 반환 된 유형을 반영하도록 (again) 변경되었습니다.
//
//		이 경우 문자열이 반환되므로 이것이 두 번째 수준 맵의 키 유형이되고 정수 스트림으로 작업하기 때문에 값의 유형은 List <Integer>입니다.
//
//		이 예제의 출력을 보면 궁금 할 것입니다. 결과를 정렬하는 방법이 있습니까?
//
//		음, TreeMap은 주문 된 Map의 유일한 구현입니다. 다행히도 groupingBy ()의 세 번째 버전은 결과 맵의 유형을 선택할 수있는 Supplier 인수를 추가합니다.	
		groupingBy(Function<? super T,? extends K> classifier,
		           Supplier<M> mapFactory,
		           Collector<? super T,A,D> downstream)
		
//		이렇게하면 다음 인스턴스를 전달합니다 TreeMap
		Map<Integer, Map<String, List<Integer>>> map =
	    Stream.of(2,34,54,23,33,20,59,11,19,37)
	       .collect( groupingBy(i -> i/10 * 10,
	                 TreeMap::new,
	                 groupingBy(i -> i%2 == 0 ? "EVEN" : "ODD")
	               )
	       );
//		출력
		{
		    0 = {EVEN=[2]},
		   10 = {ODD=[11, 19]},
		   20 = {EVEN=[20], ODD=[23]},
		   30 = {EVEN=[34], ODD=[33, 37]},
		   50 = {EVEN=[54], ODD=[59]}
		}
		
		
		
		
		
	}

}
