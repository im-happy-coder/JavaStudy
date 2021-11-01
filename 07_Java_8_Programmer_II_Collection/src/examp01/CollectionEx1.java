package examp01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionEx1 {

	public static void main(String[] args) {
//		List
//		가장 일반적인 컬렉션이며, 중복을 허용한다. null요소도 삽입가능
		
		List<String> list = new ArrayList<>(10);

		System.out.println(list.isEmpty()); // true
		list.add("a");
		System.out.println(list.get(0)); // a
		list.add(0, "b"); // 인덱스 0에 b 삽입
		list.add("c");
		list.add(null);
		System.out.println(list); // [b, a, c, null]
		list.set(2, "a"); // Replacing element at index 2 with a
		System.out.println(list.contains("d")); // false
		// 첫 번째 일치하는 인덱스를 반환합니다. 찾지 못하면 -1
		System.out.println(list.indexOf("a")); // 1
		// 마지막 일치의 인덱스를 반환합니다. 찾지 못하면 -1
		System.out.println(list.lastIndexOf("a")); // 2

		list.remove(1); // 1번째 인덱스 제거
		list.remove(null);  // null 제거
		list.remove("a"); // 첫 번째 일치 요소 제거

		System.out.println(list.size()); // 1
		
		
//		LinkedList구현하는 이중 링크 목록
//		List은 다음 java.util.Arrays.asList방법을 사용하는 것입니다.
		String[] arr = {"a", "b", "c", "d"};
		List<String> list1 = Arrays.asList(arr);
//		또는 간단히 :
		List<String> list2 =
		        Arrays.asList("a", "b", "c", "d");
		
	}

}
