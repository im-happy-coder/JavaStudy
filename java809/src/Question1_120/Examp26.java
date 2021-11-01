package Question1_120;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Emp {
String fName;
String lName;
public Emp (String fn, String ln) {
	fName = fn;
	lName = ln;
}
public String getfName() { return fName; }
public String getlName() { return lName; }
}
public class Examp26 {

	public static void main(String[] args) {
		List<Emp> emp = Arrays.asList (
				new Emp ("John", "Smith"),
				new Emp ("Peter", "Sam"),
				new Emp ("Thomas", "Wale"));
				emp.stream()
				.sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))
				.collect(Collectors.toList());
			
				//getfName은 내림차순 정렬
				//getlName은 오름차순 정렬
//				a b c d e f g h i j k l m n o p q r s t u v w x y z
				Iterator<Emp> iter = emp.iterator();
				while(iter.hasNext()) {
					Emp emp2 = iter.next();
					System.out.println(emp2.getfName());
					System.out.println(emp2.getlName());
				}
	}

}
