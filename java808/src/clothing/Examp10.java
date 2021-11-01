package clothing;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Examp10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> st = Arrays.asList("EN","FR","CH","JP");
		Iterator<String> itr = st.iterator();
		while(itr.hasNext()) {
			String e = itr.next();
			if(e == "CH") {
				break;
			}
			System.out.println(e+" ");
		}
	}

}
