package clothing;

public class Examp165 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names[] = {"Thomas", "Peter", "Joseph"};
		String pwd[] = new String[3];
		int idx=0;
		try {
			for(String n : names) {
				pwd[idx] = n.substring(2,6);
				System.out.println(pwd[idx]);
				idx++;
			}
		}catch (Exception e) {
			System.out.println("Invail name");// TODO: handle exception
		}
	}

}
