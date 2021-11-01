package Question1_120;

import java.util.ArrayDeque;
import java.util.Deque;

public class FExamp115 {

	public static void main(String[] args) {
		Deque<String> queue = new ArrayDeque<>();
		queue.add("Susan"); 
		queue.add("Allen");
		queue.add("David");
		System.out.println(queue.pop()); //Susan을 제거
		System.out.println(queue.remove()); // Allen을 제거
		System.out.println(queue); // 남은것 David를 출력

		//스택추가, add,put,offer(뒤), push(앞)
		//스택제거, pop,remove,poll(앞)
		
//		System.out.println(queue.peek()); //만약 여기서 삭제하지 않고 peek 확인만 했다면 susan를 출력하고 삭제하지는 않는다.
//		System.out.println(queue.remove()); // 여기서는 susan이 삭제되고
//		System.out.println(queue); // 남은것 allen, David를 출력한다.
	}

}

/*
 * pop()
removeFirst()와 동일. 덱을 스택으로 사용할 때 쓰임
removeFirst()덱의 앞쪽에서 엘리먼트 하나를 뽑아서 제거한 다음 해당 엘리먼트를 리턴한다. 덱이 비어있으면 예외가 발생한다. 
 * 2) 값을 제거하기
- poll : Deque의 제일 앞 Element를 return 받음. Element를 제거. Queue에서 Element를 받아오는 과정이라고 생각하면 된다.
poll()
pollFirst()
pollLast()


3) 값을 제거하지 않고 확인만 하기
- peek : Deque의 제일 앞 Element를 return 받음. Element를 제거하지 않음.
peek
peekFirst
peekLast
- get : First, Last에 있는 Element를 return 받음. Element를 제거하지 않음.
getFirst
getLast

1) 추가하기 

- add : Deque의 마지막에 Element를 삽입. addFirst, addLast는 각 자리(First와 Last에 Element를 삽입)
add(E e) 
addFirst(E e) 
addLast(E e) 
- put : add와 동일하게 작동
put(E e)
putFirst(E e)
putLast(E e)
- offer : add와 동일하게 작동
offer(E e)
offerFirst(E e)
offerLast(E e)
- push : Deque의 앞 부분에 Element를 삽입.
push(E e)


*/

