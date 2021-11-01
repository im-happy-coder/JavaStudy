package Question151_200;
class Book {
int id;
String name;
public Book (int id, String name) {
this.id = id;
this.name = name;
}
public boolean equals (Object obj) { //line n1 ---- Book obj 해도 똑같다잉
boolean output = false;
Book b = (Book) obj;
if (this.id  == b.id) { //id값이 서로 다르기 때문에 false 리턴   --- 만약 name으로 따지면 //if (this.name.equals(b name))}  true를 리턴
output = true;
}
return output;
}
}
public class Examp182 {

	public static void main(String[] args) {
		Book b1 = new Book (101, "Java Programing");
		Book b2 = new Book (102, "Java Programing");
		System.out.println (b1.equals(b2)); //line n2
//	System.out.println (b1.equals((Object) b2)); //이것도 똑같은 결과를 출력한다.	
	
		
//		답 : B. The program prints false.
	}

}
/*
public boolean equals (Book obj) {여도 System.out.println (b1.equals((Object) b2)); 사용가능 */


//문제 17번은 name으로 비교함