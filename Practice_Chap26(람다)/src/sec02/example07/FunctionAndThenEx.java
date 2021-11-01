package sec02.example07;

import java.util.function.Function;

public class FunctionAndThenEx {
	public static void main(String[] args) {
		
		//AndThen 실행 순서가 차례대로
		
		
		//Function<T,R>함수적인터페이스는 T를 매개값으로 주고, R로 매핑하여 리턴해준다.
		//apply()추상메서드를 가지고 있다.
		//결과는 AndThen()를 통해서 People를 주면 String을 얻는 결과가 나온다.
		//여기서 Address는 functionA의 리턴값으로 나왔다면 functionB의 매개값으로 사용되어지고, 결과 값이 country가 나오도록 중심축 역할을 하는 것이다.
		Function<People, Address> functionA = p -> {return p.getAddress();};
		Function<Address, String> functionB = a -> {return a.getCountry();};
		Function<People, String> functionAB = functionA.andThen(functionB);
		String country = functionAB.apply(new People("김기덕", "id132", new Address("대한민국", "대구")));
		System.out.println("국적 : " + country);
		
		
		
		//composer는 실행순서가 반대로
		functionAB = functionB.compose(functionA);
		country = functionAB.apply(new People("김기덕", "id132", new Address("대한민국", "대구")));
		System.out.println("국적 : " + country);
	}
}
