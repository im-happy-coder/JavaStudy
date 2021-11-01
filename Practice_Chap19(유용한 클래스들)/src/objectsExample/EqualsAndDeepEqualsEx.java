package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class EqualsAndDeepEqualsEx {

	public static void main(String[] args) {
		//얖은 비교 equals , 깊은 비교 Deepequals
		
		Integer integer1 = new Integer(100);
		Integer integer2 = new Integer(100);
		
		
		//Object의 equals()는 기준이 되는 객체가, 비교가 되어지는 객체 따로 분리가 되어 있는 형태
		//모든 wrapper(포장)클래스에서는 Object클래스의 equals()오버라이딩이 되어 있다!
		//equals() -> integer1가 기준이 되고 integer2와 비교한다.
		System.out.println(integer1.equals(integer2)); 
		
		
		//Objects의 equals()는  비교하는 2대상만 매개변수로 주면 된다. -- 유지보수 혹은 개발 유리
		//Objects.equals -> 누가 기준이고 누가 비교고 이런 기준이 없다
		System.out.println(Objects.equals(integer1, integer2)); //얕은 비교
		
		Integer[] arr1 = {new Integer(10), new Integer(50)};
		Integer[] arr2 = {new Integer(10), new Integer(50)};
		
		//Objects.equals()는 매개변수가 참조타입이 들어오면 주소를 비교한다 그래서 얕은비교가 된다.
		System.out.println(Objects.equals(arr1, arr2)); //얕은 비교 = 주소비교~
		
		//Objects.deepEquals는 매개변수로 배열이 들어오면 깊은 비교이며 항목 값까지 비교를 한다 deepEquals
		System.out.println(Objects.deepEquals(arr1, arr2)); //깊은 비교 (deepEquals)= 값 비교
		System.out.println(Arrays.deepEquals(arr1, arr2)); //배열클래스인 Arrays도 똑같이 deepEquals 깊은비교를 지원한다.
	}

}
