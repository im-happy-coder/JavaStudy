package examp01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mapping2 {
	private String model;
	private int price;
	
	public Mapping2(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public int getPrice() {
		return price;
	}
	public static void main(String[] args) {
//		맵핑2: 필터링 후 맵핑의 예
		List<Mapping2> ls = new ArrayList<Mapping2>();
		ls.add(new Mapping2("GUN_LR_45", 200));
		ls.add(new Mapping2("TEDDY_BEAR", 350));
		ls.add(new Mapping2("CAR_TRANSFORM_VER_7719", 500));
		
		int sum = ls.stream() // ㅁ ㅁ ㅁ 3개의 스트림을 생성
				.filter(p->p.getPrice() < 500) // ㅁㅁㅁ3개의 스트림 중 price가 500미만인 것을 걸러냄 => ㅁㅁ 200과 350이 남음
				.mapToInt(t->t.getPrice()) // 200과 350이 int형으로 매핑됨
				.sum(); // int형으로 매핑된 200과 350을 더함 => ㅁ 1개의 스트림이 존재 550
		System.out.println("sum = " + sum); //출력

		
	}

}
