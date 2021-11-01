package examp01;

public class BiFunctionEx1 {

	public static void main(String[] args) {
//		BiFunction
//		이 인터페이스는 다른 유형의 두 인수를 사용하고 다른 유형의 결과를 생성하는 함수를 나타냅니다.
//
//		인터페이스 정의 방법은 다음과 같습니다.
//		@FunctionalInterface
//		public interface BiFunction<T, U, R> {
//		     R apply(T t, U u); // Other default and static methods
//		     // ...
//		}
//
//		따라서 기능 설명자 (메서드 서명)는 다음과 같습니다.
//		(T, U) -> R
//
//		방법 가정 :
//		void round(double d1, double d2, BiFunction<Double, Double, Long> f) {
//		         long result = f.apply(d1, d2);
//		         System.out.println(result);
//		}
//
//		다음은 익명 클래스를 사용하는 예입니다.
//		round(5.4, 3.8, new BiFunction<Double, Double, Long>() {
//		         Long apply(Double d1, Double d2) {
//		                 return Math.round(d1 + d2);
//		         }
//		});
//
//		그리고 람다 식으로 :
//		round(5.4, 3.8, (d1, d2) -> Math.round(d1, d2));
//
//		과 달리이 인터페이스 Function에는 기본 메서드가 하나만 있습니다.
//		default <V> BiFunction<T, U, V> andThen(Function<? super R, ? extends V> after)
//		andThen입력에 호출하는 함수를 먼저 적용하고 마지막으로 인수가 나타내는 함수를 결과에 적용하는 구성된 함수를 반환합니다 .
//		이 인터페이스에는 Function. 그것은 단지 인수 및 반환 등의 일반적인 유형 걸릴 버전이 int, long그리고 double명명 규칙의로, 기본 유형을 ToXXXBiFunction XXX는 원시 형이다.
//		예를 들어, 다음은 정의입니다 ToIntBiFunction.
//		@FunctionalInterface
//		public interface ToIntBiFunction<T, U> {
//		     int applyAsInt(T t, U u);
//		}
//
//		그 대체합니다 BiFunction.
	}

}
