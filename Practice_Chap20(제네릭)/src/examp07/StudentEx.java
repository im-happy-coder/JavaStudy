package examp07;

public class StudentEx {

	public static void main(String[] args) {
		//필드의 다형성
		Person<String, String> person = new Student<String, String, Integer>();
		person.setKind("황인종");
		person.setMode("전투태세");
		System.out.println(person.getKind() + " : " + person.getMode());
		
		
		
		
		
		
		Student<String, String, Integer> personStudent = new Student<>();
		personStudent.setKind("황인종");
		personStudent.setMode("전투태세");
		personStudent.setC(100);
		System.out.println(personStudent.getKind() + " : " + personStudent.getMode() + " 전투력 : " + personStudent.getC());
	}

}
