package clothing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Examp99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> st1 = Arrays.asList("A","B","C","D");
		Iterator<String> itr = st1.iterator();
		while(itr.hasNext()) {
			String e = itr.next();
			if(e=="C") {
				break;
			} else {
				System.out.println(e);
				continue;
			}
		}
	}

}
