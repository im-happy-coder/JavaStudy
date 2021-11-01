package Question1_120;


enum Course { JAVA(100), J2ME(150);
	private int cost;
	Course(int c) {
		this.cost = c;
	}
	int getCost() {
		return cost;
	}
}
public class Examp98 {

	public static void main(String[] args) {
		
		for(Course a : Course.values()) {
			System.out.println(a + "Fees " + a.getCost()+ "  ");
		}
	}

}

//사진 참고

// 답은 D