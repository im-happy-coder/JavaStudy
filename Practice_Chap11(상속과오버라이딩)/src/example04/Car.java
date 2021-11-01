package example04;

public class Car {

	int speed;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(int speed) {
		this.speed = speed;
	}
	
	//final(마지막)이 메서드 앞에 붙으면 자손에서 오버라이딩을 할 수가 없다. private+final=오버라이딩 불가
	//메서드 앞에 final이 오면 마지막 메서드라고 생각하자.
	public final void speedup() {
		this.speed += 10;
		System.out.println("차가 " + this.speed + "속도로 달립니다.");
	}
	
	public void speedDown() {
		this.speed -= 10;
		System.out.println("차가 " + this.speed + "속도로 달립니다.");
	}
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
	
	
}
