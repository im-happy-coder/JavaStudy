package clothing;

import java.util.Set;

class Em1{
	private String name;
	private int age;
	private int salary;
	public Em1(String name, int age) {
		// TODO Auto-generated constructor stub
		setName(name);
		setAge(age);
		setSalary(2000);
	}
	public Em1(String name, int age, int salary) {
		this(name, age);
		setSalary(salary);
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void printDetails() {
		System.out.println(name + " : "+age+" :"+salary);
	}
}
public class Examp101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Em1 e1 = new Em1();
		Em1 e2 = new Em1("Jack", 50);
		Em1 e3 = new Em1("chloe",40,5000);
		
//		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
