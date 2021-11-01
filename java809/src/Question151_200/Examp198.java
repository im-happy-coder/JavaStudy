package Question151_200;

import java.util.Arrays;
import java.util.List;

public class Examp198 {

	public static void main(String[] args) {
		List<String> codes = Arrays.asList("B","C","A","D");
		codes.parallelStream().forEach(s-> System.out.println(s)); //이것만 랜덤
		System.out.println("");
		codes.parallelStream().forEachOrdered(s1->System.out.println(s1)); // BCAD 순서대로 나옴
	}
	
//	C. ABCD // in random order BCAD
	
//	forEachOrdered스트림이 순차적인지 병렬인지에 관계없이 소스에서 지정한 순서대로 스트림 요소를 처리합니다.

}
