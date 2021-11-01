package example02;

public class Car {
	
	String color; //색상
	String gearType; //변속기 종류
	int door;
	
	//기본 생성자
	//
	public Car() {
		//같은 클래스내에 있는 매개변수가 3개가 있는(순서하고 타입도 같아야함)생성자를 호출하는 구문
		//Ctrl누르고 this클릭하면 주소(위치)를 보여줌
		this("검정", "수동", 4);
		
		
		//직접적으로 인스턴스멤버변수를 초기화
//		this.color = "노랑";
//		this.gearType = "수동";
//		this.door = 4;
	}
	
	//this : 참조변수와 같은 역할, 매개변수와 멤버변수를 구분짓는데 사용
	//       반드시 this써서 명확하게 프로그램이 되도록 한다.
	
	public Car(String color, String gearType, int door) {
		this.color = color;
//		color = color; //변수의 모호성이 일어나서, 초기화 안이루어진다.
		this.gearType = gearType;
		this.door = door;
	}
	

	public Car(String color) {
		this.color = color;
	}
	public Car(String color, String gearType) {
		this.color = color;
		this.gearType = gearType;
	}
	public Car(int door) {
		this.door = door;
	}
	public Car(String color, int door) {
		this.color = color;
		this.door = door;
	}

	//인스턴스 복제를 위한 생성자
	public Car(Car c) { //Car 하고 c든 b든 a든 상관없다
		this.color = c.color;
		this.gearType = c.gearType;
		this.door = c.door;
	}
	
	
	@Override
	public String toString() {
		return this.color + ", " + this.gearType + ", " + this.door;
	}
}
