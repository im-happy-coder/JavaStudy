package Question201_248;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Empp {
String fName;
String lName;
public Empp (String fn, String ln) {
fName = fn;
lName = ln;
}
public String getfName() { return fName; }
public String getlName() { return lName; }
}

public class Examp221 {

	public static void main(String[] args) {
		List<Empp> emp = Arrays.asList (
				new Empp ("John", "Smith"),
				new Empp ("Peter", "Sam"),
				new Empp ("Thomas", "Wale"));
				emp.stream()
				.sorted (Comparator.comparing(Empp::getfName).reversed().thenComparing(Empp::getlName))//line n1
				.collect(Collectors.toList());
				
//				fName and then ascending order of lName?
//			Which code fragment, when inserted at line n1, sorts the employees list in descending order of
				
				//´ä :A. .sorted (Comparator.comparing(Emp::getfName).reserved().thenComparing(Emp::getlName))
	}

}
