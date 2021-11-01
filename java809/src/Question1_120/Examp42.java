package Question1_120;

import java.util.Arrays;
import java.util.List;

public class Examp42 {
	public static void main(String[] args) {
		//맨 앞에 숫자가 정렬 기준이 되고
		//만약 앞에 숫자값이 같다면 정렬 방식이  뒤에 문자 순서가 기준이 된다.
		List<String> empDetails = Arrays.asList("100, Robin, HR", "200, Mary, AdminServices", "101, Peter, HR"); empDetails.stream()
		.filter(s-> s.contains("1")) //객체가 1이 포함되어 있으면 true를 반환   ,, 즉 true가 아니면 컴파일 되지 않는다.
		//filter가 배열에 1 문자열이 포함되어 있지 않으면 출력하지 않는다.. 즉, 1이 포함(contains)되어 있어야 출력시켜준다.
		.sorted()
		.forEach(System.out::println); //line n1
		
		
		/*
		 * 
		 * * 객체의 요소가 Comparable을 구현했을 때, 기본 비교로 정렬하려면
1. sorted();  //자동 오름차순 정렬
2. sorted( (a,b) -> a.compareTo(b) ); //a를 기준으로 정렬
3. sorted( Comparator.naturalOrder() );  //기본정렬
 이 세가지 중에서 하나를 사용하면 됨.
		 */
//		sorted(Comparator.naturalOrder()) // 기본 비교 방법
//		sorted(Comparaot.reverseOrder()) // 정반대 비교 방법
		
//		A. 100, Robin, HR 101, Peter, HR
	}
}
