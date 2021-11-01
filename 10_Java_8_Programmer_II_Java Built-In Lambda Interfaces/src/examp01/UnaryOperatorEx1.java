package examp01;

public class UnaryOperatorEx1 {

	public static void main(String[] args) {
//		단항 연산자 UnaryOperator
		
//		인터페이스 정의 방법은 다음과 같습니다.
//
//		@FunctionalInterface
//		public interface UnaryOperator<T>
//		         extends Function<T, T> {
//		     // Just the identity
//		     // method is defined
//		}
//
//		따라서 기능 설명자 (메서드 서명)는 다음과 같습니다.
//		T -> T
//
//		다음은 익명 클래스를 사용하는 예입니다.
//
//		UnaryOperator<String> uOp = new UnaryOperator<String>() {
//		     @Override
//		public String apply(String t) {
//		         return t.substring(0,2);
//		     }
//		};
//		System.out.println(uOp.apply("Hello"));
//		그리고 람다 식으로 :
		//UnaryOperator<String> uOp = t -> t.substring(0,2);
		//System.out.println(uOp.apply("Hello"));
		
//		이 인터페이스는 인터페이스의 기본 메소드를 상속합니다 Function.
//		default <V> Function<V,R> compose(
//		         Function<? super V,? extends T> before)
//		default <V> Function<T,V> andThen(
//		         Function<? super R,? extends V> after)
//
//		그리고이 인터페이스에 대한 static메서드 identity()를 정의합니다 ( static메서드가 상속되지 않기 때문에 ) :
//		static <T> UnaryOperator<T> identity()
		
		
//		즉, 다시 표시 UnaryOperator항상 입력 인수를 반환합니다.
//
//		이 원시적 버전은 또한 int, long및 double. 그들은 UnaryOperator.
//		예를 들어, 다음은 정의입니다 IntUnaryOperator.
//		@FunctionalInterface
//		public interface IntUnaryOperator {
//		     int applyAsInt(int value);
//		         // Definitions for compose, andThen, and identity
//		}
//
//		따라서 다음을 사용하는 대신 :
//		int[] a = {1,2,3,4,5,6,7,8};
//		int sum = sumNumbers(a, t -> t * 2);
//		//...
//		int sumNumbers(int[] a, UnaryOperator<Integer> unary) {
//		         int sum = 0;
//		         for(int i : a) {
//		                 sum += unary.apply(i);
//		         }
//		         return sum;
//		}
//
//		당신이 사용할 수있는:
//		int[] a = {1,2,3,4,5,6,7,8};
//		int sum = sumNumbers(a, t -> t * 2);
//		//...
//		int sumNumbers(int[] a, IntUnaryOperator unary) {
//		         int sum = 0;
//		         for(int i : a) {
//		                 sum += unary.applyAsInt(i);
//		         }
//		         return sum;
//		}
		
		
		
		
		
		
		
	}

}
