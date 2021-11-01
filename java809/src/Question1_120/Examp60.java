package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Examp60 {

	public static void main(String[] args) {
		List<String> nL = Arrays.asList("Jim", "John", "Jeff");
		Function<String, String> funVal = s -> "Hello : ".concat(s); nL.stream()
		.map(funVal)
//		.forEach(System.out::println); //이문장은 최종연산이기 때문에 배열을 출력합니다.
		.peek(System.out::print);
	}

}

// forEach를 사용하면 Hello : JimHello : John Hello : Jeff 출력
// 	답:  C. The program prints nothing.  프로그램이 아무것도 인쇄하지 않습니다.------이유는 : map과 peek는 중간연산이기때문이다.