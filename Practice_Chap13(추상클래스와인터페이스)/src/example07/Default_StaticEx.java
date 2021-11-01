package example07;

public class Default_StaticEx {

	public static void main(String[] args) {
		
		MyInterface mInterface = new Person();
		mInterface.dmethod();//디폴트메서드
		mInterface.method(); //추상메서드
		
		MyInterface.smethod();//인터페이스의 정적메서드 호출 -> 인터페이스명.정적메서드명 
	}

}
