package Question1_120;

import java.util.function.BiFunction;

public class Examp67 {

	public static void main(String[] args) {
		BiFunction<Integer, Double, Integer> val = (t1, t2) -> t1 + t2; //line n1
		System.out.println(val.apply(10, 10.5));
		//Inter와 Double를 같이 매핑 할수 없음----  3개의 제네릭 타입이 같아야함
	}

}
