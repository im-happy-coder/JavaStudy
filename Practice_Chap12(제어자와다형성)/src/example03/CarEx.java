package example03;

public class CarEx {

	public static void main(String[] args) {
		Car car = null;
		SportCar sportCar1 = new SportCar();
		SportCar sportCar2 = null;
		PoliceCar policeCar = new PoliceCar();
		
		
		sportCar1.speedUp();
		
		car = sportCar1; //업캐스팅(자손->조상), 조작할 수 멤버가 줄어든다.
//		car.speedUp(); //여기서 컴파일예외가 발생 이유 ?  car클래스에 speedUp()메서드가 없기때문에 오류발생
		
		//다운캐스팅할 때, 반드시 명시적으로 형변환 코드를 작성해야함
		sportCar2 = (SportCar)car; //다운캐스팅(조상->자손), 조작할수 있는 멤버가 늘어난다. 
		sportCar2.speedUp();
		
//		sportCar1 = (SportCar)policeCar;  //서로 상속관계가 아니기 때문에 형변환이 절대 이루어질수 없음.
	}

}
