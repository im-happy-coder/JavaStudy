package examp07;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetSearchEx {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>();
		//알파벳의 유니코드에 따라 이진트리에 각각 좌측부터 저장된다.
//		treeSet.add("apple");
//		treeSet.add("f");
//		treeSet.add("forever");
//		treeSet.add("description");
//		treeSet.add("ever");
//		treeSet.add("zoo");
//		treeSet.add("guess");
//		treeSet.add("cherry");
//		System.out.println(treeSet);
		treeSet.add("가라");
		treeSet.add("나가");
		treeSet.add("다시는");
		treeSet.add("라");
		treeSet.add("라볶이");
		treeSet.add("라면");
		treeSet.add("마");
		treeSet.add("바");
		treeSet.add("사");
//		System.out.println("[c~f]사이에 단어를 검색 해보기");
		//c부터 시작해서 f까지 검색하는데 f는 f한 자만 허용한다 말그대로 "f"만 된다
		//즉 , f포함 2자 이상은 허용 안한다.
//		NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
//		System.out.println(rangeSet);
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("[가~라]사이에 단어를 검색 해보기");
		NavigableSet<String> rangeSet1 = treeSet.subSet("가", true, "라", true);
		System.out.println(rangeSet1);
	}

}
