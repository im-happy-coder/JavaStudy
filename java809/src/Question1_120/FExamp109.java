package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FExamp109 {

	public static void main(String[] args) {
		Stream<List<String>> strs = Stream.of(Arrays.asList("text1", "text2"),
				Arrays.asList("text2","text3"));
		
		Stream<String> bs2 = strs.filter(b->b.contains("text1")).flatMap(rs->rs.stream());
		bs2.forEach(b->System.out.println(b));
				
	}

}


//contains가 text2이면 text1 text2 text2 text3 출력


//contains가 text1이면 포함된 text1을 전부 출력한다---- 답 : text1text2


// text2면 해당하는 모든 것을 출력한다.text1text2text2text3