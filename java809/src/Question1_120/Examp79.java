package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Examp79 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(10, 20);
		List<Integer> list2 = Arrays.asList(15, 30);
		Stream.of(list1, list2) .flatMap(list -> list.stream()) .forEach(s -> System.out.print(s + " "));//line n1
		
		//map은 for을 한번밖에 돌리지 못하지만
		//flatmap은 for문을 2번 이상 돌릴 수 있다
		// 즉, 배열 또는 리스트가 2개면 둘다 돌린다 이말이다.
	}

}
