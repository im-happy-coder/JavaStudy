package examp01;

public class BiPredicateEx1 {

	public static void main(String[] args) {
//		BiPredicate
//		이 인터페이스는 두 개의 인수를 사용하는 술어를 나타냅니다.
		
//		@FunctionalInterface public interface BiPredicate<T, U> {
//		     boolean test(T t, U u);
//		     // Default methods are defined also
//		}
//
//		따라서 기능 설명자 (메서드 서명)는 다음과 같습니다.
//		(T, U) -> boolean
//
//		다음은 익명 클래스를 사용하는 예입니다.
//		BiPredicate<Integer, Integer> divisible =
//		         new BiPredicate<Integer, Integer>() {
//		     @Override
//		     public boolean test(Integer t, Integer u) {
//		         return t % u == 0;
//		     }
//		};
//		boolean result = divisible.test(10, 5);
//
//		그리고 람다 식으로 :
//		BiPredicate<Integer, Integer> divisible =
//		        (t, u) -> t % u == 0;
//		boolean result = divisible.test(10, 5);
		
		
		
//		이 인터페이스는 Predicate 인터페이스의 동일한 기본 메소드를 정의하지만 두 개의 인수를 사용합니다.
//
//		default BiPredicate<T, U> and(
//		         BiPredicate<? super T, ? super U> other)
//		default BiPredicate<T, U> or(
//		         BiPredicate<? super T, ? super U> other)
//		default BiPredicate<T, U> negate()
//
//		이 인터페이스에는 기본 버전(primited)이 없습니다. ,, 즉 기본형타입을 말한다. int, long, boolean등
		
		
	}

}
