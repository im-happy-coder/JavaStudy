package clothing;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Examp149 {
	String name;
	int age;
	public Examp149(String n, int a) {
		// TODO Auto-generated constructor stub
		name = n;
		age = a;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	public static void checkAge(List<Examp149> list, Predicate<Examp149> predicate) {
		for(Examp149 p:list) {
			if(predicate.test(p)) {
				System.out.println(p.name + " ");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Examp149> iList = Arrays.asList(new Examp149("Hank", 45),
				new Examp149("Charlie", 40),
				new Examp149("Smith", 38));
		
		checkAge(iList, p->p.getAge()>30);
	}

}
