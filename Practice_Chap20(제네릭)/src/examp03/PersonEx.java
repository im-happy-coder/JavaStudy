package examp03;

public class PersonEx {

	public static void main(String[] args) {
	
//		Person<Integer> p1 = Utill.<Integer>changing(new Integer(100));   	//정상적인 코드 Utill.<Integer> 인티저는 생략가능
//		Person<Integer> p1 = Utill.changing((100)); 이건 자동박싱
		
		Person<Integer> p1 = Utill.changing(new Integer(100)); 
		int value1 = p1.getT();
		System.out.println("Person객체가 가지고 있는 값 : " + value1);
		
		Person<String> p2 = Utill.changing("홍길동");
		String value2 = p2.getT();
		System.out.println("Person객체가 가지고 있는 값 : " + value2);
	}

}
