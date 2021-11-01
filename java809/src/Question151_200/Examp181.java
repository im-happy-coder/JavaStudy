package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp{
private String eName;
private Integer eAge;

Emp(String eN, Integer eA) {
this.eName = eN;
this.eAge = eA;
}
public Integer getEAge () {return eAge;}
public String getEName () {return eName;}
}
public class Examp181 {

	public static void main(String[] args) {
		List<Emp>li = Arrays.asList(new Emp("Sam", 20), new Emp("John", 60), new Emp("Jim", 51));
		Predicate<Emp> agVal = s -> s.getEAge() <= 60; //line n1 
		li = li.stream().filter(agVal).collect(Collectors.toList());
		Stream<String> names = li.stream().map(Emp::getEName); //line n2 
		names.forEach(n -> System.out.print(n + " "));
	}

}

//s.getEAge() <= 60;일때의 답
// 답 : A. Sam John Jim

//s.getEAge() > 50; 일때의 답
// 답 : B. John Jim