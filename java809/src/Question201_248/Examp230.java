package Question201_248;
final class IceCream {
public void prepare() {}
}
class Cake {
public final void bake(int min, int temp) {}
public void mix() {}
}
class Shop {
private Cake c = new Cake ();
private final double discount = 0.25;
public void makeReady () { c.bake(10, 120); }
}
class Bread extends Cake {
public void bake(int minutes, long temperature) {}  //final 메서드는 재정의 할 수 없으며 오버로드 만 가능합니다.
//예시 public void bake(int minutes, long temperature) {} 타입을 long으로 바꿔주는 오버로드해서 가능
public void addToppings() {}
}


//C. A compilation error occurs in Bread
//최종 메서드는 재정의 할 수 없으며 오버로드 만 가능합니다.
public class Examp230 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
