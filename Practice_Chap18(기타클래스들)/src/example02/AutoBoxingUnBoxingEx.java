package example02;

import java.util.List;
import java.util.Vector;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		//Integer는 Wrapper 포장 클래스이며 객체클래스이다.
		//자동 박싱 코드
		Integer obj1 = 100;
		Integer obj2 = 300;
		
		
		List list = new Vector(); //List는 인터페이스 타입이다. Ctrl+shift+O 단축키를 눌러서 import java.util.List; 해줘야함
		list.add(obj1);
		list.add(obj2);
		list.add(500); //바로 500이란 숫자를 넣어도 된다 이유는 ? -> list.add(new Integer(500))가 같다
		System.out.println(list);
		
		//list.get()은 가로안에 숫자가 0이면 0번째 인덱스를 가져온다
		int value1 = (Integer)list.get(0); //.get()메서드는 리턴타입이 <>엘레먼트 타입이라서 integer로 강제캐스팅 해야한다.
		System.out.println(value1);
		
		//.intValue()는 Integer 객체에서 int형 값을 가져오는 메서드 
		int value2 = obj2.intValue(); //정상코드
		int value3 = obj2; //자동 언박싱이 허용이 되기때문에 이 코드도 사용가능하다.
		System.out.println(value2);
		System.out.println(value3);
		
		//객체 + 기본타입은 문법(syntax)에러이다. 하지만 포장(wrapper)클래스이기 때문에 컴파일러가 알아서
		//자동 언박싱 해서 아래와 같은 코드가 가능하다.
		int result = obj1 + 500;
		System.out.println(result);
	}

}
