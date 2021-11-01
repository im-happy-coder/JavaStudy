package examp05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueEx {

	public static void main(String[] args) {
//		Stack은 클래스
		Stack<String> stack = new Stack<>();
//		Queue는 인터페이스이며 이를 구현한 LinkedList클래스를 생성 후 대입하고 있다.
		Queue<String> queue = new LinkedList<>();
		
		//스택 push는 넣기  pop은 끄내기------후입선출LIFO (택시기사 동전통
		stack.push("0");
		stack.push("1");
		stack.push("2");
		
		//큐 offer는 넣기 poll은 끄내기----선입선출 FIFO (파이프, 수도 호수
		queue.offer("0");
		queue.offer("1");
		queue.offer("2");
		
		System.out.println("=스택=");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("=큐=");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}

}
