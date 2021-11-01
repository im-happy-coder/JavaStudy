package examp01;

public class FunctionEx1 {

	public static void main(String[] args) {
//		Function = 매핑자 = 다른 유형의 결과를 생성한다.
//		인터페이스 정의 방법은 다음과 같습니다.
//
//		@FunctionalInterface
//		public interface Function<T, R> {
//		     R apply(T t);
//		     // Other default and static methods
//		     // ...
//		}
//
//		따라서 기능 설명자 (메서드 서명)는 다음과 같습니다.
//		T -> R
		
		
		
		
//		방법 가정 :
//			void round(double d, Function<Double, Long> f) {
//			     long result = f.apply(d);
//			     System.out.println(result);
//			}
//
//			다음은 익명 클래스를 사용하는 예입니다.
//			round(5.4, new Function<Double, Long>() {
//			     Long apply(Double d) {
//			         return Math.round(d);
//			     }
//			});
//
//			그리고 람다 식으로 :
//
//			round(5.4, d -> Math.round(d));
//
//			이 인터페이스에는 다음과 같은 기본 메서드도 있습니다.
//
//			default <V> Function<V,R> compose(
//			         Function<? super V,? extends T> before)
//			default <V> Function<T,V> andThen(
//			         Function<? super R,? extends V> after)
//		이 방법의 차이점 compose은 매개 변수가 나타내는 함수를 먼저 적용하고 그 결과가 다른 함수에 대한 입력 역할을한다는 것입니다. 
//		andThen먼저 메서드를 호출하는 함수를 적용하고 그 결과는 매개 변수가 나타내는 함수의 입력으로 작동합니다.
		
//		예를 들면 :
//
//			Function<String, String> f1 = s -> {
//			     return s.toUpperCase();
//			};
//			Function<String, String> f2 = s -> {
//			     return s.toLowerCase();
//			};
//			 System.out.println(f1.compose(f2).apply("Compose"));
//			System.out.println(f1.andThen(f2).apply("AndThen"));
//
//			출력은 다음과 같습니다.
//			COMPOSE
//			andthen
//			첫 번째 경우 f1은 적용 할 마지막 기능입니다.
//			두 번째 경우에는 f2가 마지막으로 적용되는 함수입니다.
//		또한 static방법이 있습니다.
//
//		static <T> Function<T, T> identity()
//
//		항상 입력 인수를 반환하는 함수를 반환합니다.
//
//		기본 버전의 경우 int, long및에 적용 double되지만 이전 인터페이스보다 더 많은 조합이 있습니다.
//
//		함수가 제네릭 유형을 반환하고 기본 인수를 취함을 나타 내기 위해 인터페이스 이름은 XXXFunction 입니다. 예를 들면 다음과  IntFunction같습니다.
//		@FunctionalInterface
//		public interface IntFunction<R> {
//		     R apply(int value);
//		}
//		함수가 기본 유형을 반환하고 일반 인수를 취함을 나타 내기 위해 인터페이스의 이름은 ToXXXFunction 입니다. 예를 들면 다음과 ToIntFunction같습니다.
//		@FunctionalInterface
//		public interface ToIntFunction<T> {
//		     int applyAsInt(T value);
//		}
//		함수가 기본 인수를 사용하고 다른 기본 유형을 반환 함을 나타 내기 위해 인터페이스의 이름은 XXXToYYYFunction입니다 . 여기서 XXX 는 인수 유형이고 YYY 는 반환 유형입니다. 예를 들면 다음과  IntToDoubleFunction같습니다.
//		@FunctionalInterface
//		public interface IntToDoubleFunction {
//		     double applyAsDouble(int value);
//		}
//		이러한 인터페이스는 편의를위한 것이며, 예를 들어 프리미티브와 직접 작업하기위한 것입니다.
//
//		DoubleFunction<R>대신에 Function<Double, R>
//		ToLongFunction<T>대신의 Function<T, Long>
//		IntToLongFunction대신Function<Integer, Long>
		
		
		
		
		
		
		
		
		
		
	}

}
