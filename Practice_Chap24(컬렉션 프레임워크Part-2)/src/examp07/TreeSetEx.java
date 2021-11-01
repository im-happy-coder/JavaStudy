package examp07;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		//TreeSet은 이진트리를 기반으로 이루어진 컬렉션이며, Set인터페이스와 SortedSet인터페이스를 구현한 클래스이다.
		//자동으로 오름차순 정렬한다.
		TreeSet<Integer> scores = new TreeSet<>();
		//객체 추가
		scores.add(new Integer(87));
		scores.add(98);//자동 박싱
		scores.add(75);
		scores.add(95);
		scores.add(80);
		
		Integer score = null;
		//가장 낮은 점수를 구해보기 (이진트리의 가장 왼쪽의 값)
		System.out.println("가장 낮은 점수 :  " + scores.first());
		//가장 높은 점수를 구해보기 (이진트리의 가장 오른쪽의 값)
		System.out.println("가장 높은 점수 :  " + scores.last());
		
		//주어진 객체의 왼쪽에 있는 점수 (Lower)
		score = scores.lower(95);//95점 밑에있는 왼쪽에 있는 값-- 자기 자신은 포함하지 않는다=(주어진 객체는 포함하지 않는다.)
		System.out.println("95점 아래 점수 :  " + score);
		//floor는 자기자신 포함=(주어진 객체도 포함한다.)
		score = scores.floor(95);
		System.out.println("95점 아래 점수(95점도 포함) :  " + score);
		System.out.println("사이즈 : " + scores.size());
		System.out.println("-------------------------------------------------");
		//주어진 객체의 오른쪽에 있는 점수 (Lower)
		score = scores.higher(95);//95점 오른쪽 위에 점수,,,,,자기 자신은 포함하지 않는다=(주어진 객체는 포함하지 않는다.)
		System.out.println("95점 위에 점수 :  " + score);
		//ceiling는 자기자신 포함=(주어진 객체도 포함한다.)
		score = scores.ceiling(95);
		System.out.println("95점 위에 점수(95점도 포함) :  " + score);
		System.out.println("사이즈 : " + scores.size());
		System.out.println("-------------------------------------------------");
//		while(!scores.isEmpty()) {
//		System.out.println("pollFirst()실행");
////			pollFirst()는 맨 왼쪽 객체부터 가져온다. 단, 가져온 후 TreeSet에서 제거를 한다.
//			score = scores.pollFirst();
//			System.out.println("가져 온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
//		while(!scores.isEmpty()) {
//			System.out.println("pollLast()실행");
////			pollLast()는 맨 오른쪽 객체부터 가져온다. 단, 가져온 후 TreeSet에서 제거를 한다.
//			score = scores.pollLast();
//			System.out.println("가져 온 객체 : " + score);
//			System.out.println("남은 객체 수 : " + scores.size());
//		}
		
		
		//반복자 얻기
		Iterator<Integer> iterator = scores.iterator();
		while(iterator.hasNext()) {
			//pollFirst, pollLast메서드와 iterator와 차이점은 
			//객체를 제거하느냐 안하느냐의 차이점이 있다.
			int value = iterator.next();
			iterator.remove(); //반복자는 이렇게 명시적으로 객체 제거해야한다.
			System.out.println(value + "남은 객체 수 : " + scores.size());
		}
	}

}
