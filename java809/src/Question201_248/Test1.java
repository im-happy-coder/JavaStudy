package Question201_248;

import java.util.stream.Stream;

public class Test1 {
	public static void main(String[] args) {
		Stream.of("sun", "pool", "beach", "kid", "island", "sea", "sand")
	    .map(str -> str.length())
	    .filter(i -> i > 3)
	    .limit(3) //필터 조건을 충족하고 3개까지만 표시한다.
	    //map에서 길이를 반환해서 길이 int값이 나온다.Stream<T> limit(long maxSize)
//	    . orElse()메서드는가 Optional비어 있을 때 인수를 반환하고    그렇지 않으면의 캡슐화 된 값을 반환합니다 
	    .forEach(System.out::println);
//		4
//		5
//		6

	}
}
