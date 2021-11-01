package examp01;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelEx {

	public static void main(String[] args) {
//		What is a Parallel Stream?
		
//		지금까지이 섹션의 모든 예에서는 각 요소가 하나씩 처리되는 순차 스트림을 사용했습니다.
//		반대로 병렬 스트림은 스트림을 여러 부분으로 분할합니다. 각 부품은 다른 스레드에서 동시에 (병렬로) 처리됩니다.
//		내부적으로 병렬 스트림은 Fork / Join Framework 
//		즉, 기본적으로 병렬 스트림을 처리하는 데 사용할 수있는 스레드 수는 컴퓨터 프로세서의 사용 가능한 코어 수와 같습니다.
//		Fork / Join 프레임 워크에 비해 병렬 스트림을 사용하는 이점은 사용하기가 더 쉽다는 것입니다.
//		병렬 스트림을 만들려면 parallel () 메서드를 사용하십시오.
		Stream<String> parallelStream =
                Stream.of("a","b","c").parallel();
//		Collection에서 병렬 스트림을 생성하려면 parallelStream () 메서드를 사용하십시오.
		List<String> list = Arrays.asList("a","b","c");
		Stream<String> parStream = list.parallelStream();
		
		
		
//		How Parallel Streams work?
		
//		Let's start with the simplest example:
		Stream.of("a","b","c","d","e")
	    .forEach(System.out::print);
//		순차 스트림으로 요소 목록을 인쇄하면 예상 결과가 출력됩니다. --> abcde
		
		System.out.println();
		
//		However, when using a parallel stream:
		Stream.of("a","b","c","d","e")
	    .parallel()
	    .forEach(System.out::print);
//		병렬 스트림은 실행 할 때마다 결과 값이 다르다.
		
		System.out.println();
		
//		그 이유는 부분에서 스트림을 분해하고 이전에 논의한 여러 스레드에서 처리하기 때문입니다.
//		따라서 병렬 스트림은 처리 순서가 중요하지 않고 상태를 유지할 필요가없는 작업에 더 적합합니다 (상태 비 저장이고 독립적입니다).
//		이 차이점을 확인하는 예는 findFirst () 대 findAny () 사용입니다.
//		이전 장에서 findFirst () 메서드가 스트림의 첫 번째 요소를 반환한다고 언급했습니다. 
//		그러나 병렬 스트림을 사용하고 이것이 여러 부분으로 분해 될 때이 메서드는 어떤 요소가 첫 번째 요소인지 "알아야"합니다.
		long start = System.nanoTime();
		String first = Stream.of("a","b","c","d","e")
		    .parallel().findFirst().get();
		double duration = (System.nanoTime() - start) / 1000000;
		System.out.println(
		    first + " found in " + duration + " milliseconds");
//		The output:
//			c found in 0.063169 milliseconds
//		병렬 스트림이 처리됨에 따라 병렬 스트림이 순차 스트림보다 빠르게 처리 될 것이라고 믿는 것이 합리적입니다. 그러나 findFirst ()에서 볼 수 있듯이 항상 그런 것은 아닙니다.
		
		System.out.println();
//		다음과 같은 상태 저장 작업 :
//			Stream<T> distinct()
//			Stream<T> sorted()
//			Stream<T> sorted(Comparator<? super T> comparator)
//			Stream<T> limit(long maxSize)
//			Stream<T> skip(long n)
//		이전에 처리 된 요소의 상태를 통합하고 결과를 생성하기 위해 전체 스트림을 거쳐야 할 수 있으므로 병렬 스트림에 적합하지 않습니다.
//		그런데 sequential () 메서드를 사용하여 병렬 스트림을 순차적 스트림으로 바꿀 수 있습니다.
		
//		stream
//		   .parallel()
//		      .filter(..)
//		         .sequential()
//		            .forEach(...);
//		스트림이 isParallel ()과 병렬인지 확인합니다.
//		stream.parallel().isParallel(); // true
		
//		그리고 순서가 지정된 스트림을 순서가 지정되지 않은 스트림으로 바꾸거나 순서가 지정되지 않았는지 확인하십시오.
//		stream
//		   .parallel()
//		      .unordered()
//		         .collect(...);
//		그러나 먼저 상태 저장 작업을 실행 한 다음 스트림을 병렬 작업으로 전환하면 모든 경우에 성능이 향상되거나 다음 예제와 같이 전체 작업이 병렬로 실행될 수 있다고 믿지 마십시오.
		double start2 = System.nanoTime();
		Stream.of("b","d","a","c","e")
		    .sorted()
		    .filter(s -> {
		        System.out.println("Filter:" + s);
		        return !"d".equals(s);
		    })
//		    .parallel()
		    .map(s -> {
		        System.out.println("Map:" + s);
		        return s += s;
		    })
		    .forEach(System.out::println);
		double duration2 = (System.nanoTime() - start2) / 1_000_000;
		System.out.println(duration2 + " milliseconds");
//		스트림이 순차적으로 정렬되고 필터링되었다고 생각할 수 있지만 출력에는 다른 내용이 표시됩니다.
//		Filter:c
//		Map:c
//		cc
//		Filter:a
//		Map:a
//		aa
//		Filter:b
//		Map:b
//		bb
//		Filter:d
//		Filter:e
//		Map:e
//		ee
//		79.470779 milliseconds
		
//		이것을 순차 버전의 출력과 비교하십시오 (parallel () 주석 만) :
//		Filter:a
//		Map:a
//		aa
//		Filter:b
//		Map:b
//		bb
//		Filter:c
//		Map:c
//		cc
//		Filter:d
//		Filter:e
//		Map:e
//		ee
//		1.554562 milliseconds
		
//		이 경우 순차 버전이 더 잘 수행되었습니다.
//		그러나 순서가 중요하지 않은 독립 또는 상태 비 저장 작업이있는 경우 큰 범위에서 홀수 수를 세는 경우 병렬 버전이 더 잘 수행됩니다.
		
		System.out.println();		
		double start3 = System.nanoTime();
		long c = IntStream.rangeClosed(0, 1_000_000_000)
		            .parallel()
		            .filter(i -> i % 2 == 0)
		            .count();
		double duration3 = (System.nanoTime() - start3) / 1_000_000;
		System.out.println("Got " + c + " in " + duration3 + " milliseconds");

//		The parallel version output:  //병렬 버전
//		Got 500000001 in 738.678448 milliseconds
//
//		The sequential version output:  // 순차버전
//		Got 500000001 in 1275.271882 milliseconds
		
		
		
//		요약하면 병렬 스트림이 항상 순차 스트림보다 성능이 좋은 것은 아닙니다.
//
//		이것은 병렬 스트림이 결과를 독립적으로 처리하고 순서를 보장 할 수 없다는 사실이 알아야 할 가장 중요한 사항입니다.
//
//		그러나 실제로 성능 향상을 위해 순차 또는 병렬 스트림을 사용할시기를 어떻게 알 수 있습니까?
//
//		다음은 몇 가지 규칙입니다.
//
//		작은 데이터 집합의 경우 병렬 처리의 오버 헤드로 인해 순차 스트림이 거의 항상 최선의 선택입니다.
//		병렬 스트림을 사용할 때는 상태 저장 (예 : sorted ()) 및 순서 기반 (예 : findFirst ()) 작업을 피하십시오.
//		계산 비용이 많이 드는 작업 (파이프 라인의 모든 작업 고려)은 일반적으로 병렬 스트림을 사용하여 더 나은 성능을 제공합니다.
//		확실하지 않은 경우 적절한 벤치 마크로 성능을 확인하십시오.
		
		
		
	}

}
