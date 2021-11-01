package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class FExamp119 {

	public static void main(String[] args) {
		List<String> word = Arrays.asList("win", "try", "best", "luck", "do");
		Predicate<String> test1 = w-> {
			System.out.println("Checking...");
			return w.equals("do"); //line n1
		};
		Predicate<String> test2 = (String w) -> w.length() >3; //line n2  일때의 답 :Checking...Checking...
		Predicate test2 = (String w) -> w.length() >3; 	//line n2 일떄의 답 : D. A compilation error occurs at line n2.
		word.stream().filter(test2).filter(test1).count();
		
		//항상 문제를 볼 때는 제네릭타입이 일치하고 맞는지 확인하자
	}

}
