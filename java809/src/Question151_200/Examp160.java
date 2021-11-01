package Question151_200;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Employees {
	String dept, name;
	public Employees(String dept, String name) {
		super();
		this.dept = dept;
		this.name = name;
	}
	@Override
	public String toString() {
		return getDept() + ":" + getName();
	}
	public String getDept() {
		return dept;
	}
	public String getName() {
		return name;
	}
}
public class Examp160 {
	public static void main(String[] args) {
		List<Employees> emps = Arrays.asList(new Employees("sales", "Ada"), 
								new Employees("sales", "Bob"),
								new Employees("hr", "Bob"),
								new Employees("hr", "Eva"));
		Stream<Employees> s = emps.stream()
				.sorted(Comparator.comparing((Employees e) -> e.getDept()) //getDept를 알파벳순서로 1기준을 제시함
						.thenComparing((Employees e) -> e.getName())); // 그다음 getName를 알파벳순서로 2기준을 제시함
		List<Employees> eSorted = s.collect(Collectors.toList());
		System.out.println(eSorted);
//		e.getDept()이 먼저나오고, then에 e.getName()가 올때의 답		
//		답 : D. [hr:Bob, hr:Eva, sales:Ada, sales:Bob]
		
//		e.getName()이 먼저나오고, then에 e.getDept()가 올때의 답
//		답 : A. [sales:Ada, hr:Bob, sales:Bob, hr:Eva]
	}

}
