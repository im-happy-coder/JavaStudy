package Question121_150;

import java.util.Arrays;
import java.util.List;

public class Examp129 {

	public static void main(String[] args) {
		List<String> nums = Arrays.asList("EE", "SE");
		String ans = nums.parallelStream().reduce("Java", (a,b)->a.concat(b));
		System.out.println(ans);
		
		
		
//	병렬 스트림일 경우	D. Java EEJava SE
		
		//만약 병렬 스트림이 없고 일반 스트림이면, 답이 : JavaEESE

	}

}
