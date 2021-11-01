package objectsExample;

import java.util.Comparator;
import java.util.Objects;

public class CompareEx {
	//중첩클래스 (정적 멤버 클래스)
	static class Student{
		int sno;
		String name;
		
		public Student(int sno, String name) {
			this.sno = sno;
			this.name = name;
		}
	}

	static class StudentComparator implements Comparator<Student>{
		//위의 Student클래스의 name을 가지고 비교
		@Override
		public int compare(Student o1, Student o2) {
			if(o1.name.compareTo(o2.name) < 0)  //o1.name과 o2.name을 비교
				return -1;
			else if(o1.name.compareTo(o2.name) == 0)
				return 0;
			else
				return 1;
		
	}

}

	
	public static void main(String[] args) {
		
		Student student1 = new Student(1, "홍길동");
		Student student2 = new Student(2, "홍길자");
		Student student3 = new Student(3, "김연아");
		
		
		//비교자(Comparator<T>인터페이스를 익명구현 객체로 대입)
//		int result = Objects.compare(student1, student2, new Comparator<Student>() {  //new Comparator<Student> -> 익명구현객체 생성 //Comparator는 무조건 오버라이딩 해줘야함
//			@Override
//			public int compare(Student o1, Student o2) {
//				if(o1.sno < o2.sno) 
//					return -1;
//				else if(o1.sno == o2.sno)
//					return 0;
//				else 
//					return -1;
//				return o1.sno - o2.sno; //위 주석문을 한줄로 표현함
//			}
//		});
		
		
		//위의 StudentComparator 인터페이스를 구현했으니 위에껄 호출하면됨
		int result = Objects.compare(student1, student2, new StudentComparator());
		
		
		if(result > 0) {  //내림차순은 "<" 부등호만 바꾸면 됨
			System.out.println("o1.sno가 큽니다.");
		}
		else if(result == 0) {
			System.out.println("o1.sno과 o2.sno가 같습니다.");
		}
		else {
			System.out.println("o2.sno가 큽니다.");
		}
	}
}
