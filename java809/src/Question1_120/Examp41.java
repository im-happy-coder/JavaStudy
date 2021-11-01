package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp41 {
	public static void main(String[] args) {
//		/*contains( ) 메서드는 특정 문자열이 포함되어 있는지 확인하는 기능을 한다. 특정 문자열이 포함되어 있다면 true를 없다면 false를 반환한다.
		List<String> str = Arrays.asList ("my", "pen", "is", "your", "Pen"); //이건 대문자 P임
				Predicate<String> test = s -> {
				int i = 0;
				boolean result = s.contains ("pen"); //대소문자 구분한다
				System.out.print((i++) + ":");  //i는 지역변수가 아닌 로컬 변수이므로 filter(test)를 호출할때마다 i++는 후위증감 연산자이므로 증가 할 수가 없습니다.
												//만약 i가 ++i 선증가방식이면 filter(test)호출할때마다 1를 표시할겁니다.
				return result;
				};
				str.stream()
				.filter(test)
				.findFirst()   // findFisrt는 스트림의 순서상 가장 첫번째 있는 것을 리턴
				.ifPresent(System.out ::print);
				
				
				//filter(test)가 한번씩 실행되서 1이 증가되지 않는다.
				
//				답  :  0 : 0 : pen
	}
}
