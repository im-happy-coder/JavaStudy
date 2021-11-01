package examp01;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class ReductionEx2 {

	public static void main(String[] args) {
//		리덕션과 reduce 메소드 : 최종 연산
//		리덕션(Reduction) 데이터를 축소하는 연산
//		T reduce(T identity, BinaryOperator<T> accumulator) //Stream<T>에 존재
		//BinaryOperator<T> T apply(T t1, T t2)
		List<String> ls = Arrays.asList("Box", "Simple", "Complex", "Robot");
		
		BinaryOperator<String> lc = (s1, s2) -> {
			if(s1.length() > s2.length())
				return s1;
			else
				return s2;
		};
		String str = ls.stream()
				.reduce("", lc); //스트림이 빈 경우 ""반환
		System.out.println(str);
//		출력 --> Complex
//		reduce는 첫번째 전달 인자를 스트림의 첫 번째 데이터로 간주함에 주의!
		
		
//		reduce의 첫번째 반환 인자("")는 빈경우 ""반환하지만
//		비어있지 않으면 스트림에서 Box앞에 새로운 공간을 만들어서 처리한다.


	
	
	}

}
