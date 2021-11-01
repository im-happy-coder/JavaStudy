package Question1_120;

class Engine{
	double fuelLevel;
	public Engine(int fuelLevel) { this.fuelLevel = fuelLevel;
	}
	public void start() {
//		assert fuelLevel < 0: System.exit(0); //line n1
		assert fuelLevel > 0: "Impossible fuel";//line n1   --- assert는 false일때 값을 출력
		System.out.println("Started");
	}
	public void stop() {System.out.println("Stopped");}
}
public class FExamp102 {

	public static void main(String[] args) {
//		✑ engine의 fuelLevel은 start () 메서드가 호출 될 때 0보다 커야합니다.
//		✑ 엔진 연료량이 0 이하이면 코드를 종료해야합니다.
////		이 불변 조건을 표현하기 위해 n1 줄에 어떤 코드 조각을 추가해야합니까?
//		✑ fuelLevel of Engine must be greater than zero when the start() method is invoked.
//		✑ The code must terminate if fuelLevel of Engine is less than or equal to zero.
//		Which code fragment should be added at line n1 to express this invariant condition?
		
		Engine en = new Engine(0);
		en.start();
	}

}
//답 : 	assert fuelLevel > 0: "Impossible fuel";//line n1