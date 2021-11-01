package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Examp54 {
	public static void main(String[] args) {
//		List<Double> codes = Arrays.asList (10.0, 20.0); 이렇게 Double형으로 바꾸고 값도 소수점이 있으면, 답은 20.0, 30.0이 출력된다.
		
		List<Integer> codes = Arrays.asList (10, 20); //여기서 List가 Integer이기때문에
		UnaryOperator<Double> uo = s -> s +10.0;  //UnaryOperator가 Double이기때문에 오류
		codes.replaceAll(uo);
		codes.forEach(c -> System.out.println(c));
	}
}
//List의 일반 유형이 Integer이기 때문에 컴파일 오류가 발생하지만 UnaryOperator는 Double을 사용하므로 컴파일 오류가 발생합니다.

//C. A compilation error occurs.