package Question201_248;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Examp229 {

	public static void main(String[] args) {
		List<Integer> nums = Arrays.asList (10, 20, 8);
			System.out.println ( nums.stream().max(Comparator.comparing(a -> a)).get()
			//line n1
			);
//			Optional<T> max(Comparator<? super T> comparator);
			
//			line n1 to enable the code to print the maximum number in the nums list?
//					Which code fragment must be inserted at
			
//			A. nums.stream().max(Comparator.comparing(a -> a)).get()  -- Á¤´ä
//			B. nums.stream().max(Integer : : max).get()
//			C. nums.stream().max()
//			D. nums.stream().map(a -> a).max()
	}

}
