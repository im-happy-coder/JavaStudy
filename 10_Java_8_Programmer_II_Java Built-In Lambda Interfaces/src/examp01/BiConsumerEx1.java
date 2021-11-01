package examp01;

public class BiConsumerEx1 {

	public static void main(String[] args) {
//		BiConsumer
//		이 인터페이스는 두 개의 인수를 사용하고 결과를 반환하지 않는 소비자를 나타냅니다.
//
//		인터페이스 정의 방법은 다음과 같습니다.
//		@FunctionalInterface
//		public interface BiConsumer<T, U> {
//		     void accept(T t, U u);
//		     // andThen default method is defined
//		}
//
//		따라서 기능 설명자 (메서드 서명)는 다음과 같습니다.
//		(T, U) -> void
//
//		다음은 익명 클래스를 사용하는 예입니다.
//		BiConsumer<String, String> consumeStr =
//		         new BiConsumer<String, String>() {
//		     @Override
//		     public void accept(String t, String u) {
//		         System.out.println(t + " " + u);
//		     }
//		 };
//		consumeStr.accept("Hi", "there");
//
//		그리고 람다 식으로 :
//		BiConsumer<String> consumeStr =
//		            (t, u) -> System.out.println(t + " " + u);
//		consumeStr.accept("Hi", "there");
//
//		이 인터페이스에는 다음과 같은 기본 방법도 있습니다.
//		default BiConsumer<T, U> andThen(
//		             BiConsumer<? super T, ? super U> after)
//		이 메서드는 소비자의 작업과 매개 변수의 작업을 순서대로 수행하는 구성된 BiConsumer를 반환합니다.
//		소비자의 경우와 마찬가지로 이러한 메서드는 BiConsumer를 결합하고 코드를 더 읽기 쉽게 만드는 데 유용합니다. 예를 들면 다음과 같습니다.
//		BiConsumer<String, String> first = (t, u) -> System.out.println(t.toUpperCase() + u.toUpperCase());
//		BiConsumer<String, String> second = (t, u) -> System.out.println(t.toLowerCase() + u.toLowerCase());
//		first.andThen(second).accept("Again", " and again");
//
//		출력은 다음과 같습니다.
//		AGAIN AND AGAIN again and again
		
		
		
//		이 원시적 버전은 또한 int, long및 double. 그들은에서 확장하지 않고 BiConsumer두 ints 를 취하는 대신 , 
//		예를 들어 하나의 객체와 원시 값을 두 번째 인수로 사용합니다. 따라서 명명 규칙은 ObjXXXConsumer로 변경됩니다 . 
//		여기서 XXX 는 기본 유형입니다. 예를 들어, 다음은 정의입니다 ObjIntConsumer.

//		@FunctionalInterface
//		public interface ObjIntConsumer<T> {
//		     void accept(T t, int value);
//		}
//
//		따라서 다음을 사용하는 대신 :
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, (t, i) -> System.out.println(t + i));
//		//...
//		void printList(int[] a, BiConsumer<String, Integer> c) {
//		    for(int i : a) {
//		        c.accept("Number:", i);
//		    }
//		}
//
//		당신이 사용할 수있는:
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, (t, i) -> System.out.println(t + i));
//		//...
//		void printList(int[] a, ObjIntConsumer<String> c) {
//		    for(int i : a) {
//		        c.accept("Number:", i);
//		    }
//		}
	}

}
