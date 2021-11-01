package Question151_200;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Examp185 {

	public static void main(String[] args) {
		Map<Integer, String> unsortMap = new HashMap< > ( );
		unsortMap.put (10, "z");
		unsortMap.put (5, "b");
		unsortMap.put (1, "d");
		unsortMap.put (7, "e");
		unsortMap.put (50, "j");
		Map<Integer, String> treeMap = new TreeMap <Integer, String> (new
		Comparator<Integer> ( ) {
		@Override public int compare (Integer o1, Integer o2) {return o2.compareTo
		(o2); } } ); //o1.compareTo(o2) 오름차순 --- o2.o1이면 내림차순
		treeMap.putAll (unsortMap);
		for (Map.Entry<Integer, String> entry : treeMap.entrySet () ) {
		System.out.print (entry.getValue () + " ");
		}
	}

}

// 답 : B. d b e z j

//순서는 값이 아니라 프로젝트의 키를 기반으로합니다
