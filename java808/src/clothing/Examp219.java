package clothing;

public class Examp219 {
	String name;
	int age = 25;
	
	public Examp219(String anme) { 
//		this(); //에러 					//line n1
		setName(name);      
	}
	public Examp219(String name, int age) {  
//		Examp219(name);   //line n2 에러
		setAge(age);
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String show() {
		return name + " " + age;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
