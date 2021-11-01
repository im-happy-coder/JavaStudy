package Question151_200;

import java.util.Arrays;
import java.util.List;

public class Examp196 {

	public static void main(String[] args) {
		List<String> empDetails = Arrays.asList("100, Robin, HR", "200, Mary, AdminServices","101, Peter, HR");
		empDetails.stream()
		.filter(s-> s.contains("r")) //대소문자 구분한다.
		.sorted()
		.forEach(System.out::println); //line n1
	}

}
//contains() 메소드는 어떤 문자열에 특정 문자열이 포함되어 있는지 확인해준다. 
//특정 문자열이 있다면 true를, 없다면 false를 반환한다. 
//단, 대소문자를 구분하기 때문에, 대소문자 구분 없이 확인하고 싶다면 toUpperCase()나 toLowerCase()를 사용하자

//답 :101, Peter, HR 200, Mary, AdminServices
