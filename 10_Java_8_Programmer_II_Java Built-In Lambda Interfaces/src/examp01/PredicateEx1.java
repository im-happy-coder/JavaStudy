package examp01;

public class PredicateEx1 {

	public static void main(String[] args) {
//		Predicate기능적 인터페이스는
//		참 또는 거짓이 될 수있는 명령문입니다.
//		@FunctionalInterface
//		public interface Predicate<T> {
//		    boolean test(T t);  
//		    // Other default and static methods
//		    // ...
//		}
//		위에서 T는  T -> boolean를 말한다.
		
		
		
		
//		다음은 익명 클래스를 사용하는 예입니다.
//
//		Predicate<String> startsWithA = new Predicate<String>() {
//		    @Override
//		    public boolean test(String t) {
//		        return t.startsWith("A");
//		    }
//		};
//		boolean result = startsWithA.test("Arthur");
//
//		그리고 람다 식으로 :
//
//		Predicate<String> startsWithA = t -> t.startsWith("A");
//		boolean result = startsWithA.test("Arthur");
//
//		이 인터페이스에는 다음과 같은 기본 메서드도 있습니다.
//
//		default Predicate<T> and(Predicate<? super T> other)
//		default Predicate<T> or(Predicate<? super T> other)
//		default Predicate<T> negate()
//		논리 AND 및 OR 및 논리 부정 을 나타내는 구성 을 리턴합니다.
		
//		 static방법이 있습니다.
//		 static <T> Predicate<T> isEqual(Object targetRef)
//		Predicate두 인수가에 따라 동일한 지 테스트 하는를 반환합니다 Objects.equals(Object, Object)
		
//		예를 들어, 다음은 정의입니다 IntPredicate.
//
//		@FunctionalInterface
//		public interface IntPredicate {
//		    boolean test(int value);
//		    // And the default methods: and, or, negate
//		}
//
//		따라서 다음을 사용하는 대신 :
//
//		Predicate<Integer> even = t -> t % 2 == 1;
//		boolean result = even.test(5);
//
//		당신이 사용할 수있는:
//
//		IntPredicate even = t -> t % 2 == 1;
//		boolean result = even.test(5);
		
		
		
		
		
		
		
		
		
		
		
	}

}
