package example02;

public class Student {  //클래스는 틀 -- 붕어빵 기계(설계도)
	//멤버변수(필드) = 인스턴스 변수  ,,, 인스턴스=객체,,,, 인스턴스생성=객체생성
	String name;
	int age;
	
//	public static String getName() {
//		return this.name;	//this는 static메서드나 클래스안에 사용할 수 없다.
//	}
	
	//Object클래스의 toString()를 오버라이딩(재정의)
	@Override
	public String toString() {
		//String str = "이름 : " + this.name + " , " + "나이 : " + this.age;
		
		//this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 비로소 활성화가 이뤄진다.)
		return "이름 : " + this.name + " , " + "나이 : " + this.age;
		//return str;
	}

}
