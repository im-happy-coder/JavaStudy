package Question121_150;

import java.util.stream.Stream;

public class Examp143 {

	public static void main(String[] args) {
//		Which two code fragments, when inserted at line n1 independently, result in the output PEEK: Unix?
		Stream.of("Java", "Unix", "Linux")
		.filter(s->s.contains("n"))
		.peek(s->System.out.println("PEEK:"+s))
		.findFirst();//line n1 //즉, n이 포함된 Unix가 제일 먼저 나왔기떄문 먼저 소환됨
//			.findAny();
	}
	
	//답 : E. .findFirst (); C. .findAny ();

}
/*
1. anyMatch() : 해당 스트림의 일부 요소가 특정 조건을 만족할 경우에 true를 반환함.

2. allMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족할 경우에 true를 반환함.

3. noneMatch() : 해당 스트림의 모든 요소가 특정 조건을 만족하지 않을 경우에 true를 반환함.

findFirst()와 findAny() 메소드는 해당 스트림에서 첫 번째 요소를 참조하는 Optional 객체를 반환합니다.
*/