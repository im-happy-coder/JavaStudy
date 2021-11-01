package clothing;

public class Examp30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] intArr = {15, 30, 45, 60, 75};
		intArr[2] = intArr[4];
		intArr[4] = 90;
		
		for(int a : intArr) {
			System.out.println(a);
		}
	}

}
