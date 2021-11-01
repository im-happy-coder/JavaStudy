package Question151_200;

import java.util.Set;
import java.util.TreeSet;

class Vehicle1 implements Comparable<Vehicle1>{
int vno;
String name;
public Vehicle1 (int vno, String name) {
this.vno = vno;
this.name = name;
}
public String toString () {
return vno + ":" + name;
}
public int compareTo(Vehicle1 o) {
return this.name.compareTo(o.name);   //name 기준으로 정렬을 함 compareTo()메서드 안에는 String값 매개변수 1개만 올수 있음
}
//Comparable = compareTo(String 매개변수 1개)
}
public class Examp187 {

	public static void main(String[] args) {
		Set<Vehicle1> vehicles = new TreeSet <> ();
		vehicles.add(new Vehicle1 (10123, "Ford"));
		vehicles.add(new Vehicle1 (10124, "BMW"));
		System.out.println(vehicles);
	}

}


// 답 :B. [10124:BMW, 10123:Ford]