package Question1_120;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Examp46 {
	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList (10, 20, 8);
			System.out.println (
			nums.stream().max(Comparator.comparing(a -> a)).get()//line n1 //comparing은 Function<T,R>을 인자로 받습니다.
			//max(Comparator)는 param으로 넘겨준 Comparator로 스트림의 아이템들을 모두 비교하여 최대 값 1개를 리턴합니다. 
			);
	}
}
