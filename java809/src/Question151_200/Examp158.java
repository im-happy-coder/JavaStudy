package Question151_200;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Student {
String course, name, city;
public Student (String name, String course, String city) {
this.course = course; this.name = name; this.city = city;
}

public String toString() {
return course + ":" + name + ":" + city;
}

public String getCourse() {
	return course;
}

public String getName() {
	return name;
}

public String getCity() {
	return city;
}

}
public class Examp158 {
	public static void main(String[] args) {
		List<Student> stds = Arrays.asList(
				new Student ("Jessy", "Java ME", "Chicago"),
				new Student ("Helen", "Java EE", "Houston"),
				new Student ("Mark", "Java ME", "Chicago"));
				stds.stream()
				.collect(Collectors.groupingBy(Student::getCourse)) //Courese 순서대로 그룹을 만듬
				.forEach((src, res) -> System.out.println(src)); //src는 커서를 나타내고, res는 커서의 값들
//				만약 scr이면 컴파일 오류임 -------------시험때 잘보기
//				src 일때 값 Java EE 	Java ME
//				res 일때 값 [Java EE:Helen:Houston]
//						[Java ME:Jessy:Chicago, Java ME:Mark:Chicago]

	}
}
