package Question151_200;

import java.util.Map;
import java.util.TreeMap;

public class Examp175 {

	public static void main(String[] args) {
		Map<Integer, String> books = new TreeMap<>();
		books.put (1007, "A");
		books.put (1002, "C");
		books.put (1003, "B");
		books.put (1003, "B");
		System.out.println (books);
		//답 : {1002=C, 1003=B, 1007=A}
		//중복 허용안함
	}

}
/*
 TreeSet
- 하나의 노드는 노드 값인 value와 왼쪽과 오른쪽 자식 노드를 참조하기 위한 두 개의 변수로 구성
- TreeSet에 객체를 저장하면 자동으로 정렬되는데 부모값과 비교해서 낮은 것은 왼쪽 노드에, 높은 것
ex)TreeSet<Integer> treeSet = new TreeSet<Integer>(); 
	treeSet.add(new Integer(i*10));

         

TreeMap
- TreeSet과 차이점은 키와 값이 저장된 Map.Entry를 저장한다는 점
- TreeMap에 객체를 저장하면 자동으로 정렬되는데, 기본적으로 부모 키값과 비교해서 키 값이 낮은 것은 왼쪽 노드에, 키 값이 높은 것은 오른쪽 노드에 Map.Entry에 저장
ex)TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
        treeMap.put(new Integer(90), "Jack");


*/