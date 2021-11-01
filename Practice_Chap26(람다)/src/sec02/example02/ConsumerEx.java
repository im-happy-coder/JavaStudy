package sec02.example02;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerEx {

	public static void main(String[] args) {
		//함수적 인터페이스 = 추상메서드가 1개
		
		//Consumer = 소비자 = 리턴값 없음
		
		//String타입을 매개변수로 가지는 Consumer제네릭 함수적 인터페이스를 구현했다.
		//t는 무조건 String타입이고 매개변수가 된다.
		//Consumer인터페이스 류들은 리턴값이 없다.
		
		
		//t -> {System.out.println("ConsumerInterface : " + t);  ----> 이게 바로, accept()를 람다식으로 구현한거다.
		Consumer<String> consumer = t -> {
			System.out.println("ConsumerInterface : " + t);  //이부분 accept()의 몸통(실체)
		};
		
		consumer.accept("소비자 인터페이스 자바 1.8추가");
		
		
		
		//Bi가 2개라는 뜻이다.
		//BiConsumer는 2개의 객체를 받아서 소비하는 함수적 인터페이스이다.
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println("BiConsumerInterface : " + t + "," + u);
		};
		
		biConsumer.accept("자바", "C++");
		
		
		
		//DoubleConsumer는 매개변수 값으로 무조건 Double값만 받는다.
		DoubleConsumer doubleConsumer = d -> {
			System.out.println("DoubleConsumerInterface : " + d);
		};
		doubleConsumer.accept(100.99);
		
		
		
		//ObjIntConsumer<T>함수적 인터페이스는 매개값으로 T와 int값(고정)을 가진다.
		ObjIntConsumer<String> objIntConsumer = (t,i) -> {   //t는 제네릭타입,,,,,i는 int타입
			System.out.println("ObjIntConsumerInterface : " + t + " " + i);
		};
		objIntConsumer.accept("자바", 8);
		
		
		
		
		
		
		
		
		
		
	}

}
