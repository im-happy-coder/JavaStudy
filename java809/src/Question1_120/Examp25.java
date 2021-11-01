package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface CourseFilter extends Predicate<String> {
	public default boolean test (String str) {
		return str.equals ("Java");
	}
}
public class Examp25 {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
		Predicate<String> cf1 = s -> s.length() > 3;
		Predicate cf2 = new CourseFilter() { //line n1
			public boolean test(String s) {
				return s.contains("Java");  // contains() 함수는 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 함수이다.- 대/소문자를 구분한다.
				//strs에 Java 글자가 포함되어 있으면 , true를 반환한다.
			}
		};
		long c = strs.stream()
		.filter(cf1)
		.filter(cf2) //line n2
		.count();
		System.out.println(c);
	}

}
