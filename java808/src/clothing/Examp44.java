package clothing;

import java.util.ArrayList;
import java.util.List;

public class Examp44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		List colors = new ArrayList();
		colors.add("green");
		colors.add("blue");
		colors.add("red");
		colors.add("yellow");
		colors.remove(2);
		colors.add(3, "cyan");
		System.out.println(colors);
	}

}
