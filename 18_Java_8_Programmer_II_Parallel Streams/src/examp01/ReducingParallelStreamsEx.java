package examp01;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReducingParallelStreamsEx {

	public static void main(String[] args) {
//		Reducing Parallel Streams = 병렬 스트림 줄이기
//		동시 환경에서는 할당이 잘못되었습니다.
//		변수의 상태를 변경하면 (특히 둘 이상의 스레드가 공유하는 경우) 잘못된 상태를 방지하기 위해 많은 문제가 발생할 수 있기 때문입니다.
//		매우 특별한 방식으로 계승 10을 구현하는 다음 예를 고려하십시오.
//		class Total {
//		    public long total = 1;
//		    public void multiply(long n) { total *= n; }
//		}
//		...
//		Total t = new Total();
//		LongStream.rangeClosed(1, 10)
//		    .forEach(t::multiply);
//		System.out.println(t.total);
//		여기서는 팩토리얼의 결과를 수집하기 위해 변수를 사용하고 있습니다. 이 코드 조각을 실행 한 결과는 다음과 같습니다. -> 3628800
//		그러나 스트림을 병렬로 전환하면 :
//		LongStream.rangeClosed(1, 10)
//	    .parallel()
//	    .forEach(t::multiply);
		
//		때때로 우리는 올바른 결과를 얻고 다른 경우에는 그렇지 않습니다.
//
//		이 문제는 여러 스레드가 변수 total에 동시에 액세스하기 때문에 발생합니다. 
//		예,이 변수에 대한 액세스를 동기화 할 수 있지만 (이후 장에서 살펴 보 겠지만) 이러한 종류는 병렬 처리의 목적을 무효화합니다 (동시 환경에서는 할당이 나쁘다고 말했습니다).
//
//		reduce ()가 편리한 곳입니다.
//
//		이전 장에서 기억한다면 reduce ()는 스트림의 요소를 단일 요소로 결합합니다.
//
//		병렬 스트림을 사용하는 경우이 방법은 중간 값을 생성 한 다음 결합하여 "순서 지정"문제를 피하면서 공유 언급을 제거하여 스트림이 병렬로 처리되도록 허용하고 감소 프로세스 내에 유지합니다.
//
//		유일한 요구 사항은 적용된 감소 작업이 연관되어야한다는 것입니다.
//
//		이는 연산 작업이 다음과 같은 동등성을 따라야 함을 의미합니다.
//		(a op b) op c == a op (b op c)
//		Or:
//		a op b op c op d == (a op b) op (c op d)
//		따라서 우리는 (a op b)와 (c op d)를 병렬로 평가할 수 있습니다.
//		예제로 돌아가서 parallel () 및 reduce ()를 사용하여 다음과 같이 구현할 수 있습니다.
//		long tot = LongStream.rangeClosed(1, 10)
//                .parallel()
//                .reduce(1, (a,b) -> a*b);
//				   System.out.println(tot);
//		이 코드 조각을 실행하면 매번 올바른 결과가 생성됩니다 (3628800).
//		첫 번째 스 니펫 (47.216181 밀리 초)과 마지막 스 니펫 (3.094717 밀리 초)의 실행 시간을 측정하면 성능이 크게 향상되는 것을 볼 수 있습니다. 
//		물론 이러한 값 (및이 장에 제시된 다른 값)은 기계의 성능에 따라 다르지만 유사한 결과를 얻을 수 있습니다.
//		또한 순서를 유지하면서 문자열을 병렬로 처리하기 위해이 장의 시작 부분에 제시된 예제에 축소를 적용 할 수도 있습니다.
//		String s = Stream.of("a","b","c","d","e")
//	             .parallel()
//	             .reduce("", (s1, s2) -> s1 + s2);
//			System.out.println(s);
//			출력 --> abcde
		
//		이는 간단한 예이지만 축소는 때때로 제대로하기 어렵 기 때문에 공유 된 변경 가능 상태를 피하고 상태 비 저장 및 독립 작업을 사용하여 병렬 스트림이 최상의 결과를 생성하도록하는 것이 가장 좋습니다.
//		예를 들어, 지난 장에서이 예를 기억하십니까?
		int total = IntStream.of(1, 2, 3, 4, 5, 6)
	             .reduce( 4, (sum, n) -> sum + n );
//		이 예에서 첫 번째 매개 변수는 4 + n이 n과 같지 않기 때문에 실제로 동일하지 않습니다.
//		스트림을 병렬로 만들 때 예상 결과 (25)를 얻는 대신 45를 얻었습니다.
		int total2 = IntStream.of(1, 2, 3, 4, 5, 6)
	             .parallel()
	             .reduce( 4, (sum, n) -> sum + n );
//		왜?
//		스트림이 부분으로 나뉘고 누산기 기능이 각 부분에 독립적으로 적용되기 때문에 첫 번째 요소뿐만 아니라 각 부분의 첫 번째 요소에도 4가 추가됩니다.

//				또한 지난 장에서 살펴본 것처럼 세 개의 인수를 사용하는 reduce () 버전은 특히 병렬 스트림에서 유용합니다.
//				예를 들어, 일부 문자열의 길이를 합산하여 평행하게 만드는 마지막 장의 예를 살펴보면 :
		int length = Stream.of("Parallel", "streams", "are", "great")
	               .parallel()
	               .reduce(0,
	                  (accumInt, str) ->
	                     accumInt + str.length(), //accumulator(누산)
	                  (accumInt1, accumInt2) ->
	                     accumInt1 + accumInt2); //combiner(결합)
//		결과가 어떻게되는지 볼 수 있습니다 (23).
//		1. 누산기 기능은 특별한 순서없이 각 요소에 적용됩니다. 예를 들면 :
//		0 + 5 // great
//		0 + 3 // are
//		0 + 8 // Parallel
//		0 + 7 // streams
//		2. 누산기 함수의 결과가 결합됩니다.
//		5 + 3 // 8
//		8 + 7 // 15
//		8 + 15 // 23
//		T 유형의 요소에서 U 유형의 감소 된 값을 반환하고 병렬 스트림에서 요소가 유형 U의 N 중간 결과로 나뉘어 질 때 유형 U의 값을 결합하는 방법을 아는 함수를 갖는 것이 합리적입니다. 단일 결과로.
//		따라서 다른 유형을 사용하지 않는 경우 누산기 함수는 결합기 함수와 동일합니다.
//		마지막으로 reduce ()와 마찬가지로, 예를 들어 부분적으로 누적 된 결과에 대해 동일한 연관성 및 ID 요구 사항을 따르는 경우 병렬 스트림과 함께 collect ()를 안전하게 사용할 수 있습니다.
//		이를 빈 결과 컨테이너와 결합하면 동등한 값이 생성되어야합니다. 결과.
//		또는 Collectors 클래스로 그룹화하고 순서가 중요하지 않은 경우 groupingBy ()의 동시 버전 인 groupingByConcurrent () 메서드를 사용할 수 있습니다.
		
	}

}
