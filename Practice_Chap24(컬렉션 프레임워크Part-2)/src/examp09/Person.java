package examp09;

public class Person implements Comparable<Person> {
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public String getName() {
		return name;
	}


	public int getAge() {
		return age;
	}

//	age값으로 정렬 기준 제시
	
//	@Override
//	public int compareTo(Person o) {
////		if(this.age < o.age) {  // 부등호 <을     >로 바꾸면 내림차순 정렬이 된다.
////			return -1;
////		} else if(this.age == o.age)
////			return 0;
////		else 
////			return 1;
//	한줄로 쓰는법	return this.age - o.age;   //this.age가 음수면 오름차순이 정렬이 된다.,,,, o.age - this.age 해주면 내림차순 정렬이 된다.
//	}
	
	
//	name값으로 정렬기준 제시
	@Override
	public int compareTo(Person o) {
		if(this.name.compareTo(o.name) < 1) {  
		return -1;
	} else if(this.name.compareTo(o.name) == 0)
		return 0;
	else 
		return 1;
	} 
//	한줄로 쓰는법 this.name.compareTo(o.name) - o.name.compareTo(this.name);
}
