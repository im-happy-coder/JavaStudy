package examp03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		//키가 String이고 Integer가 값이다.   둘 다 객체라는 것에 주목하자
		Map<String, Integer> map = new HashMap<>();
		System.out.println("사이즈 : " + map.size());
		
		//키와 값을 입력     --- 키는 중복을 허용하지 않음
		map.put("신은혁", 100);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		map.put("동장군", 95);
		System.out.println("총 사이즈 : " + map.size());
		//Map은 중복된 키를 저장하지 않는다,  홍길동과 동장군이 2번씩 저장이 되었는데
		//중복 저장이 될 경우에 마지막에 저장된 값으로  대체가 된다.!
		System.out.println("홍길동 : " + map.get("홍길동"));
		System.out.println("동장군 : " + map.get("동장군"));
		System.out.println("------------------------------------");
		
		//Map컬렉션에 있는 키를 Set계열로 바꾼다.
		Set<String> set = map.keySet();
		System.out.println("KeySet()을 이용해서 출력해 봄 ");
		
		//반복자 얻기
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			//위에서 얻은 키의 값을 가져옴
			int value = map.get(key);
			System.out.println(key + " : " + value);
		}
		System.out.println("------------------------------------");
		//Map컬렉션에 있는 Map.Entry객체를 대상으로 Set계열로 바꾼다.
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		System.out.println("EntrySet()을 이용해서 출력해 봄 ");
		//반복자 얻기
		Iterator<Entry<String, Integer>> entryiterator = entrySet.iterator();
		while(entryiterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryiterator.next();
			String key = entry.getKey();  //키
			int value = entry.getValue(); //값
			System.out.println(key + " : " + value);
		}
		System.out.println("------------------------------------");
		//전체 객체를 삭제
		map.clear();
		System.out.println("총 MapEntry 수 : " + map.size());
	}

}
