package examp07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSortEx {

	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<Integer>();
		scores.add(87);
		scores.add(98);
		scores.add(75);
		scores.add(95);
		scores.add(100);
		scores.add(-50);
		//기본적으로 오름차순이 이루어진다.
		System.out.println(scores);
		System.out.println("객체 수 : " + scores.size());
		
		System.out.println("----------------------------------------------");
		NavigableSet<Integer> descndingSet = scores.descendingSet();
		System.out.println("내림차순 결과 : ");
		System.out.println(descndingSet);
		System.out.println("객체 수 : " + descndingSet.size());
		System.out.println("----------------------------------------------");
		//내림차순을 또 한번 더 내림차순함
		NavigableSet<Integer> ascendingSet = descndingSet.descendingSet();
		System.out.println("오름차순 결과 : ");
		System.out.println(ascendingSet);
		System.out.println("객체 수 : " + ascendingSet.size());
	}

}
