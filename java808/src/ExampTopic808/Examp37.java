package ExampTopic808;

public class Examp37 {

		static int count = 0;
		int i = 0;

		public void changeCount() {
		while (i < 5) {
		i++;
		count++;
		}
		}

		public static void main(String[] args) {

		Examp37 check1 = new Examp37();
		Examp37 check2 = new Examp37();
		check1.changeCount();
		check2.changeCount();
		System.out.println(check1.count + " : " + check2.count);

	}
}