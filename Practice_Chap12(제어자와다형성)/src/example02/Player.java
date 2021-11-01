package example02;
//조상 클래스
public class Player {

	//멤버변수
	private String name;
	private int age;
	private int backNumber;
	private int speed;
	
	//생성자
	public Player(String name, int age, int backNumber, int speed) {
		super(); //Object 클래스의 생성자 호출(생략가능)
		this.name = name;
		this.age = age;
		this.backNumber = backNumber;
		this.speed = speed;
	}
	//getter메서드 제공
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getBackNumber() {
		return backNumber;
	}

	public int getSpeed() {
		return speed;
	}
	
	public void info() {
		System.out.println("이름 : " + this.getName());
		System.out.println("나이 : " + this.getAge());
		System.out.println("등번호 : " + this.getBackNumber());
		System.out.println("속도 : " + this.getSpeed());
	}
	
}
