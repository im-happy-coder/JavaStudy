package clothing;

public class Examp194 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Java";
		String str2 = new String("java");
		str1.toLowerCase();
		if(str1.equals(str2)) {
//		if(str2.equals(str1.toLowerCase())) {
			System.out.println("Equls");
		} else {
			System.out.println("not equals");
		}
	}

}
