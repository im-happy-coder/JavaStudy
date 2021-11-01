package clothing;

public class Examp104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		String str2 = new String("java");
		str1.toLowerCase();
		if(str1.equals(str2)) {
			System.out.println("Equals");
		} else {
			System.out.println("Not Equals");
		}
	}

}
