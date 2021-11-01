package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class FExamp103 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(10,20,30);
		Function<Integer, Integer> fn = f1 -> f1 + f1;      // 즉, 10+10, 20+20 이런식이다.
		Consumer<Integer> conVal = s -> System.out.println("Val" + s + " ");//Consumer()소비자 매개값만 있다.
		li.stream().map(fn).forEach(conVal);
		//답 : A. Val:20 Val:40 Val:60
	}

}
