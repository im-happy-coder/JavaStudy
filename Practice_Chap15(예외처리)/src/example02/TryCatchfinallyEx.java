package example02;

public class TryCatchfinallyEx {

	public static void main(String[] args) {
		//일반예외
		//Class 클래스는 문자열을 가지고 클래스로 만들어서 반환을 해준다.(동적 객체)
		//인스턴스의 정보만 알뿐이지 멤버를 사용하는 것은 안된다.
		try {
			Class class1 = Class.forName("java.lang.String");  //예외가 발생하지 않는다 // java.lang.String 클래스는 존재한다.
//			Class class1 = Class.forName("java.lang.String2"); //예외가 발생한 경우 //java.lang에 String2 클래스가 없으므로 예외발생한다.
			System.out.println("클래스를 찾았습니다.");
			System.out.println(class1.getName()); //getName()은 패키지 + 클래명 출력  //현재 클래스의 패키지 포함해서 클래스명을 호출해준다.
			System.out.println(class1.getSimpleName()); //getSimpleName()은 클래스명만 출력
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 없습니다.");
		}finally {  //finally는 예외가 발생하든 하지않든 무조건 실행한다 //옵션(생략가능), 항상 실행
 			System.out.println("프로그램을 안전하게 종료합니다.");
		}

	}

}
