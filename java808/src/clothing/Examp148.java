package clothing;

public class Examp148 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = new char[3][3];
		grid[0][0] = 'X';
		grid[1][0] = 'X';
		grid[2][0] = 'X';
		
		grid[0][1] = 'X';
		grid[1][1] = 'X';
		grid[2][1] = 'O';
		
		grid[0][2] = 'X';
		grid[1][2] = 'X';
		grid[2][2] = 'X';
		
		
		for(char[] a : grid) {
		System.out.println(a);
		}
	}

}
