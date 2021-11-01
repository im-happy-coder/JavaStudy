package Question1_120;

class Vehicle{
	int distance;
	Vehicle(int x) {
		this.distance = x;
	}
	public void increSpeed(int time) {
		int timeTravel = time; //line n1
		//line n3
		class Car{
			int value = 0;
			public void speed() {
				value = distance/timeTravel; //line ne2
				System.out.println("Velocity with new speed" + value + "kmph");
					}
				}
				speed(); //line n3 //new Car().speed();         //메서드안에 이너클래스에서 메서드를 호출하려면 new Car().speed();이렇게 해야한다.
		}
}
	

public class Examp01 {
	public static void main(String[] args) {
		 Vehicle v = new Vehicle(100);
		 v.increSpeed(60);
		 
		 
		 //new Car().speed();를 해주면 결과가 Velocity with new speed1kmph 가나온다.
		 
		 
		 
		 //그냥 speed()만 있으면 답은  D. A compilation error occurs at line n3.
		 
	}

}
