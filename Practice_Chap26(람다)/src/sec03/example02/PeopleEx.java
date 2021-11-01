package sec03.example02;

import java.util.function.BiFunction;
import java.util.function.Function;

public class PeopleEx {

	public static void main(String[] args) {
			
		//람다식으로 생성자를 호출하여 인스턴스를 만들고 있다.
		Function<String, People> function1 = s -> {return new People(s);};
		People people = function1.apply("신은혁");
		System.out.println(people);
		
		System.out.println("-------------------------------");
		
		//생성자 참조
		function1 = People :: new;
		people = function1.apply("신은혁");
		System.out.println(people);
		
		
		System.out.println("-------------------------------");
		
		//람다식으로 생성자 호출하여 인스턴스를 만들고 있다. (2개짜리 생성자 호출)---최대 2개만 가능하다.
		BiFunction<String, Integer, People> function2 = (x,y) -> {return new People(x,y);};
		people = function2.apply("신은혁", 12);
		System.out.println(people);
		
		//생성자 참조
		function2 = People :: new;
		people = function2.apply("신은혁", 12);
		System.out.println(people);
		
//		생성자 참조는 멤버변수가 3개이상 있으면, 그에 적합한 3개 이상의 함수적 인터페이스도 있어야하는데 현재는 2개까지 밖에 없다...예) BiFunction
		
	}

}
