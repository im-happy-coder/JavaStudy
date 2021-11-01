package Question1_120;

import java.util.Map;
import java.util.TreeMap;

public class Examp16 {

	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>();
		books.put (1007, "A");
		books.put (1002, "C");
		books.put (1001, "B");
		books.put (1003, "B");
		System.out.println (books);
	}

}

// Set은 중복 허용 안함
// Map은 키는 중복을 허용하지 않고, 값만 중복을 허용한다. 키는 null허용 안함. 값은 null 허용한다.
// Tree는 자동 정렬함