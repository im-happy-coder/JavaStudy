package examp01;

public class ConsumerEx1 {

	public static void main(String[] args) {
//		Consumer 소비자 = 매개값만 있고 리턴값이 없다.
		
//		@FunctionalInterface
//		public interface Consumer<T> {
//		     void accept(T t);
//		     // And a default method
//		     // ...
//		}
		
//		위에서 T는 T -> void
		
		
//		다음은 익명 클래스를 사용하는 예입니다.
//		Consumer<String> consumeStr = new Consumer<String>() {
//		     @Override
//		     public void accept(String t) {
//		         System.out.println(t);
//		     }
//		};
//		consumeStr.accept("Hi");
//
//		그리고 람다 식으로 :
//		Consumer<String> consumeStr = t -> System.out.println(t);
//		consumeStr.accept("Hi");
//
//		이 인터페이스에는 다음과 같은 기본 방법도 있습니다.
//		default Consumer<T> andThen(Consumer<? super T> after)
		
		
//		Consumer<String> first = t ->
//        System.out.println("First:" + t);
//        Consumer<String> second = t ->
//        System.out.println("Second:" + t);
//		first.andThen(second).accept("Hi");
//		
//		출력은 다음과 같습니다.
//		
//		First: Hi
//		Second: Hi
		
		
		
//		다음은 정의입니다 IntConsumer.
//		@FunctionalInterface
//		public interface IntConsumer {
//		     void accept(int value);
//		     default IntConsumer andThen(IntConsumer after) {
//		         // ...
//		     }
//		}
//
//		따라서 다음을 사용하는 대신 :
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, t -> System.out.println(t));
//		//...
//		void printList(int[] a, Consumer<Integer> c) {
//		     for(int i : a) {
//		         c.accept(i);
//		     }
//		}
//
//		당신이 사용할 수있는:
//
//		int[] a = {1,2,3,4,5,6,7,8};
//		printList(a, t -> System.out.println(t));
//		//...
//		void printList(int[] a, IntConsumer c) {
//		     for(int i : a) {
//		         c.accept(i);
//		     }
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
