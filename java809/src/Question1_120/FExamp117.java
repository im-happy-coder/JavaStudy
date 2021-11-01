package Question1_120;

import java.util.Arrays;
import java.util.List;

public class FExamp117 {

	public static void main(String[] args) {
		List<String> valList = Arrays.asList("","George","","John","Jim");
		Long newVal = valList.stream() //line n1
				.filter(x->!x.isEmpty())  // ""이 아닌 것의 갯수를 구하는 스트림이다.  답: B. 3
				.count(); //line n2    
		System.out.println(newVal);
		
		//Long이 아니면 에러남 ---- count()의 반환값이 long이기 때문이다.
	}

}
