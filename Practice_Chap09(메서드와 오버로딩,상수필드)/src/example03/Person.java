package example03;

public class Person {
	
	//static final = 불변의 정적상수
	//static final은 무조건 선언과 동시에
	//초기화 해야 한다. 무조건!
	//공용데이터로써 사용되어지고 있다 (주소를 공유하기 때문에)
	//클래스별로 관리되어진다.
	static final int MAX_NUMBER = 1000;  
			
	
	
	//final 초기화 방법 2가지
	//1.선언과 동시에 초기화 하는 방법
	//2.생성자에서 단 한번 초기화
	final String nation = "KOREA"; //(선언과 동시에 초기화)상수선언
	final int age;  //아래 생성자를 만들고 초기화함 
	//생성자
	public Person(int age) {
		this.age = age;
	}
	
//@Override
//public String toString() {
//		return "nation : " + this.nation + ", age : " + this.age;
//	}
}
