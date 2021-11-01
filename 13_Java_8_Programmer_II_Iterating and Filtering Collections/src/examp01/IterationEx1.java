package examp01;

public class IterationEx1 {

	public static void main(String[] args) {
//		기본적인 반복문 사용법
//		List<String> words = ...
//				for(int i = 0; i < words.size(); i++) {
//				    System.out.println(words.get(i));
//				}
//
//				또는 반복자를 사용하여 :
//
//				List<String> words = ...
//				for(Iterator<String> it = words.iterator(); it.hasNext();) {
//				    System.out.println(it.next());
//				}
//
//				또는 소위 for-each루프 :
//				List<String> words = ...
//				for(String w : words) {
//				    System.out.println(w);
//				}
		
		
//		Java 8에서 제공하는 for-each 루프를 기반으로한 메서드
//		이것이 기본 구현입니다.
//		for (T t : this) {
//		    action.accept(t);
//		}
//		
//		이를 사용하려면 익명 클래스로 시작할 수 있습니다.
//		List<String> words = ...
//		words.forEach(new Consumer<String>() {
//		    public void accept(String t) {
//		        System.out.println(t);
//		    }
//		});
		
//		해당 익명 클래스는 람다 식으로 변환 될 수 있습니다.
//		words.forEach(t -> System.out.println(t));
//		또는이 특정 예제에서 메서드 참조 :
//		words.forEach(System.out::println);
		
		
		
		
//		다음과 같은 코드는 유효하지 않습니다.
		int max = 0;
		words.forEach(t -> {
		    // The following line won't compile, you can't modify max
		    max = Math.max(max, t.length());
		    System.out.println(t);
		});
		
		
//		For-each메서드는 스트림을 반환하지 않으므로 최종 작업을 나타냅니다.
//		그것을 사용하는 것은 Iterable버전과 다르지 않습니다 .
		Stream<String> words = ...
				// As an anonymous class
				words.forEach((new Consumer<String>() {
				    public void accept(String t) {
				        System.out.println(t);
				    }
				});
				// As a lamba expression
				words.forEach(t -> System.out.println(t));
				// As a method reference
				words.forEach(System.out::println)
		
		
//				물론 스트림 사용의 장점은 다음과 같이 작업을 연결할 수 있다는 것입니다.
				words.sorted()
				    .limit(2)
				    .forEach(System.out::println);
		
//				최종 작업으로 다음과 같은 작업을 수행 할 수 없습니다.
				words.forEach(t -> System.out.println(t.length()));
				words.forEach(System.out::println);
				
//				또는에 대한 두 호출을 System.out.println하나의 람다 식으로 래핑합니다 .
				Consumer<String> print = t -> {
				    System.out.println(t.length());
				    System.out.println(t);
				};
				words.forEach(print);
				
//				반환, 중단을 사용하거나 반복을 계속 종료 할 수 없습니다.
//				break and continue는 루프 외부에서 사용할 수 없기 때문에 컴파일 오류를 생성하고 
//				foreach 메서드가 기본적으로 다음과 같이 구현 된 것을 볼 때 반환은 의미가 없습니다.
				for (T t : this) {
					   // Inside accept, return has no effect
					   action.accept(t);
					}
				
//				참고로 (시험에서 다루지 않았기 때문에) Java 8은 또한 forEach 메소드를 Map 인터페이스에 추가했습니다. 그
//				러나 맵에는 키와 값이 있으므로이 새로운 메서드는 BiConsumer를 사용합니다.	
				default void forEach(BiConsumer<? super K,? super V> action)

//				기본 구현은 다음과 같습니다.
				for (Map.Entry<K, V> entry : map.entrySet()) {
				    action.accept(entry.getKey(), entry.getValue());
				}
	}

}
