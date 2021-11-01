package example02;

public class BoxingUnBoxingEx {

	public static void main(String[] args) {
		//박싱(Boxing)코드 --> 객체화 시킨다.
		Integer obj1 = new Integer(100); //integer가 new를 통해 객체가 생성됨
		Integer obj2 = new Integer("100"); // 애는 ""를 해도 숫자로 인식한다.
		Integer obj3 = Integer.valueOf(100);
		Integer obj4 = 100; //자동 박싱(Auto-Boxing)이 되는 코드 //클래스에 기본타입 100을 넣을 수 있냐 -> 컴파일 시 new Interger(100)로 바뀐다.
		System.out.println("박싱 후");
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(obj4);
		
		//언박싱(UnBoxing)코드 --> 객체를 기본값으로 바꾼다.
		int value1 = obj1.intValue(); //intValue()는 포장지에는 값을 꺼내는 역할을 한다.
		int value2 = obj2;  //자동 언박싱(Auto-UnBoxing)이 되는 코드
		int value3 = obj3;	//자동 언박싱(Auto-UnBoxing)이 되는 코드
		int value4 = obj4.intValue(); // .intValue()가 나온다는 것은 객체화가 되었다는 뜻이다.
		System.out.println("언박싱 후");
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		System.out.println(value4);
	}

}
