package examp04;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListEx {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();
		//ArrayList는 순차적으로 추가, 삭제할때 ArrayList가 빠르고
		//LinkedList는 중간에 추가, 삭제 할때는 LinkedList가 빠르다
		System.out.println("===순차적으로 데이터 추가 하기===");
		System.out.println("ArrayList : " + add1(arrayList));
		System.out.println("LinkedList : " + add1(linkedList));
		System.out.println();
		
		System.out.println("=== 중간에 추가 하기===");
		System.out.println("ArrayList(배열 복사 발생) : " + add2(arrayList));
		System.out.println("LinkedList(노드값 변경) : " + add2(linkedList));
		System.out.println();
		
		System.out.println("=== 중간에 삭제 하기===");
		System.out.println("ArrayList(배열 복사 발생) : " + remove2(arrayList));
		System.out.println("LinkedList(노드값 변경) : " + remove2(linkedList));
		System.out.println();
		
		System.out.println("===순차적으로 데이터 삭제 하기===");
		System.out.println("ArrayList(배열 복사 발생) : " + remove1(arrayList));
		System.out.println("LinkedList(노드값 변경) : " + remove1(linkedList));
	}
	//순차적 데이터 추가 메서드
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis(); //시간을 알아내기
		for(int i=0; i<10000000; i++) {
			list.add(i + "");
		}
		long and = System.currentTimeMillis();
		return and - start;
	}
	//비순차적 데이터 추가 
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis(); //시간을 알아내기
		for(int i=0; i<10000000; i++) {
			list.add(500 + "X");
		}
		long and = System.currentTimeMillis();
		return and - start;
	}
	//순차적 데이터 삭제
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis(); //시간을 알아내기
		for(int i=list.size()-1; i>=0; i--) {
			list.remove(i);
		}
		long and = System.currentTimeMillis();
		return and - start;
	}
	//비순차적 데이터 삭제
		public static long remove2(List<String> list) {
			long start = System.currentTimeMillis(); //시간을 알아내기
			for(int i=0; i<10000; i++) {
				list.remove(i);
			}
			long and = System.currentTimeMillis();
			return and - start;
		}
	
}
