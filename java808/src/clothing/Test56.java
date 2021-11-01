package clothing;
import java.lang.management.GarbageCollectorMXBean;

class Student1{
	String name;
	int age;
	public Student1(String name, int age) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+" : "+this.age;
	}
}
public class Test56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 s1 = new Student1("aa",1);
		Student1 s2 = new Student1("bb",2);
		Student1 s3 = new Student1("cc",3);
		s1 = s3;
		s3 = s2;
		s2 = s1;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}

}
