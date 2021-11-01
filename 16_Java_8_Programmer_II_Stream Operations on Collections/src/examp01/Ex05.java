package examp01;

import java.util.Arrays;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(30, 5, 8);
         list.stream().max().get();  //C. 컴파일 실패
//		   max()는 Stream의 Compartor를 인수로 사용한다. . max최대 요소를 계산하는 방법을 아는 원시 스트림 의 방법과는 다릅니다.
	}

}
