package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp180 {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("red", "green", "yellow");
		Predicate<String> test = n -> {
		System.out.println("Searching...");
		return n.contains("red");
		};
		colors.stream()
		.filter(c -> c.length() >= 3) //여기서 문자길이가 3이상인것만 골라냄
//		.forEach(System.out::print);  --즉 문자 3개가 다 일단 스트림에 들어가 있음
		.allMatch(test); //근데 여기서 allMatch()모두 만족해야함- 
		
		//즉 test를 실행하고 첫번째 값이 red true를 반환하기 때문에 그다음으로 test또 한번 실행함(총2번) 넘어가서 green도 contains함 여기서 false가 나왔기 떄문에
		//Serching은 2번을 출력하고 끝나는거임
		//만약 red가 2번째 인덱스에 있으면 Serching은 한번만 나온다.
		
		//또는 c.length() > 3이게 되면 red 문자길이가 3이기때문에  test는 한번실행하고 false를 반환하고 Serching은 한번만 출력된다.
	}

}
