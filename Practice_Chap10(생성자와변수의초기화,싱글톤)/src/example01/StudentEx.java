package example01;

public class StudentEx {

	public static void main(String[] args) {
		//기본생성자 호출
		Student student = new Student();
		System.out.println(student);

		//매개변수가 있는 생성자를 호출
		Student student2 = new Student("홍길동", 50);
		System.out.println(student2);
		
		Student student3 = new Student("김기동");
		System.out.println(student3);
		
		Student student4 = new Student(33);
		System.out.println(student4);
	}

}
