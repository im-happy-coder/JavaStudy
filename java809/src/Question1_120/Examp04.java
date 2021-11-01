package Question1_120;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Examp04 {

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
		(o1); } } );
		treeMap.putAll (unsortMap);
		for (Map.Entry<Integer, String> entry : treeMap.entrySet () ) {
		System.out.print (entry.getValue () + " ");
		}
//		return o2.compareTo(o1); } } ); 키를 기준으로 내림차순
//		return o1.compareTo(o2); } } ); 키를 기준으로 오름차순
		
//		답 : j z e b d 
		
	}

}
