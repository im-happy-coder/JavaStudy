package Question121_150;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//사진 참고

class Person1 implements Comparable<Person1>{//line n1
	String name;       //String 변수가 하나 이므로 Comparable를 구현하고
	public Person1(String name) {  
		this.name=name;
	}
	//line n2
	@Override
	public int compareTo(Person1 p) {  //String 매개변수를 하나만 받는 compareTo(String t)를 사용하는게 맞다.
		return this.name.compareTo(p.name);
	}
	@Override
		public String toString() {
			return this.name;
		}
}
public class Examp144 {

	public static void main(String[] args) {
		List<Person1> emps = new ArrayList<>();
		emps.add(new Person1("aa"));
		emps.add(new Person1("bb"));
		emps.add(new Person1("cc"));
		Collections.sort(emps);
		System.out.println(emps);
	}

}
//답 : 
//B. At line n2 insert public int compareTo (Person p) { return this.name.compareTo (p.name);}
//C. Replace line n1 with class Person implements Comparable<Person>