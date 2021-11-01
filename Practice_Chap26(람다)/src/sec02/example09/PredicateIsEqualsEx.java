package sec02.example09;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateIsEqualsEx {

	public static void main(String[] args) {
//		Predicate<String> predicate = null;
		Predicate<Object> predicate = null;
		boolean result = false;
		
		
		Object obj = new Object();
		Object obj2 = new Object();
		
		System.out.println(Objects.equals(obj, obj2)); //번지 비교
		
		
		
		//Predicate.isEqual()는 정적 메서드로써, 두 객체의 값을 비교한다.
		//둘 다 null이면 true가 나온다.
		predicate = Predicate.isEqual(null);
		result = predicate.test(null);
		System.out.println("두 객체가 Null일 떄 : " + result);
		
		predicate = Predicate.isEqual(null);
		result = predicate.test("신은혁");
		System.out.println("하나는 null이고 하나는 String타입의 신은혁  : " + result);
		

		//아래의 코드 두개는 원래는 번지(주소)를 비교한다.
		predicate = Predicate.isEqual("신은혁");
		result = predicate.test("신은혁");
		System.out.println("두 객체가 String타입의 신은혁 일 때 : " + result);
		
		
		
		//Object
		//Objects.equals("신은혁", "신은혁")과 아래 코드는 같다.
		predicate = Predicate.isEqual("신은혁");
		result = predicate.test("신은혁");
		System.out.println("두 객체가 Objct일 때 : " + result);
		
		
		
		System.out.println(Objects.equals("신은혁", "신은혁")); //이것은 값을 비교
		
		
		//위의 코드들은 대용량 데이터를 나중에 맵핑하고 정렬하고 null값은 비교대상에서 걸러내고 해야되기 때문에 함수적 인터페이스를 
		//선언하고 사용하면 편리한 점과 코드의 간결성이 좋아진다.
	}
}
