package Question1_120;

import java.util.Set;
import java.util.TreeSet;

class Vehicle1 {
int vno;
String name;
public Vehicle1 (int vno, String name) {
this.vno = vno;
this.name = name;
}
public String toString () {
return vno + ":" + name;
}
//public int compareTo(Vehicle1 o) {
//return this.name.compareTo(o.name);
//}
}
public class Examp32 {
	public static void main(String[] args) {
		Set<Vehicle1> vehicles = new TreeSet <> ();
		vehicles.add(new Vehicle1 (10123, "Ford"));
		vehicles.add(new Vehicle1 (10124, "BMW"));
		System.out.println(vehicles);
	}
}

//TreeSet은 이진트리를 기반으로 이루어진 컬렉션이며, Set인터페이스와 SortedSet인터페이스를 구현한 클래스이다.
		//자동으로 오름차순 정렬한다. 중복 요소를 허용하지 않는 컬렉션을위한 인터페이스입니다
//  답 : ClassCastException is thrown at run time
//Vehicle cannot be cast to java.lang.Comparable
//	Vehicle은 java.lang.Comparable로 캐스트 할 수 없습니다.


// implements Comparable<Vehicle1> 를 해줘야 답이 [10124:BMW, 10123:Ford] 이렇게 된다