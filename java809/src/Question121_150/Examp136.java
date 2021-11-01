package Question121_150;

import java.util.ArrayDeque;
import java.util.Deque;

public class Examp136 {

	public static void main(String[] args) {
		Deque<Integer> nums = new ArrayDeque<>();
		nums.add(1000); //add 뒤 추가
		System.out.println(nums);
		nums.push(2000); //push 앞추가
		System.out.println(nums);
		nums.add(3000);
		System.out.println(nums);
		nums.push(4000);
		System.out.println(nums);
		Integer i1 = nums.remove(); //앞 삭제
		System.out.println(nums);
		Integer i2 = nums.pop();  //앞 삭제
		System.out.println(nums); //삭제 후 남은 1000과 3000이 남는다.
		System.out.println(i1 + ":" + i2); //삭제한 값을 출력하므로 4000과 2000이 출력된다.
	}
}
/*
일단 꺼내는 함수들에 대해 알아보자.
값을 제거하지 않는 것들
peek()        : 앞

peekLast()  : 뒤

peekFirst()  : 앞

getFirst()    :  앞

getLast()    :  뒤 

값을 제거하는 것들
poll()         :  앞

pollFirst()   :  앞

pollLast()   :  뒤 

pop()         :  앞

입력하는 함수들에 대해 알아보자.
offerFirst  :  앞

offerLast  :  뒤

offer        :  뒤  

addFirst   :  앞   

addLast   :  뒤

add         :  뒤

putFirst    :  앞  

putLast    :  뒤

put          :  뒤

push       :  앞 
정리하자면

출력은 Last가 붙지 않은건 전부 앞에서 꺼낸다.
입력이 엄청나게 괴랄 하다.
First, Last가 붙은것들은 해당 위치로 다 들어간다.
offer, add, put은 뒤에 넣는다.
push는 앞으로 넣는다.
*/