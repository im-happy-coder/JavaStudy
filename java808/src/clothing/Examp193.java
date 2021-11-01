package clothing;

import java.util.ArrayList;
import java.util.List;

public class Examp193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("Robb");
		names.add("Bran");
		names.add("Rick");
		names.add("Bran");
		names.add("Jon");
		
		for(String i : names) {
			System.out.println(i);
		}
		if(names.remove("Bran")) {
			names.remove("Jon");
		}
		System.out.println(names);

	}

}
