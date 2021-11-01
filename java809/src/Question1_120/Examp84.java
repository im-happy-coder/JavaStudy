package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp84 {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
		System.out.println("Searching");
		return n.contains("red");
		};
		colors.stream()
		.filter(c -> c.length() > 3)
		.allMatch(test);
		//allMatch(test)는 test한번 실행 
		//anyMatch(test)는 두번 실행 
		//noneMatch(test)도 두번
		
	}

}
//Stream 클래스에는 모든 요소들이 주어진 조건에 만족하는지 여부를 검사하는 allMatch() 메서드를 제공한다.