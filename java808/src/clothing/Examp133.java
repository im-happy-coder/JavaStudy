package clothing;

import java.util.ArrayList;
import java.util.List;

class Patien {
	String name;
	public Patien(String name) {
		this.name = name;
	}
}
public class Examp133 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ps = new ArrayList();
		Patien p2 = new Patien("Mike");
		ps.add(p2);
		
		int f = ps.indexOf(p2);
		if(f >= 0 ) {
			System.out.println("Mike Found");
		}
	}

}
