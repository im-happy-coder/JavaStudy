package arraysExample;

import java.util.Arrays;

//사용자 정의 클래스는 반드시 정렬을 하기 위해서는 Comparable인터페이스를 반드시 구현해야한다.
class Person implements Comparable<Person> {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//비교 기준을 제시해 줌
	@Override
	public int compareTo(Person o) {
		return this.age - o.age; // 나이순으로 오름차순 정렬
//		return o.age - this.age; // 나이순으로 내림차순 정렬
//		return o.name.compareTo(this.name); // 이름순 내림차순 정렬
//		this.name.compareTo(o.name);  이름순 오름차순 정렬
	}
	
}

public class ArraySortEx {

	public static void main(String[] args) {

		Person person1 = new Person("홍기모띠", 18);
		Person person2 = new Person("김기모띠", 9);
		Person person3 = new Person("서기모띠", 59);
		Person person4 = new Person("주기모띠", 38);
		Person person5 = new Person("고기모띠", 8);
		
		Person[] persons = { person1, person2, person3, person4, person5 };
		Arrays.sort(persons);
		//배열 검색(binarySearch)는 반드시 sort하고 난 뒤에 해야한다. -- 무조건 정렬이 돼있어야한다.
		int index = Arrays.binarySearch(persons, person1);
		System.out.println("person1의 인스턴스에 있는 인덱스 : " + index + ", 이름  : " + person1.name);
		for(Person person : persons)
			System.out.println("이름 : " + person.name + ", 나이 : " + person.age );
		
//		System.out.println(Arrays.toString(persons));
		
		//기본형 타입과 String클래스는 Arrays.sort를 하게되면 기본적으로 오름차순 정렬이 이루어진다.
		int[] arr = { 55, -10, -9, 0, 100};
		Arrays.sort(arr); //오름차순 자동 정렬
		System.out.println("기본형 타입 소팅 후  : " + Arrays.toString(arr));
		
		String[] names = new String[] { "홍길동", "김개똥", "배유라", "신은혁" };
		Arrays.sort(names); //오름차순 자동 정렬
		System.out.println("String형 타입 소팅 후  : " + Arrays.toString(names));
	}

}
