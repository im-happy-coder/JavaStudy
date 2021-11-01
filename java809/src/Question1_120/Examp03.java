package Question1_120;

import java.util.Arrays;
import java.util.List;

public class Examp03 {

	public static void main(String[] args) {
		List<Integer> values = Arrays.asList (1, 2, 3);
		values.stream ()
		.map(n -> n*2) //line n1
		.peek(System.out::print) //line n2
		.count();  //자바8에서는 터미널 작업으로 작동해서 값이 출력된다.   //자바9부터는 출력이 안된다.
		
		
		//답: 2 4 6
	}

}
