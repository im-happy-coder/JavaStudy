package Question201_248;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp203 {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("pen", "is", "not", "a", "pencil");
		Predicate<String> test = s -> {
			int i =0;
			boolean result = s.contains("pen");
			System.out.println((i++) + ":");
			return result;
		};
		str.stream().filter(test).findFirst().ifPresent(System.out::print);
	}

	
	//답 : C. 0 : pen
	
}
// findFisrt는 스트림의 순서상 가장 첫번째 있는 것을 리턴해주고, findAny는 순서와 관계없이 먼저 찾아지는 객체를 리턴합니다.
// -->  A. 0 : 0 : pen   = pen이 리스트에서 첫번째가 아닌 2번쨰에 있을 시 답
// -->  C. 0 : pen   = pen이 첫번째 잇을때 답
// pen이 3번째에 있으면 0은 3번 출력됨