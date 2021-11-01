package examp02;

import java.util.Objects;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
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
	
//	논리적 동등객체의 조건
//	1. HashCode가 같아야한다. hashcode()를 재정의 필요)
//	2. 두 개의 멤버변수의 값들이 같아야 한다.(equals)
	
	@Override
	public int hashCode() {
		System.out.println("해쉬코드 호출 ");
		return Objects.hash(this.name, this.age); //objects의 hash가 name,age의 값이 같으면  같은 해쉬코드를 만들어준다.
	}
	
	//하위 호환을 위한 해쉬코드 재정의 방법
//	@Override
//	public int hashCode() {
//		System.out.println("해쉬코드 호출 ");
//		return this.name.hashCode()+this.age;
//	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return (member.name.equals(this.name)) && (member.age == this.age);
		} else {
			return false;
		}
		
	}
	
	
	
}
