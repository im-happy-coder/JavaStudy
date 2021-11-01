package examp09;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class ComparableEx {

	public static void main(String[] args) {
		//이 트리셋은 person클래스만 저장이 된다.
		TreeSet<Person> treeSet = new TreeSet<Person>();
		//사용자 정의 클래스를 TreeSet에 저장하기 위해서는 
		//반드시 Comparable이나 Comparator인터페이스를 구현 해야한다.
		//그 이유는 TreeSet은 저장되면서 자동 정렬이 이루어지기 때문이다.
		treeSet.add(new Person("신은혁", 12));
		treeSet.add(new Person("홍길동", 35));
		treeSet.add(new Person("손연재", 23));
		treeSet.add(new Person("김기수", 19));
		treeSet.add(new Person("박연수", 25));
		treeSet.add(new Person("손은정", 21));
		treeSet.add(new Person("손민수", 29));
		treeSet.add(new Person("김춘자", 51));
		treeSet.add(new Person("박길후", 61));
		
		System.out.println("총 객체 수 : " + treeSet.size());
		System.out.println("---------------------------------------");
		//반복자를 통한 출력
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println("이름 : " + person.getName() + " 나이 : " + person.getAge());
		}
		System.out.println("---------------------------------------");
		System.out.println("내림차순 정렬");
		NavigableSet<Person> descending = treeSet.descendingSet();
		Iterator<Person> diterator = descending.iterator();
		while(diterator.hasNext()) {
			Person person = diterator.next();
			System.out.println("이름 : " + person.getName() + " 나이 : " + person.getAge());
		}
		
	}

}
