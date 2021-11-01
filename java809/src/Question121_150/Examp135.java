package Question121_150;
//class Vehicle{
//int id;
//public void start(){
//public class Engine{ int eNo = id;}  -- public이 붙을 수 없음
//}
//}


//이게 정답
class Computer{
	private Card card = new SoundCard();  
	private abstract class Card{}
	private class SoundCard extends Card{}
	}


//class Block{
//int bno;
//static class Counter{
//int locator;
//Counter(){ locator = bno;} -- static클래스 안에 인스턴스변수가 올수없음
//}
//}


// there is a reduction in visibility in the inherited move method
// 상속된 클래스에 가시성이 감소한다... 오답
class Product{
interface Moveable{void move();}
Moveable m = new Moveable() {
@Override
public void move() {
}
};
}



public class Examp135 {

	public static void main(String[] args) {
//		Which class definition compiles?
//어떤 클래스 정의가 컴파일됩니까?
	
	}

}
