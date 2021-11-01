package example03;

public class InstanceOf {

	public static void main(String[] args) {
		
		//Ctrl + T는 누르면 상속계층도를 볼 수 있는 단축키이다.
		SportCar sportcar = new SportCar();
		
		if(sportcar instanceof SportCar) {
			System.out.println("SportCar로 타입변환이 가능합니다");
		}
		if(sportcar instanceof Car) { //조상이니까 가능
			System.out.println("Car로 타입변환이 가능합니다.");
		}
		if(sportcar instanceof Object) { //Object최고 최상위 조상이니까 가능
			System.out.println("Object로 타입변환이 가능합니다.");
		}
		//instanceof는 boolean과 같다 (true 아니면 false이다)
		//instanceof연산자의 결과가 true이라는 것은 실제 형변환이 가능하다
	}

}
