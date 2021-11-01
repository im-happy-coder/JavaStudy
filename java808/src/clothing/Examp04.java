package clothing;

public class Examp04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ans;
		try {
			int num=10;
			int div=0;
			ans = num / div;
		} catch (ArithmeticException e) {
			ans=0;
		} catch (Exception e) {
			System.out.println("Invalid calcu");
		}
		System.out.println("Answer = "+ans);
	}

}
