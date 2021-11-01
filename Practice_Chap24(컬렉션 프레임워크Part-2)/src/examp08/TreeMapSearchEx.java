package examp08;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapSearchEx {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		//객체 추가
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("f", 64);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 100);
		treeMap.put("guess", 80);
		treeMap.put("banana", 90);
		treeMap.put("kdb", 80);
		treeMap.put("cherry", 15);
		treeMap.put("A", 80);
		treeMap.put("B", 80);
		treeMap.put("K", 80);
		treeMap.put("Z", 80);
		treeMap.put("D", 80);
		
		
		for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
			System.out.println(entry);
		}
		//c부터 f까지만 검색, f글자뒤에 값이 있으면 검색이 안된다.
		System.out.println("[c~f]사이의 단어 검색하기");
		NavigableMap<String, Integer> rangeMap = treeMap.subMap("c", true, "f", true);
		Set<Map.Entry<String, Integer>> entrySet = rangeMap.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + "-페이지 번호 : " + value);
		}
		System.out.println("----------------------------------------------");
		//"d"를 포함하고 이후 값들만 가지는 Map.Entry객체를 얻어내기
		System.out.println("d포함 이후 단어 검색하기"); //subMap은 중간, tailMap
		NavigableMap<String, Integer> tailMap = treeMap.tailMap("d", true);
		for(Map.Entry<String, Integer> entry : tailMap.entrySet()) { //tailMap.entrySet()이 방법도 가능
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + "-페이지 번호 : " + value);
		}
		System.out.println("----------------------------------------------");
		//"g"를 포함하고 이전 값들만 가지는 Map.Entry객체를 얻어내기
		System.out.println("g포함 이전 단어 검색하기"); //subMap은 중간, tailMap, headMap
		NavigableMap<String, Integer> headMap = treeMap.headMap("g", true);
		for(Map.Entry<String, Integer> entry : headMap.entrySet()) { //tailMap.entrySet()이 방법도 가능
			String str = entry.getKey();
			int value = entry.getValue();
			System.out.println("단어 : " + str + "-페이지 번호 : " + value);
		}
	}
}
