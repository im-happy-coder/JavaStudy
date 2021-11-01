package examp10;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ComparaterEx {

	public static void main(String[] args) {
		//생성자에 비교기준을 이미 제시를 한 것이다.
		TreeSet<Fruit> treeSet = new TreeSet<>(new AscendingComparater());
		
		//익명 구현 객체로 비교자 제시
//		TreeSet<Fruit> treeSet = new TreeSet<>(new Comparator<Fruit>() {
//			@Override
//			public int compare(Fruit o1, Fruit o2) {
////				return o1.getPrice() - o2.getPrice(); //오름차순
//				return o2.getPrice() - o1.getPrice(); //내림차순 
//			}
//		});
//		
		
		
		
		//비교기준이 없다면 ClassCastException이 발생한다.
		//예외처리를 기본적으로 해주는 것이 좋다.
		try {
			treeSet.add(new Fruit("딸기", 42000));
			treeSet.add(new Fruit("포도", 65000));
			treeSet.add(new Fruit("복숭아", 3500));
			treeSet.add(new Fruit("바나나", 3400));
			treeSet.add(new Fruit("자두", 2500));
			treeSet.add(new Fruit("호박", 1000));
		} catch (Exception e) {
			System.out.println("정렬이 기준이 없음");
			e.printStackTrace();
		}
		
		System.out.println("총 객체 수 : " + treeSet.size());
		Iterator<Fruit> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Fruit fruit = iterator.next();
			System.out.println(fruit.getName() + " :  "+ fruit.getPrice());
		}
		
		
		
	}

}
