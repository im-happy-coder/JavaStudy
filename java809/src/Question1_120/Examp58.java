package Question1_120;

import java.util.function.ToIntFunction;

public class Examp58 {
	public static void main(String[] args) {
//		indexOf() 메서드는 배열에서 지정된 요소를 찾을 수 있는 첫 번째 인덱스를 반환하고 존재하지 않으면 -1을 반환합니다.
		String str = "Java is a programming language";
		ToIntFunction<String> indexVal = str::indexOf; //line n1   indexOf()는 값이 있으면 해당 값의 인덱스를 출력 ,, 없으면 -1
		int x = indexVal.applyAsInt("Java"); //line n2   //즉, indexOf가 Java 요소를 찾고 찾으면 그 요소의 위치 index를 반환한다.
//							"Java"는 0번째 인덱스에 있으므로 0을 반환
		System.out.println(x);
		
	}
}
