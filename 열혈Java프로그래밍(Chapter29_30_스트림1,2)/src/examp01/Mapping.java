package examp01;

import java.util.Arrays;
import java.util.List;

public class Mapping {

	public static void main(String[] args) {
//		맵핑1
//		"Box", "Robot", "Simple" => 3, 5, 6
		List<String> ls = Arrays.asList("Box", "Robot", "Simple");
		ls.stream()
			.map(s->s.length())
			.forEach(n->System.out.print(n+"\t"));
		System.out.println();
		
//		<R> Stream<R> map(Function<? super T, ? extends R> mapper)
//		Function은 들어오고 나가고,,,, 
//		Function<T, R> R apply(T t)
//		T가 들어오는 데이터, R이 반환되는 데이터
		
//		String인스턴스를 숫자로 반환되는 거니까 T는 String이고, R은 Int이지만 Int가 될수없기때문에 Integer가 된다.
		
//		R이 int가 아닌 반환형 int로 바꿀려면
//		IntStream mapToInt(ToIntFunction<? super T> mapper)
//		LongStream mapToLong(ToLongFunction<? super T> mapper)   //반환형이 Long
//		DoubleStream mapToDouble(ToDoubleFunction<? super T> mapper) //반환형이 Double
		
		List<String> ls2 = Arrays.asList("Box", "Robot", "Simple");
		ls2.stream()
			.mapToInt(s->s.length())
			.forEach(n->System.out.print(n+"\t"));
		System.out.println();
		
//		결과는 같지만 이렇게 하는 이유는
//		반환형을 Int로 지정해주지 않으면 첫번째 예제에서는 int를 Integer로 자동박싱을 하기 때문이다
//		불필요한 자동박싱과 언박싱은 프로그램 성능 저하를 일으키기 때문에
//		명시적으로 mapToInt를 사용해서 int형으로 만들어준다.
		
	}

}
