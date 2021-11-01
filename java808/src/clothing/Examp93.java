package clothing;

public class Examp93 {
	String myStr = "7007";
	public void doStuff(String str) {
		int myNum=0;
		try {
			String myStr=str;
			myNum=Integer.parseInt(myStr);
		} catch (NumberFormatException ne) {
			// TODO: handle exception
			System.err.println("Error");
		}
		System.out.println(
				"mystr:"+myStr+", mynum"+myNum);
	}

	public static void main(String[] args) {
		Examp93 obj = new Examp93();
		obj.doStuff("9009");
		// TODO Auto-generated method stub
//		Examp93 obj = Examp93();
//		obj.doStuff("9009");

	}

}
