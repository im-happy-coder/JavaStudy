package examp01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex4 {

	public static void main(String[] args) {
		 List<String> strings =
		            Arrays.asList( "Stream","Operations","on","Collections");
		        Collections.sort(strings, String::compareTo);
		        System.out.println(strings.get(0));
		        
		        
//		        String::compareTo 입니다. 유효한 메서드 참조입니다. 때문에 compareTo자연 순 정렬 ( A, B, C등) "Collections"의 첫 번째 요소가된다 List.
	}

}
