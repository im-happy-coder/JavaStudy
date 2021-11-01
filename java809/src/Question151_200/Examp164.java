package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student1 {
String course, name, city;
public Student1 (String name, String course, String city) {
this.course = course; this.name = name; this.city = city;
}
public String toString() {
return course + ":" + name + ":" + city;
}
public String getCourse() {return course;}
public String getName() {return name;}
public String getCity() {return city;}
}
public class Examp164 {

	public static void main(String[] args) {
		List<Student1> stds = Arrays.asList(
				new Student1 ("Jessy", "Java ME", "Chicago"),
				new Student1 ("Helen", "Java EE", "Houston"),
				new Student1 ("Mark", "Java ME", "Chicago"));
				stds.stream()
				.collect(Collectors.groupingBy(Student1::getCourse))
				.forEach((src, res) -> System.out.println(scr));
				//scr이면 컴파일 에러
				//src이면 Java EE Java ME
				//res이면  [Java EE: Helen:Houston] [Java ME: Jessy:Chicago, Java ME: Mark:Chicago]
	}

}
