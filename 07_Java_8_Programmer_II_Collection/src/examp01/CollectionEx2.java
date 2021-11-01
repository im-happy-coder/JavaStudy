package examp01;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class CollectionEx2 {

	public static void main(String[] args) {
//		Set
//		가장 많이 사용되는 두 가지 구현은 HashSet및 TreeSet입니다. 
		
//		Hash들어간건 다 정렬하지 않고 null값 허용
//		Tree들어간건 다 정렬하고 null값 불가능
		
		
//		HashSet : HashSet은 정렬 안함, null값 허용
		// Creating a HashSet with an initial capacity of 10
		Set<String> set = new HashSet<>(10);
		// add() returns true if the element is not already in the set
		System.out.println(set.add("b")); // true
		System.out.println(set.add("x")); // true
		System.out.println(set.add("h")); // true
		System.out.println(set.add("b")); // false
		System.out.println(set.add(null)); // true
		System.out.println(set.add(null)); // false
		System.out.println(set); // [null, b, x, h]
		
		
//		TreeSet : TreeSet은 정렬 한다., null값 허용안함
		Set<String> set1 = new TreeSet<>();
		System.out.println(set1.add("b")); // true
		System.out.println(set1.add("x")); // true
		System.out.println(set1.add("h")); // true
		System.out.println(set1.add("b")); // false
//		System.out.println(set1.add(null)); // nullpointException 발생
		System.out.println(set1); // [b, h, x]
		
		
		
//		Queue :  FIFO (선입 선출) 방식으로 추가 및 제거됩니다. -- Collection, ArrayDeque
//		 앞 (스택)과 뒤 (큐)로  추가 및 제거,  null값 허용안함
//		boolean add(E e)
//		큐 끝에 요소를 추가하고 성공하면 true를 반환하고 그렇지 않으면 예외를 throw합니다.
//		E remove()
//		큐의 첫 번째 요소를 제거하고 반환하거나 비어있는 경우 예외를 throw합니다.
//		E element()
//		큐의 다음 요소를 반환하거나 비어있는 경우 예외를 throw합니다.
//		boolean offer(E e)
//		큐 끝에 요소를 추가하고 true성공하거나 false그렇지 않으면 반환 합니다 .
//		null문제가 발생하면 반환 하는 메서드 :
//
//			E poll()
//			큐의 첫 번째 요소 또는 null비어있는 경우 제거하고 반환합니다 .
//			E peek()
//			큐의 다음 요소를 반환하거나 null비어있는 경우 반환합니다 .
		Queue<String> queue = new ArrayDeque<>();
		System.out.println(queue.offer("a")); // true [a]
		System.out.println(queue.offer("b")); // true [a, b]
		System.out.println(queue.peek()); // a [a, b]
		System.out.println(queue.poll()); // a [b]
		System.out.println(queue.peek()); // b [b]
		System.out.println(queue.poll()); // b []
		System.out.println(queue.peek()); // null
		
		
//		다음 메서드를 사용할 때이 클래스를 LIFO (후입 선출)의 요소를 정렬하는 데이터 구조 인 스택으로 사용할 수도 있습니다.

		// 요소 앞에 요소를 추가합니다.
//		void push(E e)


		// 다음 요소를 제거하고 반환합니다.
		// 또는 큐가 비어있는 경우 예외 발생
//		E pop() 

//		이러한 메서드는 Queue인터페이스에 없습니다 .

		ArrayDeque<String> stack = new ArrayDeque<>();
		stack.push("a"); // [a]
		stack.push("b"); // [b, a]
		System.out.println(stack.peek()); // b [b, a]
		System.out.println(stack.pop()); // b [a]
		System.out.println(stack.peek()); // a [a]
		System.out.println(stack.pop()); // a []
		System.out.println(stack.peek()); // null
		
		
		
//		Map :	String값을 얻기 위해  키를 사용함. 가장 많이 사용되는 두 가지 구현은 HashMap및 TreeMap입니다. 
//		TreeMap은 키 를 정렬하지만 log (n) 시간에 키를 추가하고 검색하는 반면 HashMap순서를 보장하지는 않지만 키를 더 빠르게 추가하고 검색한다는 것입니다.
		
		Map<String, Integer> map = new HashMap<>();


		// 키 / 값 쌍 추가
		System.out.println( map.put("oranges", 7) ); // null
		System.out.println( map.put("apples", 5) ); // null
		System.out.println( map.put("lemons", 2) ); // null
		System.out.println( map.put("bananas", 7) ); // null

		// 기존 키의 값을 대체합니다. 이전 것을 반환
		System.out.println( map.put("apples", 4) ); // 5
		 System.out.println( map.size() ); // 4

		// {oranges=7, bananas=7, apples=4, lemons=2}
		System.out.println(map);

		// 키가 oranges인 값을 얻기
		System.out.println( map.get("oranges") ); // 7

		// Map에 키가 포함되어 있는지 테스트
		System.out.println( map.containsKey("apples") ); // true
		// Map에 값이 포함되어 있는지 테스트
		System.out.println( map.containsValue(5) ); // false

		// 키 / 값 쌍 제거 및 값 반환
		System.out.println( map.remove("lemons") ); // 2
		// 키를 찾을 수 없으면 null을 반환합니다.
		System.out.println( map.remove("lemons") ); // null

		// 키를 Set으로 가져 오기
		// (변경 사항은 Map에 반영되며 그 반대도 마찬가지입니다.)
		Set<String> keys = map.keySet(); // [oranges, bananas, apples]

		// 값을 Collection으로 가져 오기
		// (변경 사항은 Map에 반영되며 그 반대도 마찬가지입니다.)
		Collection<Integer> values = map.values(); // [7, 7, 4]

//		모든 키 / 값 쌍 제거
		map.clear();

		System.out.println( map.isEmpty() ); // true
		
		
		
//		Tree사용
		Map<String, Integer> map2 = new TreeMap<>();

		System.out.println( map2.put("oranges", 7) ); // null
		System.out.println( map2.put("apples", 5) ); // null
		System.out.println( map2.put("lemons", 2) ); // null
		System.out.println( map2.put("bananas", 7) ); // null

		// {apples=5 , bananas=7, lemons=2, oranges=7}
		System.out.println(map2);

		// [apples, bananas, lemons, oranges]
		Set<String> keys1 = map.keySet();
		 Collection<Integer> values1 = map.values(); // [5, 7, 2, 7]

//		정렬이 수행되는 방식 때문에 (다시 말하지만 TreeSet) a TreeMap는 null키로 값을 가질 수 없습니다 .

		Map<String, Integer> map3 = new TreeMap<>();
		map3.put(null, 1); // throws NullPointerException!

//		그러나 다음을 수행 HashMap할 수 있습니다.

		Map<String, Integer> map4 = new HashMap<>();
		map4.put(null, 1); // OK
	}

}
