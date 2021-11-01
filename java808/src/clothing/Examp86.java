package clothing;

class student{
	String name;
	public student(String name) {
		this.name=name;
	}
}
public class Examp86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student[] students = new student[3];
		students[1] = new student("Riche");
		students[2] = new student("Donal");
		for(student s : students) {
			System.out.println(""+s.name);
		}
	}	

}
