package Question1_120;
class Book {
	int id;
	String name;
	public Book (int id, String name) {
		this.id = id;
		this.name = name;
	}
	public boolean equals (Book obj) { //line n1 boolean equals (Book obj) { 이 것도 true를 출력함
		boolean output = false;
		Book b = (Book) obj;
		if (this.name.equals(b.name)) {
			output = true;
		}
		return output;
	}
}
public class Examp17 {

	public static void main(String[] args) {
		Book b1 = new Book (101, "Java Programing");
		Book b2 = new Book (102, "Java Programing");
		System.out.println(b1.equals(b2)); //line n2
		
		
//		public boolean equals (Object obj) { --equals의 매개변수 값이 Object일때
//		 (b1.equals(b2));일때는   true를 출력,  (b1.equals((Object) b2));일때도 true출력
		
//		public boolean equals (Book obj) { --equals의 매개변수 값이 Book일때
//		 (b1.equals(b2));일때는 true를 출력,	  (b1.equals((Object) b2));일때는 false를 출력

	}

}
