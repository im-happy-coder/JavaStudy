package example04;

import java.util.Arrays;

//클래스의 복제가 가능하게 하려면 java.lang.cloneable인터페이스를 구현해야한다.
public class Product implements Cloneable{

	private String id;
	private String name;
	private int price;
	private int[] arr;
	private Apple apple; //Apple 클래스 선언
	
	public Product(String id, String name, int price, int[] arr, Apple apple) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.arr = arr;
		this.apple = apple;
	}


	public String getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}
	
	public int[] getArr() {
		return this.arr;
	}
	
	public Apple getApple() {
		return this.apple;
	}
	@Override
	public String toString() {
		return "상품 id : " +  this.getId() + "\n" + "상품 이름 : " + this.getName() + "\n" + "상품 가격 : " + this.getPrice()
				+ "\n" + "배열 값 : " + Arrays.toString(this.arr) + "\n" + "Apple의 값 : " + this.apple.price;
		
	}

	
	public Product getProduct() {
		Product cloned = null;
		try {
			//얕은 복제가 여기서 일어난다.(참조변수의 값들은 공유)
			cloned = (Product)this.clone();  //여기서의 cloned()는 Object의 클래스 + this.clone()은 아래의 Object clone()을 가리킨다.
		} catch (CloneNotSupportedException e) { e.printStackTrace(); }
		return cloned;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		//먼저 얕은 복제를 호출(기본형타입)
		Product cloned = (Product)super.clone(); //super.clone()은 Object클래스의 cloned를 호출
		//참조타입들을 복제하는 코드
		cloned.arr = Arrays.copyOf(this.arr, this.arr.length);  //배열 복제
		cloned.apple = new Apple(this.apple.price); //애플 클래스 복제하는 코드
		
		return cloned;
	}
	
	
}
