package examp04;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		//Map의 특징 키가 동등객체라면 중복 저장 하지 않는다.
		map.put(new Student(1001, "홍길동"), 95);  // 이 두개의 값이 같아서 true를 반환하고 는 논리적 동등객체가 되었다.
		map.put(new Student(1001, "홍길동"), 90);  // 키가 같기 때문에 중복 저장이 안된다.
		map.put(new Student(2001, "신은혁"), 100);
		map.put(new Student(3001, "김주성"), 58);
		System.out.println("총 Entry 수 : " + map.size());
		//뒤에 저장된 것으로 대체된다.
		System.out.println("홍길동 : " + map.get(new Student(1001, "홍길동")));
		
		
		//map에 key의 객체들만 가져와서 구슬 주머니에 담는다.
		Set<Student> keySet = map.keySet();
		Iterator<Student> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			Student key = keyIterator.next();
			System.out.println("학번 :" + key.getSno() + "  이름 :" + key.getName()
								+ "  " + "점수 : " + map.get(new Student(key.getSno(), key.getName())));
		}
	}

}
