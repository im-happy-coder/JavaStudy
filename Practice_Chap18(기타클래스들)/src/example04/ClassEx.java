package example04;

public class ClassEx {

	public static void main(String[] args) {

		//객체로 부터 클래스 정보를 얻는 방법(getClass()-Object클래스에 있다)
		Person person = new Person();
		Class class1 = person.getClass(); //getClass(); = Object클래스임 -> 마우스 가져다 대면 볼수 있음
		System.out.println(class1.getName()); //getName() = 패키지명, 클래스명을 리턴함.
		System.out.println(class1.getSimpleName());//getSimpleName() =클래스명만 리턴함
		System.out.println();
		//문자열로부터 객체의 정보를 얻는 방법 (Class.forName() - Object아님 클래스객체에 있음)
		try {
			Class class2 = Class.forName("example04.Person");//forName()은 example04에 Person클래스가 있니? 라고 물어보는것
			System.out.println(class2.getName());
			System.out.println(class2.getSimpleName());		
		} catch (ClassNotFoundException e) {e.printStackTrace();} 
	}

}
