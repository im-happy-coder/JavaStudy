package Question1_120;

import java.util.Arrays;
import java.util.List;

public class FExamp100 {
//	Which code fragment, when inserted at line n1, ensures false is printed?
//	 false를 출력하는 것
	public static void main(String[] args) {
		List<String> cs = Arrays.asList("Java", "Java EE", "Java ME");
		boolean b = cs.stream() .allMatch(w -> w.equals("Java"));//line n1
		//allMatch()는 모든 요소가 Java이여야 한다.
		System.out.println(b);
	}

}


/*
 * findFirst()와 findAny() 메소드는 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체를 반환합니다.
allMatch() 모든 요소들이 매개값(Predicate)으로 주어진 조건을 만족하는지 조사
anyMatch() 최소한 한 개의 요소가 주어진 조건에 만족하는지 조사
noneMatch() 모든 요소들이 주어진 조건을 만족하지 않는지 조사
*/