package example05;
//독립클래스
public class Driver {

	//들어올 수 있는것은? -> new Taxi()이거나 new Bus()만 들어올 수 가 있다.
	//위 2개의 클래스가  Vehiclable인터페이스를 구현했기 때문에 들어올 수 가 있다.
	//인터페이스 매개변수의 다형성
	public void drive(Vehiclable vehiclable) {  //매개변수로 인터페이스가 들어온다는것은 Vehiclable로 구현한 클래스들만 들어올 수 있다.
 		vehiclable.run();
// 		System.out.println(vehiclable); //주소 출력
	}
	public void stop(Vehiclable vehiclable) {
		vehiclable.stop();
	}
	
	//리턴타입, 매개변수타입이 전부 Vehiclable인터페이스 타입이다.
	//그 말의 뜻 리턴타입도 구현클래스가 와야 하며, 매개변수 타입도 역시
	//구현클래스가 와야 한다.
	public Vehiclable newCar(Vehiclable vehiclable) {
		if(vehiclable instanceof Taxi) {
			System.out.println("새택시");
			Taxi taxi = (Taxi)vehiclable;
			return taxi;
		}
		else if(vehiclable instanceof Bus) {
			System.out.println("새 버스");
			Bus bus = (Bus)vehiclable;
			return bus;
		}
		return null;
	}
}
