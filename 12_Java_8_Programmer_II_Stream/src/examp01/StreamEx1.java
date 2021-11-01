package examp01;

import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
//		간단한 예
//		학생 목록이 있고 점수가 90.0이상인 학생을 추출하고 점수 별로 오름차순으로 정렬하는 것이 요구 사항이라고 가정합니다 .
//		이를 수행하는 한 가지 방법은 다음과 같습니다.
//		List<Student> studentsScore = new ArrayList<Student>();
//		for(Student s : students) {
//		    if(s.getScore() >= 90.0) {
//		        studentsScore.add(s);
//		    }
//		}
//		Collections.sort(studentsScore, new Comparator<Student>() {
//		    public int compare(Student s1, Student s2) {
//		        return Double.compare(
//		           s1.getScore(), s2.getScore());
//		    }
//		});
//
//		스트림을 사용하는 Java 8 구현과 비교할 때 매우 장황합니다.
//		List<Student> studentsScore = students
//		        .stream()
//		        .filter(s -> s.getScore() >= 90.0)
//		        .sorted(Comparator.comparing(Student::getScore))
//		        .collect(Collectors.toList());
		
		
		int[] nums = {1, 2, 3, 4, 5};
		System.out.println(Stream.of(nums).count()); // It prints 1!
//		값이 1이 나오는 이유는
//		int는 객체가 아니기 때문에 스트림을 생성하기 위해 선택한 메서드 Stream.of(T t)는
//		 스트림 int[]이 생성되지만 배열이 하나만 전달되므로 결과는 한 요소의 스트림.
		// returns a stream of one element
//		static <T> Stream<T> of(T t)
		// returns a stream whose elements are the specified values
//		static <T> Stream<T> of(T... values)
		
		
//		해결법
		Integer[] nums = {1, 2, 3, 4, 5};
		// It prints 5!
		System.out.println(Stream.of(nums).count());
		
		
		int[] nums = {1, 2, 3, 4, 5};
		// It also prints 5!
		System.out.println(Arrays.stream(nums).count());
		
		
		int[] nums = {1, 2, 3, 4, 5};
		// It also prints 5!
		System.out.println(IntStream.of(nums).count());.

//		교훈 : Stream<T>.of()는 프리미티브(기본형타입) 작업시 사용하지 마십시오 .
		
//		다음은 스트림을 생성하는 다른 방법입니다.
//		static <T> Stream<T> generate(Supplier<T> s)
//		Stream<T> limit(long maxSize) = 최대길이 제한
//		예를 들면 :

			Stream<Double> s = Stream.generate(new Supplier<Double>() {
			    public Double get() {
			        return Math.random();
			    }
			}).limit(5);
//		또는:
			Stream<Double> s = Stream.generate(() -> Math.random()).limit(5);

//			아니면 그냥 :
			Stream<Double> s = Stream.generate(Math::random).limit(5);
			
			
			
//			요소를 생성하는 1, 2, 4, 8, 16.
			Stream<Integer> s = Stream.iterate(1, new UnaryOperator<Integer>() {
			    @Override
			    public Integer apply(Integer t) {
			        return t * 2; }
			}).limit(5);

//			아니면 그냥 :
			Stream<Integer> s = Stream.iterate(1, t -> t * 2).limit(5);
			
			
			
			
			
			
			
//			Stream.Builder<T>빌드중인 스트림에 요소를 추가하는 메소드가 있는 클래스 (빌더 디자인 패턴을 따르는)가 있습니다.
			void accept(T t)
			default Stream.Builder<T> add(T t)

//			예를 들면 :
			Stream.Builder<String> builder = Stream.<String>builder().add("h").add("e").add("l").add("l");
			builder.accept("o");
			Stream<String> s = builder.build();

//			IntStream및 LongStream방법을 정의합니다 :
			static IntStream range(int startInclusive, int endExclusive)
			static IntStream rangeClosed(int startInclusive, int endInclusive)
			static LongStream range(long startInclusive, long endExclusive)
			static LongStream rangeClosed(long startInclusive, long endInclusive)
			// stream of 1, 2, 3
			IntStream s = IntStream.range(1, 4);
			// stream of 1, 2, 3, 4
			IntStream s = IntStream.rangeClosed(1, 4);
			
//			또한 Java API에는 스트림을 생성하는 새로운 메소드가 있습니다. 예를 들면 :
				IntStream s1 = new Random().ints(5, 1, 10);
//				1 (포함)에서 10까지 5개의 임의 int의  intStream을 반환합니다 .
				
				
//				다음 표에는 Stream중간 작업을 나타내는 인터페이스 의 메서드가 요약되어 있습니다.
방법						유형							기술
Stream<T> distinct()	상태 저장			고유 한 요소로 구성된 스트림을 반환합니다.(중복제거)

Stream<T> filter(Predicate<? super T> predicate)	무상태	주어진 조건 자와 일치하는 요소의 스트림을 반환합니다.

<R> Stream<R> flatMap(Function<? super T,? extends Stream<? extends R>> mapper)	무상태	
제공된 매핑 기능을 각 요소에 적용하여 생성 된 콘텐츠로 스트림을 반환합니다. 에 대한 버전이 있습니다 int, long그리고 double

Stream<T> limit(long maxSize)	상태 저장	maxSize길이 가 더 길지 않도록 잘린 스트림을 반환합니다 .

<R> Stream<R> map(Function<? super T,? extends R> mapper)	무상태	지정된 함수를이 스트림의 요소에 적용한 결과로 구성된 스트림을 리턴합니다. 
에 대한 버전이 있습니다 int, long그리고 double또한이.

Stream<T> peek(Consumer<? super T> action)	무상태	이 스트림의 요소가있는 스트림을 반환하여 각 요소에 대해 제공된 작업을 수행합니다.

Stream<T> skip(long n)	상태 저장	처음 n 개의 요소를 제거한 후이 스트림의 나머지 요소가있는 스트림을 리턴합니다.

Stream<T> sorted()	상태 저장	요소의 자연 순서에 따라 정렬 된 스트림을 반환합니다.

Stream<T> sorted(Comparator<? super T> comparator)	상태 저장	제공된에 따라 정렬 된 스트림을 반환합니다 Comparator.

Stream<T> parallel()	N / A	병렬 인 동등한 스트림을 반환합니다.
Stream<T> sequential()	N / A	순차적 인 해당 스트림을 반환합니다.
Stream<T> unordered()	N / A	순서가 지정되지 않은 동등한 스트림을 반환합니다.


//에러
int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
IntStream s = IntStream.of(digits);
long n = s.count();
System.out.println(s.findFirst()); // An exception is thrown


//정답
int[] digits = {0, 1, 2, 3, 4 , 5, 6, 7, 8, 9};
long n = IntStream.of(digits).count();
System.out.println(IntStream.of(digits).findFirst()); // OK
//결과: 0


								//다음 표에는 Stream마지막 작업을 나타내는 인터페이스 의 메서드가 요약되어 있습니다.
방법																		기술
boolean allMatch(Predicate<? super T> predicate)	이 스트림의 모든 요소가 제공된 술어와 일치하는지 여부를 리턴합니다.
													스트림이 비어 있으면 true반환되고 술어는 평가되지 않습니다.
													
													
boolean anyMatch(Predicate<? super T> predicate)	이 스트림의 요소가 제공된 술어와 일치하는지 여부를 리턴합니다.
													스트림이 비어 있으면 false반환되고 술어는 평가되지 않습니다.
													
													
boolean noneMatch(Predicate<? super T> predicate)	이 스트림의 요소가 제공된 술어와 일치하지 않는지 여부를 리턴합니다.
													스트림이 비어 있으면 true반환되고 술어는 평가되지 않습니다.
													
Optional<T> findAny()								Optional스트림의 일부 요소를 설명하는 반환 합니다.

Optional<T> findFirst()								Optional이 스트림의 첫 번째 요소를 설명하는를 리턴 합니다.

<R,A> R collect(Collector<? super T,A,R> collector)	를 사용하여이 스트림의 요소에 대해 가변 감소 작업을 수행합니다 Collector.

long count()	이 스트림의 요소 수를 리턴합니다.

void forEach(Consumer<? super T> action)			이 스트림의 각 요소에 대해 작업을 수행합니다.

void forEachOrdered(Consumer<? super T> action)		스트림에 정의 된 발생 순서가있는 경우 스트림의 발생 순서로이 스트림의 각 요소에 대한 작업을 수행합니다.

Optional<T> max(Comparator<? super T> comparator)	제공된에 따라이 스트림의 최대 요소를 반환합니다 Comparator.

Optional<T> min(Comparator<? super T> comparator)	제공된에 따라이 스트림의 최소 요소를 반환합니다 Comparator.

T reduce(T identity, BinaryOperator<T> accumulator)	제공된 ID 값과 연관 누적 함수를 사용하여이 스트림의 요소를 축소하고 축소 된 값을 반환합니다.

Object[] toArray()	이 스트림의 요소를 포함하는 배열을 리턴합니다.

<A> A[] toArray(IntFunction<A[]> generator)	제공된 생성기 함수를 사용하여 반환 된 배열을 할당하여이 스트림의 요소를 포함하는 배열을 반환합니다.

Iterator<T> iterator()	스트림의 요소에 대한 반복기를 반환합니다.

Spliterator<T> spliterator()	스트림의 요소에 대한 분할자를 반환합니다.




이 스트림 파이프 라인을 예로 들어 보겠습니다.

Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
    .map(str -> str.length())
    .filter(i -> i > 3)
    .limit(2)
    .forEach(System.out::println);

그 기능은 다음과 같습니다.

문자열 스트림을 생성합니다.
그런 다음 스트림을 ints 의 스트림으로 변환합니다 (각 문자열의 길이를 나타냄).
그런 다음 3보다 큰 길이를 필터링합니다.
그런 다음 스트림의 처음 두 요소를 잡고
마지막으로이 두 요소를 인쇄합니다.

//위 요소를 자세하게 만든것
Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
.map(str -> {
    System.out.println("Mapping: " + str);
    return str.length();
})
.filter(i -> {
    System.out.println("Filtering: " + i);
    return i > 3;
})
.limit(2)
.forEach(System.out::println);

// 출력
Mapping: sun
Filtering: 3
Mapping: pool
Filtering: 4
4
Mapping: beach
Filtering: 5
5

.limit(2)는 최대 사이즈를 제한한다, 그래서 filter에서 문자길이가 3이상인 pool과 beach만 해당되므로 4와 5만 출력된다.


// 마지막연산
boolean anyMatch(Predicate<? super T> predicate)
boolean allMatch(Predicate<? super T> predicate)
boolean noneMatch(Predicate<? super T> predicate)
Optional<T> findFirst()
Optional<T> findAny()
//(일치하는 요소를 찾는 즉시 스트림 처리를 계속할 필요가 없기 때문에)

//다음은 스트림의 특성입니다.
스트림은 람다와 완벽하게 작동합니다.
스트림은 요소를 저장하지 않습니다.
스트림은 변경할 수 없습니다.
스트림은 재사용 할 수 없습니다.
스트림은 요소에 대한 인덱싱 된 액세스를 지원하지 않습니다.
스트림은 쉽게 병렬화 할 수 있습니다.
스트림 작업은 가능한 경우 지연됩니다.



스트림을 만드는 방법에는 여러 가지가 있습니다. 가장 인기있는 것은 다음과 같습니다.
//From an existing collection
List<String> words = Arrays.asList(new String[]{"hello", "hola", "hallo", "ciao"});
Stream<String> s1 = words.stream();

//From individual elements
Stream<String> s2 = Stream.of("hello", "hola", "hallo", "ciao");

//From an array
String[] words = {"hello", "hola", "hallo", "ciao"};
Stream<String> s3 = Stream.of(words);
//Stream<T>.of()프리미티브로 작업 할 때는 사용하지 마십시오 . 대신 Arrays.stream또는의 기본 버전을 사용하십시오 Stream.
int[] nums = {1, 2, 3, 4, 5};
IntStream s1 = Arrays.stream(nums);
IntStream s2 = IntStream.of(nums);
map또는 filter항상 새 스트림을 반환하는 중간 작업 은 상태 비 저장 및 상태 저장 작업 으로 나뉘며 지연됩니다. 즉, 터미널 작업이 호출 될 때까지 연기됩니다.
count또는 같은 터미널 작업은 forEach항상 스트림이 아닌 다른 것을 반환합니다.
단락 작업은 결과가 생성 될 때까지 중간 작업이 처리되도록합니다.
이러한 방식으로 지연 및 단락 작업으로 인해 스트림은 모든 요소에 대해 모든 작업을 실행하지 않지만 결과가 추론되거나 생성 될 때까지 스트림이 실행됩니다.
	}

}
