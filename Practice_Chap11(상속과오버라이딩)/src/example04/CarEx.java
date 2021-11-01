package example04;

public class CarEx {

	public static void main(String[] args) {


		Car car = new Car(80);
		car.speedup();
		car.speedDown();
		car.stop();
		
		SportCar sportCar = new SportCar(150);
		sportCar.speedup(); //조상 클래스의 speedUP을 호출  (상속)
		sportCar.speedDown();//조상 클래스의 speedDown을 호출  (상속)
		sportCar.stop(); //자손 클래스(sportCar)의 오버라이딩한 stop()을 호출함
	}

}
