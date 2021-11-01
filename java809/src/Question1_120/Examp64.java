package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp1{
private String eName;
private Integer eAge;

Emp1(String eN, Integer eA) {
this.eName = eN;
this.eAge = eA;
}
public Integer getEAge () {return eAge;}
public String getEName () {return eName;}
}
public class Examp64 {

	public static void main(String[] args) {
		List<Emp1>li = Arrays.asList(new Emp1("Sam", 20), new Emp1("John", 60), new Emp1("Jim", 51));
		Predicate<Emp1> agVal = s -> s.getEAge() > 50; //line n1      //getEAge() > 50-- 50이상이면 true가 되고 agVal에 저장한다.
		li = li.stream().filter(agVal).collect(Collectors.toList());  //filter가 50이상만 걸러내고 컬렉터를 실행한다.
		// Collector<T, ?, List<T>>  toList()  T를 List에 저장 ------ li변수가 List이므로 toList는 리스트에 저장한다라는 뜻이다.
		Stream<String> names = li.stream().map(Emp1::getEName); //line n2 //나이가 50이상인 이름을 출력한다.
		names.forEach(n -> System.out.print(n + " "));
	}

}


