package clothing;

class Vehicle{
	int x;
	 Vehicle() {
		 this(10);
	}
	 Vehicle(int x) {
		// TODO Auto-generated constructor stub
		 this.x=x;
	}
}
public class Examp189 extends Vehicle{
	int y;
	Examp189(){
		this(20);
//		super(10);
		
	}
	Examp189(int y){
		super(y);
		this.y=y;
	}
	public String toString() {
		return super.x+":"+this.y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle y = new Examp189(20);
		System.out.println(y);

	}

}
