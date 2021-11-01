package Question121_150;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class Examp128 {

	public static void main(String[] args) {
		Map<Integer, Integer> mVal = new HashMap<>();
		mVal.put(1, 10);
		mVal.put(2, 20);
		BiConsumer<Integer,Integer> c = (i, j) -> {System.out.print (i + "," + j+ "; ");};//line n1
		c.accept(1, 2);
		mVal.forEach(c);
		//´ä : BiConsumer<Integer,Integer> c = (i, j) -> {System.out.print (i + "," + j+ "; ");};
	}

}
