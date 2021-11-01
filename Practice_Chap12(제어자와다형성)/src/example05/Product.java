package example05;

public class Product {

	int price; //제품의 가격
	int bonusPoint; //제품 구매시 제공하는 보너스
	
	public Product(int price) {
		this.price = price;
		//보너스 점수는 제품 가격의 10% 적립
		this.bonusPoint = (int)(price / 10.0);
	}
}
