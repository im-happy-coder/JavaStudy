package Question1_120;

import java.util.Optional;

public class FExamp104 {
	public static Optional<String> getCountry(String loc){
		Optional<String> couName = Optional.empty();
		if("Paris".equals(loc))
			couName = Optional.of("France");
		else if("Mumbai".equals(loc))
			couName=Optional.of("India");
		return couName; // 둘다 없다면 couName를 리턴,, 즉 empty()빈값을 리턴
	}
	public static void main(String[] args) {
		Optional<String> city1 = getCountry("Paris");
		Optional<String> city2 = getCountry("Las vegas");
		System.out.println(city1.orElse("NOT Found")); //city1은 France가 존재하므로 이값을 출력,,, 만약없다면 NOT Found가 출력됨
		if(city2.isPresent()) //city2는 내용이 없기때문에 false를 반환
			city2.ifPresent(x-> System.out.println(x));
		else
			System.out.println(city2.orElse("Not Found")); //내용이 없어서 Not Found를 출력
		
		//답은 : France		Not Found

	}

}
/*
orElse() 메소드 : 저장된 값이 존재하면 그 값을 반환하고, 값이 존재하지 않으면 인수로 전달된 값을 반환함.
orElse는 null이던말던 항상 불립니다.
orElseGet은 null일 때만 불립니다.


 isPresent()는 내용이 있다면 true 없다면 false
*/