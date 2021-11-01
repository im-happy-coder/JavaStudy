package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Examp69 {

	public static void main(String[] args) {
		UnaryOperator<Integer> uo1 = s -> s*2; //line n1
		List<Double> loanValues = Arrays.asList(1000.0, 2000.0);
		loanValues.stream()
		.filter(lv -> lv >= 1500)
		.map(lv -> uo1.apply(lv))   //line n2  ,, 즉 컴파일 에러는 line n2에서 발생한다.
//		uo1.apply ()는 정수를 사용하지만 map ()에서는 double을 전달합니다.

		.forEach(s -> System.out.print(s + " "));
	}
//	답 : C. A compilation error occurs at line n2.
//	만약 UnaryOperator<Double> 이라면 답은 : 4000.0

}



/*
2.7 java.util.function.UnaryOperator<T>
: java.util.function.Function<T,R> 에서 확장한 람다식으로서, <T>형태의 입력값을 받아 <T>형태의 출력값을 리턴한다.
예)
java.util.function.UnaryOperator<String> uo = (x)->x.toUpperCase();
System.out.println("UnaryOperator test ="+ uo.apply("hello"));
결과) UnaryOperator test =HELLO
*/