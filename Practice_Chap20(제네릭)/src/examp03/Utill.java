package examp03;

public class Utill {
	
	//<T>는 제네릭 타입 메서드를 지칭하는 것이며, 리턴 타입과 매개변수 타입을 
	//동일하게 <T>타입으로 가져가야한다.
	//외부로 부터 T타입을 받아서 Person<T>라는 제네릭 클래스에 인스턴스를
	//생성하여 리턴을 해주는 역할을 하는게 아래 메서드다.
	public static<T> Person<T> changing(T t){
		
		Person<T> person = new Person<T>();
		person.setT(t);
		
		
		return person;
	}
	

}
