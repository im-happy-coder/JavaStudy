package examp04;

import java.sql.Struct;
import java.util.Objects;

public class Student {
	private int sno; //학번
	private String name; //이름
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	public int getSno() {
		return sno;
	}

	public String getName() {
		return name;
	}
	
	
	// 오버라이딩하는 이유
//	hashcode는 데이터셋이나 헤쉬테이블을 쓰기위한 하나의 생성된 인덱스라고 볼수있다.
//	우리가 자주쓰는 Integer클래스나 String클래스 같은경우 같은 멤버값(키값)에대해서 
//	같은 hashcode가 나올수 있도록 오버라이딩 되어 있다. object안에 있는 hashcode메소드는
//	쓰레기 값을 반환해준다고 보면된다. 즉 사용자 정의된 클래스의 인스턴스를 생성하여 hashcode를
//	찍어보면 멤버변수가 같다할지라도 hashcode가 제각각 다른것을 알 수 있다. 이는 사용자가 
//	hashcode() 를 오버라이딩 해서써줘야 한다는 뜻이다. 
//	set의 관점에서 보면 모든 들어오는 자료들에 대하여 hash테이블을 만들어준다. 즉 참조만을 받아서
//	저장해주는 형태, 그 같은 테이블에대하여 equals연산을 수행해주며, 그결과 같으면 set안에 들여보내지
//	않는다. 
	
	
//	즉 사용자 정의 클래스를 equals만 재정의 해주고 hashcode()는 재정의 해주지 않으면 
//	서로 다른집합이기 때문에 무조건 들어간다.

	@Override
	public int hashCode() {
		return Objects.hash(this.sno, this.name);
	}
	
	@Override
	public boolean equals(Object obj) {
//		obj가 student클래스가 맞니?
		if(obj instanceof Student) {
//			맞으면 논리적 동등 객체인지 확인을 하고 동등하면 true를 리턴하고 아니면 false를 반환한다.
			Student student = (Student) obj;
			return this.sno == student.sno && this.name.equals(student.name);
		}
		return false;
	}
	
//	하위 호환을 위한 코드  1.4이전버전
//	@Override
//	public int hashCode() {
//		return this.sno + this.name.hashCode();
//	}
	
}
