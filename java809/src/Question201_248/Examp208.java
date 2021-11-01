package Question201_248;
class Vehhicle {
int distance; //line n1
Vehhicle (int x) {
this.distance = x;
}
public void increSpeed(int time) { //line n2
int timeTravel = time; //line n3
class Car {
int value = 0;
public void speed () {
value = distance /timeTravel;  // 60/100 = 0.6인데 value변수가 int형이기 떄문에 1로 나온다.
System.out.println ("Velocity with new speed"+value+"kmph");
}
}
new Car().speed();
}
}
public class Examp208 {

	public static void main(String[] args) {
		Vehhicle v = new Vehhicle (100);
		v.increSpeed(60);
	}

}


//답 Answer is "Velocity with new speed1kmph"
// 또는 위 선택지가 없다면 Velocity with new speed 이걸 선택해라
