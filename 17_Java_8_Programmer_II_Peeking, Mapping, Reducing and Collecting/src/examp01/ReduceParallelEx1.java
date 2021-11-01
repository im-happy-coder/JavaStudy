package examp01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReduceParallelEx1 {

	public static void main(String[] args) {
//		병렬처리 
//		작업을 나눈다.
//		List의 Arrays는 parallelStream()를 사용
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		String str = ls.parallelStream()
				.reduce("", lc); //스트림이 빈 경우 ""반환
		System.out.println(str);
//		출력 --> Complex
	}

}
