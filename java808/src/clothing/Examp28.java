package clothing;

public class Examp28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n [][] = {{1,3},{2,4}};
		for(int i=n.length-1; i>=0; i--) {
//			for(int j=n[i].length-1;j>=0;j--) {
//				System.out.println(n[i][j]);
//			}
			for(int y : n[i]) {
				System.out.println(y);
			}
		}
	}

}
