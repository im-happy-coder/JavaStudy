package ExampTopic808;

public class Examp125 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int wd = 0;
		String days[] = {"sun","mon","wed","sat"};
		for(String s : days){
		switch (s) {
		case "sat":
		case "sun":
		wd -=1;
		break;
		case "mon":
		wd++;
		case "wed":
		wd +=2;

		}
		System.out.print(wd + " ");

		//Output = -1 2 4 3
		}
	}
}