package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

interface CourseFilter extends Predicate<String> {
	public default boolean test (String str) {
		return str.contains ("Java");
		}
		}

public class Examp173 {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("Java", "Java EE", "Embedded Java");
		Predicate<String> cf1 = s -> s.length() > 3;
		Predicate cf2 = new CourseFilter() { //line n1
		public boolean test (String s) {
//		return s.startsWith ("Java"); //일때의 답 : 2
		return s.contains("Java"); // 일때의 답 : 3
		}
		};
		long c = strs.stream()
		.filter(cf1)
		.filter(cf2) //line n2
		.count();
		System.out.println(c);
		
		//답 : 2
		
		
		//만약 .filter(cf2 //line n2
		//이렇게 괄호가 안닫혀있으면 답이 D. A compilation error occurs at line n2. 일수도 있음
	}

}
