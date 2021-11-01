package Question121_150;

import java.util.Arrays;
import java.util.List;

class Persons {
	private String FirstName;
	private int salary;
	public Persons(String fN, int sal) {
		super();
		this.FirstName = fN;
		this.salary = sal;
	}
	public int getSalary() {
		return salary;
	}
	public String getFirstName() {
		return FirstName;
	}
	
}
public class Examp145 {
	public static void main(String[] args) {
		List<Persons> prog = Arrays.asList(
				new Persons("Smith", 1500),
				new Persons("John", 2000),
				new Persons("Joe", 1000)); 
		
		double dVal = prog.stream()
				.filter(s->s.getFirstName().startsWith("J"))
				.mapToInt(Persons::getSalary)
				.average()
				.getAsDouble();
		System.out.println(dVal);
	}
}
//3000 / 2 = 1500이니까 평균이
// 답 : B. 1500.0