package examp03;

import java.util.Arrays;
import java.util.stream.Stream;

public class MappingEx2 {

	public static void main(String[] args) {
//		중간연산 
//		맵핑(Mapping) 예제1:
		Stream<String> ss1 = Stream.of("MY_AGE", "YOUR_LIFE");
		
		//아래 람다식에서 스트림을 생성
		Stream<String> ss2 = ss1.flatMap(s-> Arrays.stream(s.split("_"))); // "_"를 기준으로 문자열을 쪼개라, 쪼갠 후 배열에 담아서 반환을 해줌(쪼갠 후 concat이루어짐)
//		스트림이 MY AGE 1나와 YOUR LIFE 1나 해서 2개의 스트림이 만들어진거고 
//		이렇게 다수의 스트림이 만들어져서 flatMap은 1:* 맵핑이 이루어지는 거다
		ss2.forEach(s->System.out.print(s+ "\t"));
		System.out.println();

	}

}
