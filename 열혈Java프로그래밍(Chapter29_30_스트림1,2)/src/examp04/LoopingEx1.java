package examp04;

import java.util.stream.IntStream;

public class LoopingEx1 {

	public static void main(String[] args) {
//		루핑(Looping)
//		대표적으로 루핑연산 forEaxh가 있다. 이는 '최종 연산', 반면 다음 메소드들은 '중간 연산'으로 루핑 연산을한다.
//		Stream<T> peek(Consumer<? super T> action) //Stream<T>의 메소드
//		IntStream peek(IntConsumer action) //IntStream<T>의 메소드
//		LongStream peek(LongConsumer action) //LongStream<T>의 메소드
//		DoubleStream peek(DoubleConsumer action) //DoubleStream<T>의 메소드
		
		
		//최종 연산이 생략된 스트림의 파이프 라인
		IntStream.of(1, 3, 5).peek(d->System.out.println(d+"\t"));
		//중간연산만 존재하므로 아무 것도 출력되지 않는다.
		System.out.println();
		
		
		
		//최종 연산이 존재하는 스트림의 파이프 라인
		IntStream.of(5,3,1).peek(d->System.out.println(d+"\t")).sum();
		//sum은 합계를 반환하지만, 코드에서 반환값을 그냥 버리고 있다, 반환값을 저장하거나 해야한다.
		//9가 반환은 되지만 아무것도 하지 않았기 때문에 peek만 출력한다.
		
		
		
		System.out.println();
	}

}
