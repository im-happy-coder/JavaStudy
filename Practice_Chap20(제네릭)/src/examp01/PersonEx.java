package examp01;

public class PersonEx {

	public static void main(String[] args) {
		
		//Person제네릭클래스에 T를 String만 들어오게끔 무조건 만들었다.
		Person<String> person1 = new Person<>();
		person1.setT("홍길동");  //업캐스팅 String->Object 자손이 조상으로... 타입캐스팅 생략가능
		String str1 = person1.getT(); //다운 캐스팅 (Object->String)
		System.out.println(str1);    
		//캐스팅이 자주 일어나면 성능 저하의 주 원인
		
		//현업에서는 데이터의 통일화, 타입변환 제거, 컴파일 시 예외 발생
		
		Person<Integer> person2 = new Person<>();
//		person2.setT(new Integer(100)); //박싱 안한것
		person2.setT(100); //자동 박싱
		int value1 = person2.getT(); //자동 언박싱 코드
		System.out.println(value1); 
		
		Person<Apple> person3 = new Person<>();
		person3.setT(new Apple());
		Apple apple = person3.getT(); 
		System.out.println(apple); 
	}

}
