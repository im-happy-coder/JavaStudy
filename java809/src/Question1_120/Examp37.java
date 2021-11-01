package Question1_120;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.IntFunction;

class Book1 implements Comparator<Book1> { //Comparator기준 제시 implements Comparator<Book1>
String name;
double price;
public Book1 () {}
public Book1(String name, double price) {
this.name = name;
this.price = price;
}

public int compare(Book1 b1, Book1 b2) {  // 기준 제시 오버라이딩
return b1.name.compareTo(b2.name);  // 이 조건 대로 Collections.sort(books, new Book1()); 이문장으로 정렬이됨
}

public String toString() {
return name + ":" + price;
}
}public class Examp37 {

	public static void main(String[] args) {
		List<Book1>books = Arrays.asList (
//				new Book1("C eginning with Java", 2), 
//				new Book1("D Guide to Java Tour", 2)	
//				문자열 맨 앞 알파벳 순서대로 정렬이 이루어진다. 위 문자 출력은 C가 먼저 출력됨
				
				new Book1("Beginning with Java", 2),
				new Book1("A Guide to Java Tour", 3) //이건 당연히 A가 먼저 출력됨
				);
				Collections.sort(books, new Book1());
				System.out.print(books);
//				답 : A. [A Guide to Java Tour:3.0, Beginning with Java:2.0]
				
				
//				만약 시험에서 
//				new Book ("Beginning with Java", 2),
//				new book ("A Guide to Java Tour", 3)
//				이렇게 인스턴스 이름이 다르다면 
//				D. An Exception is thrown at run time. 답은 이거다.
				
				
				
				
				
				/*
				 * 만약 알파벳의 사전편찬 순이라던가 숫자 오름차순 같이 natural order 대로의 정렬 말고 사용자가 원하는 임의의 정렬 기준(가령 이름의 문자열 길이 순서)대로 
				 * 정렬하고 싶으면 어떻게 해야할까? 이럴땐 정렬이 되는 기준을 개발자가 직접 정의해주어야 한다. 
				 * 이때 기준이 되는 것이 Comparator 인터페이스를 구현하는 것이다. 즉, compare() 메소드를 오버라이딩 해주는 것이다. 
				 */
	}

}
