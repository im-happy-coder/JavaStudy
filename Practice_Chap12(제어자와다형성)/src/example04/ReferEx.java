package example04;

public class ReferEx {

	public static void main(String[] args) {
		
		Parent parent = new Child();
		Child child = new Child();
		
		//멤버 변수는 자기클래스(근본)를 호출한다. 근본을 벗어나지 못함
		System.out.println(parent.x);
		System.out.println(child.x);
		
		//멤버 메서드는 현재 참조하고 있는 인스턴스에 영향을 받음
		parent.method();
		child.method();

		
		
//		parent.type(new Car());
		parent.type(new Child());
		//new Child()가  Parent클래스의 type()메서드에 Object obj로 넘어간다
		//Object클래스는 최상위 조상이기 때문에 성립된다.
		// if(obj(Child) instanceof Parent)는 Child가 Parent에 속하냐(상속됬는지) 물어보고
		// Child와 Parent가 관계에 속하면 true, 속하지않으면 false가 된다.
		// true이면 Parent parent = (Parent)obj 형변환이 시작되고
		//        Parent parent = (Parent)obj는  Parent parent = (Parent)Child와 같다 
		//         (자손->조상)= 업캐스팅 = 코드가 늘어남 = 형변환 코드 생략가능(써줘도됨)
		

	}

}
