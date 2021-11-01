package clothing;

public class Examp156 {
	static int count=0;
	int i=0;
	public void changeCount() {
		while(i<5) {
			i++;
			count++;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Examp156 chek1 = new Examp156();
		Examp156 chek2 = new Examp156();
		chek1.changeCount();
		chek2.changeCount();
		System.out.println(chek1.count+" :" + chek2.count);
	}

}
