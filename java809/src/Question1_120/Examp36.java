package Question1_120;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Product {
int id; int price;
public Product(int id, int price) {
this.id = id;
this.price = price;
}
public String toString() { return id + ":" + price; }
}

public class Examp36 {

	public static void main(String[] args) {
		
		List<Product> products = new ArrayList<>(Arrays.asList(new Product(1, 10), new Product (2, 30), new Product (2, 30)));
		Product p = products.stream().reduce(new Product (4, 0), (p1, p2) -> { 
		p1.price+=p2.price; return new Product (p1.id, p1.price);}); 
		products.add(p);
		products.stream().parallel()
		.reduce((p1, p2) -> p1.price > p2.price ? p2 : p1)
		.ifPresent(System.out::println);
//		products는 아래와 같이 생성되며
//		[1:10, 2:30, 2:30, 4:70] 여기서 p1이 1:10이되고 p2가 2:30으로 1코어로 병렬 처리되며
//		그 다음 세번쨰 2:30과 4:70이 p1과 p2가 되고 여기서 큰값이 마지막으로 남아서 다시 p1과 p2가 됝다.
		//위에는 올바른 답
		// 답 : 4: 70
		
		
		
		// 아래는 List<Product> products = Arrays.asList문에서  new ArrayList<>(Arrays.asList 가 되어야
		// 아래에 new ArrayList<>를 추가하게되면 products.add(p);에서 오류가 발생하지 않는다
		// 그리고 답은 4:70이 된다.       Produce의 price값을 계속 더하기 때문이다. 그리고 마지막에  p1에 값이 크다면 p1를 출력한다.
//		List<Product> products = Arrays.asList(new Product(1, 10), new Product (2, 30), new Product (2, 30));
//		Product p = products.stream().reduce(new Product (4, 0), (p1, p2) -> { 
//		p1.price+=p2.price; return new Product (p1.id, p1.price);}); 
//		products.add(p);//products.add (p)는 UnsupportedOperationException을 발생시킵니다.
//		products.stream().parallel()
//		.reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
//		.ifPresent(System.out::println);	

			//parallel() 병렬처리
	}
}
	//reduce() Stream의 데이터를 변환하지 않고, 더하거나 빼는 등의 연산을 수행하여 하나의 값으로 만든다면 reduce를 사용할 수 있습니다.


/*
Arrays.asList 대신 ArrayList를 사용하는 경우. 결과는 4:70입니다.
*/