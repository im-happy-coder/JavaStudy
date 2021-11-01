package example03;

public class MemberPersonEx {

	public static void main(String[] args) {

		Member member = new Member();
		member.method();
		member.method1();
		System.out.println(A.MAX); //상수는 클래스명.정적  으로 사용한다 . 즉, 인터페이스명(A).상수명(MAX)로 사용한다.
		
		//인터페이스도 일종의 조상이다. 하여 다형성 개념이 적용된다.
		A a = new Member(); //인터페이스 필드의 다형성
		a.method();
		//a.method1(); 	//근본이 A이므로  Member클래스의 method1()은 호출불가
		
		Person person = new Person();
		person.method();
		person.method1();

		
		a = new Person();
		a.method();
	}

}
