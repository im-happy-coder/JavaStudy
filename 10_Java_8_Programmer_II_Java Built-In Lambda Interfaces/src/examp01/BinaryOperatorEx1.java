package examp01;

public class BinaryOperatorEx1 {

	public static void main(String[] args) {
//		BinaryOperator
//		이 인터페이스는 BiFunction인수와 결과가 동일한 유형일 때 인터페이스 의 전문화입니다 (사실이 인터페이스는 여기에서 확장 됨).
//
//		인터페이스 정의 방법은 다음과 같습니다.
//		@FunctionalInterface
//		public interface BinaryOperator<T>
//		             extends BiFunction<T,T,T> {
//		     // Two static method are defined
//		}
//
//		따라서 기능 설명자 (메서드 서명)는 다음과 같습니다.
//		(T, T) -> T
//
//		다음은 익명 클래스를 사용하는 예입니다.
//		BinaryOperator<String> binOp =  new BinaryOperator<String>() {
//		     @Override
//		     public String apply(String t, String u) {
//		         return t.concat(u);
//		     }
//		};
//		System.out.println(binOp.apply("Hello", " there"));
//
//		그리고 람다 식으로 :
//		BinaryOperator<String> binOp = (t, u) -> t.concat(u);
//		System.out.println(binOp.apply("Hello", " there"));
//
//		이 인터페이스는 인터페이스의 기본 메소드를 상속합니다 BiFunction.
//		default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after)
//
//		그리고 두 가지 새로운 static방법을 정의 합니다.
//		static <T> BinaryOperator<T> minBy(
//		                  Comparator<? super T> comparator)
//		static <T> BinaryOperator<T> maxBy(
//		                  Comparator<? super T> comparator)
//
//		이는 BinaryOperator지정된에 따라 두 요소 중 더 작거나 큰 것을 반환하는 a 를 반환합니다 Comparator.
//		다음은 간단한 예입니다.
//
//		BinaryOperator<Integer> biOp =
//		             BinaryOperator.maxBy(Comparator.naturalOrder());
//		System.out.println(biOp.apply(28, 8));
//
//		보시다시피 이러한 메서드는 Comparator.
//		Comparator.naturalOrder()객체를 자연스러운 순서로 Comparator비교하는를 반환합니다 Comparable. 그것을 실행하기 위해 우리 apply()는 BinaryOperator. 
//		당연히 결과는 다음과 같습니다.
//		28
//
//		int, long및의 기본 버전도 있습니다 double. 여기서 두 인수와 반환 유형은 동일한 기본 유형입니다. BinaryOperator또는 에서 확장되지 않습니다 BiFunction.
//		예를 들어, 다음은 정의입니다 IntBinaryOperator.
//		@FunctionalInterface
//		public interface IntBinaryOperator {
//		     int applyAsInt(int left, int right);
//		}
//		대신 사용할 수 있습니다 BinaryOperator.
	}

}
