package examp04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectEx1 {

	public static void main(String[] args) {
//		collect: 스트림에 있는 데이터를 모아라!
//		[Stream<T>의 메소드] IntStream, LongStream, DoubleStream에도 정의된 메소드
//		<R> R collect(Supplier<R> supplier,
//						BiConsumer<R, ? super T> accumulator,
//						BiConsumer<R, R> combiner>
		
		String[] words = {"Hello", "Box", "Robot", "Toy"};
		Stream<String> ss = Arrays.stream(words);
		
		List<String> ls = ss.filter(s->s.length() < 5)  //필터적용 : Box와 Toy만 스트림에 남음
							.collect(() -> new ArrayList<>(), //저장소 생성
									(c,s)->c.add(s), //c는 위에서 생성한 ArrayList의 저장소,  ArrayList의 저장소를 c로 지정했으므로 c.add로 사용할수있따.
														//s는 filter에서 남은 스트림의 데이터들
									(list1, list2) -> list1.addAll(list2));
		System.out.println(ls);
		
		
		
//		병렬 스트림에서의 collect
		List<String> ls2 = ss.parallel() //병렬스트림 생성
				.filter(s->s.length() < 5)  //필터적용 : Box와 Toy만 스트림에 남음
				.collect(() -> new ArrayList<>(), //저장소 생성
						(c,s)->c.add(s), //c는 위에서 생성한 ArrayList의 저장소,  ArrayList의 저장소를 c로 지정했으므로 c.add로 사용할수있따.
											//s는 filter에서 남은 스트림의 데이터들
						(list1, list2) -> list1.addAll(list2)); //취합한다는 뜻
//		스트림에 1,2,3,4,5,6이 있다고 가정하면
//		코어가 3개있고 1,2는 코어1, 3,4는 코어2, 5,6은 코어3이라고 가정하면
//		각각의 코어 마다 ArraysList가 생성이 된다.
//		그리고 list1이 코어1이 될수있고 코어2가 될수있고 결과는 똑같으며,
//		list1이 코어1이라고 가정하면 list1를 기준으로 list2의 값을 취합한다.
//		즉 list1.addAll(list2) 코어1에 코어2를 취합하는 것으로 코어1은 이제 1,2,3,4가 되며
//		나머지 코어3도 자동으로 list2가 되어 취합하게 된다.
		
		System.out.println(ls2);
	}

}
