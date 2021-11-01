package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Examp11 {

	public static void main(String[] args) {
		Stream<List<String>> iStr= Stream.of (
				Arrays.asList ("1", "John"),
				Arrays.asList ("2", null));
//				Stream<String> nInSt = iStr.flatMapToInt ((x) -> x.stream ());  
//				Stream<String>인데 객체를 flatMapToInt Int로 받기 때문에 컴파일에러가 발생
				Stream<String> nInSt = iStr.flatMap ((x)-> x.stream ());  //올바른 방법으로 컴파일하면 이렇게 된다.  1John2null
				nInSt.forEach (System.out :: print);
				
				
//				D. A compilation error occurs.
	}

}
