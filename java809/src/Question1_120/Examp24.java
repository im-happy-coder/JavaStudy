package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Studentee {
String course, name, city;
public Studentee (String name, String course, String city) {
this.course = course; this.name = name; this.city = city;
}
public String toString() {
return course + ":" + name + ":" + city;
}


}
public class Examp24 {

	public static void main(String[] args) {
		List<Studentee> stds = Arrays.asList(
				new Studentee ("Jessy", "Java ME", "Chicago"),
				new Studentee ("Helen", "Java EE", "Houston"),
				new Studentee ("Mark", "Java ME", "Chicago"));
				stds.stream().
				collect(Collectors.groupingBy(Studentee :: getCourse)).forEach((src, res) -> System.out.println(res)); //scr이면 
																									//D. A compilation error occurs.
	}
}
/*
 * 
 * 
 * 또는 Student클래스에 getCurse() 메서드가없다면 답은  A compilation error occurs. 가 된다..
 * 
 *  
 *  또는 getCourse()클래스가 있고
 * .forEach ((src, res)-> System.out.println (src)); 결과는 B. Java EE Java ME입니다. 
 * 
 * 
 * 
 * 또는 getCourse()클래스가 있고
 * .forEach ((src, res)-> System.out.println (res)) ; 결과는 A입니다. [Java EE : Helen : Houston] [Java ME : Jessy : Chicago, Java ME : Mark : Chicago]
 */
