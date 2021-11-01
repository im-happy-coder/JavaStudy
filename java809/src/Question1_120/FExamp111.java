package Question1_120;



class Product3 {
	public double applyDiscount(double price) {
//		assert [Boolean] // 참이면 Pass, 거짓이면 AssertionError
		assert (price > 0 ); //line n1   
		return price * 0.50;
	}
}
public class FExamp111 {

	public static void main(String[] args) {
		Product3 p = new Product3();
		double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
		System.out.println("New Price:" + newPrice);
	}

}
//  답 : New Price: 0.0
 // 이유는 문제에서 -ea 옵션을 제시하지 않았기 때문에 -ea옵션이 없는 상태에서 결과를 봐야한다.
// 즉, args에는 0값이 있기 때문에 New Price : 0.0이 결과로 나온다.

//and the command:
//java Product 0
//What is the result?


