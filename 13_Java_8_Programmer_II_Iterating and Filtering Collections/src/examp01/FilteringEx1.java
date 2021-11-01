package examp01;

public class FilteringEx1 {

	public static void main(String[] args) {
//		Filtering
//		컬렉션에서 특정 조건과 일치하지 않는 요소를 필터링 (또는 제거)하는 것입니다.
		
//		일반적으로 일치하는 요소를 다른 컬렉션에 복사하여이 작업을 수행합니다.
//		List<String> words = ...
//		List<String> nonEmptyWords = new ArrayList<String>();
//		for(String w : words) {
//		    if(w != null && !w.isEmpty()) {
//		        nonEmptyWords.add(w);
//		    }
//		}

//		제거
//		또는 반복자를 사용하여 컬렉션 자체에서 일치하지 않는 요소를 제거합니다 (컬렉션이 제거를 지원하는 경우에만).
//		List<String> words = new ArrayList<String>();
//		// ... (add some strings)
//		for (Iterator<String> it = words.iterator(); it.hasNext();) {
//		    String w = it.next();
//		    if (w == null || w.isEmpty()) {
//		        it.remove();
//		    }
//		}
		
//		Java 8에는 Collection인터페이스 에 새로운 메소드가 있습니다.
//		default boolean removeIf(Predicate<? super E> filter) 주어진 술어를 충족하는 컬렉션의 모든 요소가 제거됩니다
//		이렇게하면 	람다 식이나 메서드 참조를 사용하여 코드가 더 간단 해집니다.
		// Using an anonymous class
		words.removeIf(new Predicate<String>() {
		    public boolean test(String t) {
		        return t == null || t.isEmpty();
		    }
		});
		// Using a lambda expression
		words.removeIf(t -> t == null || t.isEmpty());
		
		
		
//		복사		
//		일치하는 요소를 다른 컬렉션에 복사하는 경우 인터페이스 filter메서드가 Stream있습니다.
//		Stream<T> filter(Predicate<? super T> predicate)	주어진 조건자를 만족하는 요소로 구성된 새 스트림을 반환합니다.
		
//		이 메서드는 스트림을 반환하므로 중간 작업을 나타내며 기본적으로 원하는 수의 필터 또는 기타 중간 작업을 연결할 수 있습니다.
		List<String> words = Arrays.asList("hello", null, "");
		words.stream()
		    .filter(t -> t != null) // ["hello", ""]
		    .filter(t -> !t.isEmpty()) // ["hello"]
		    .forEach(System.out::println);
//		물론이 코드를 실행 한 결과는 다음과 같습니다.
		hello
		
//		명확성을 위해 메서드 참조를 사용하여 일부 클래스에서 메서드를 만들거나 기존 메서드를 사용할 수도 있습니다.
		class StringUtils {
		    public static boolean isNotNullOrEmpty(String s) {
		        return s != null && !s.isEmpty();
		    }
		}
		// ...
		List<String> words = Arrays.asList("hello", null, "");
		// Using an anonymous class
		words.stream()
		    .filter(new Predicate<String> () {
		        public boolean test(String t) {
		            return StringUtils.isNotNullOrEmpty(t);
		        }
		    })
		    .forEach(System.out::println);
		// Using a lambda expression
		words.stream()
		    .filter(t -> StringUtils.isNotNullOrEmpty(t))
		    .forEach(System.out::println);
		// Using a lambda expression
		words.stream()
		    .filter(StringUtils::isNotNullOrEmpty)
		    .forEach(System.out::println);
		
		
//		중복제거
//		Stream인터페이스도 갖는 distinct받는있어서, 필터 요소에 중복 방법 Object.equals(Object)방법.
		Stream<T> distinct()
		
//		다시 말하지만, 새 스트림을 반환하기 때문에 이것은 중간 작업입니다. 어떤 요소가 중복되는지 알아 내기 위해 요소의 값을 알아야하므로이 작업도 상태 저장입니다.
//		예를 들면 다음과 같습니다.
		List<String> words = Arrays.asList("hello", null, "hello");
		words.stream()
		    .filter(t -> t != null) // ["hello", "hello"]
		    .distinct() // ["hello"]
		    .forEach(System.out::println);
//		물론 결과는 다음과 같습니다.
		hello
		
		키 포인트
		Java 8 Iterable은이 인터페이스의 구현 (목록과 같은)을 반복하는 또 다른 옵션으로 인터페이스에 다음 메소드를 추가합니다 .
		default void forEach(Consumer<? super T> action)
		예를 들면 :
		List<String> words = Arrays.asList("hello", "world");
		words.forEach(t -> System.out.println(t));
		Stream인터페이스는이 방법이 있습니다 :
		void forEach(Consumer<? super T> action)
		이것은 터미널 작업입니다. 예를 들면 다음과 같습니다.
		Stream<String> words = Stream.of("hello", "world");
		words.forEach(t -> System.out:println(t));
		물론 스트림 사용의 장점은 다음과 같이 작업을 연결할 수 있다는 것입니다.
		words.sorted()
		    .limit(2)
		    .forEach(System.out::println);
		그러나 터미널 작업으로 다음과 같은 작업을 수행 할 수 없습니다.
		words.forEach(t -> System.out.println(t.length()));
		words.forEach(System.out::println);
		필터링을 위해 컬렉션 측면에 새로운 방법이 있습니다.
		default boolean removeIf(Predicate<? super E> filter)
		그러면 주어진 술어를 충족하는 콜렉션의 모든 요소가 제거됩니다.
		온 Stream인터페이스, 우리는이 :
		Stream<T> filter(Predicate<? super T> predicate)
		주어진 조건자를 만족하는 요소로 구성된 새 스트림을 반환합니다.
		이 메서드는 스트림을 반환하기 때문에 중간 작업을 나타내므로 원하는 수의 필터 또는 기타 중간 작업을 연결할 수 있습니다.
		List<String> words = Arrays.asList("hello", null, "");
		words.stream()
		    .filter(t -> t != null) // ["hello", ""]
		    .filter(t -> !t.isEmpty()) // ["hello"]
		    .forEach(System.out::println);
		Stream인터페이스도에있어서, 필터 요소에 중복 구별 방법 갖는 Object.equals(Object)방법.
		Stream<T> distinct()
		이것은 중간 작업이며, 어떤 요소가 중복되는지 확인하기 위해 요소의 값을 알아야하므로이 작업도 상태 저장입니다. 예를 들면 다음과 같습니다.
		List<String> words = Arrays.asList("hello", null, "hello");
		words.stream()
		    .filter(t -> t != null) // ["hello", "hello"]
		    .distinct() // ["hello"]
		    .forEach(System.out::println);
		
		
		
		
		
	}

}
