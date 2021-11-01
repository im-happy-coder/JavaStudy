package example01;

//상속을 하는 이유
//1. 공통된 코드는 조상에서 관리
//2. 개별적인 부분은 자손에서 따로 관리
//3. 코드의 재사용성

//상속은 직접적 관계
public class MoutainBicycle extends Bicycle {
	//멤버 개수 : 5개
	String frame;
	int gear;
	int price;
	String sector;
	
	public void print() {
		System.out.println("id : " + this.id);
		System.out.println("brand : " + this.brand);
		System.out.println("frame : " + this.frame);
		System.out.println("gear : " + this.gear);
		System.out.println("price : " + this.price);
		System.out.println("owner : " + this.owner);
		
	}
	public static void main(String[] args) {
		MoutainBicycle moutainBycle = new MoutainBicycle();
		moutainBycle.id = 1111;
		moutainBycle.brand = "LESPO";
		moutainBycle.frame = "알루미늄";
		moutainBycle.gear = 33;
		moutainBycle.price = 300000;
		moutainBycle.owner = "홍길동";
		
		moutainBycle.print();
	}
}
