package example01;

import java.util.Arrays;

public class Student {

	int age;
	String name;
	int[] subject;
	
	public Student(int age, String name, int[] subject) {
		this.age = age;
		this.name = name;
		this.subject = subject;
	}
	
	@Override
	public boolean equals(Object obj) {
	
		System.out.println("equals()");
		//타입변환이 가능한지 여부를 알아보기 위해서 instanceof연산자 이용 -> obj가 student와 관계있는지 알아보는거다
		if(obj instanceof Student) {
			Student student = (Student)obj; //다운캨스팅 object(조상)->Student(자손)
			//논리적 동등을 위해서 조건문을 설정, age와 name이 다 같다라는 의미
			boolean result = Arrays.equals(this.subject, student.subject);
			if((this.age == student.age) && (this.name.equals(student.name)) && result) {  
				//(this.name.equals(student.name)은 String의 name의 값을 비교하는 문이다.											
				return true;
			}
		}
		return false;
	}
	
}
