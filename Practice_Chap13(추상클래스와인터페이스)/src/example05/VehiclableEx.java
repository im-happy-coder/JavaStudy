package example05;

public class VehiclableEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		bus.setSpeed(-50);
		bus.setSpeed(80);
		//직접 만들어서 참조변수(주소)를 넘기는 것
		driver.drive(bus);
		driver.stop(bus);
		
		
		System.out.println();
		
		
		taxi.setSpeed(-70);
		taxi.setSpeed(120);
		//직접 만들어서 참조변수(주소)를 넘기는 것
		driver.drive(taxi);
		driver.stop(taxi);
		
		System.out.println();
		
		
		//이렇게 직접 매개변수를 생성하여 넘기는 방법
		driver.drive(new Taxi());
		driver.drive(new Bus());
		
		//여기서 컴파일 예외가 발생하는 이유는 ?
//		driver.drive(new AICar()); //  Vehiclable인터페이스를 구현하지 않았기 때문이다.
		
		
		System.out.println();
		
		//리턴타입으로 받는 매개변수 활용
		Vehiclable vehiclable = driver.newCar(new Taxi());
		vehiclable.setSpeed(60);
		vehiclable.run();
		vehiclable.stop();
		
		System.out.println();
		
		vehiclable = driver.newCar(new Bus());
		vehiclable.setSpeed(12);
		vehiclable.run();
		vehiclable.stop();

	}

}
