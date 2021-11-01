package example01;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		
		//40바이트가 힙에 생성되었다.
		//arr1은 주소를 가리키는 참조변수다
		int[] arr1 = new int[10];
		
		
		//6바이트가 힙에 생성되어 있다.
		char[] chArr = new char[] {'a', 'b', 'c'};
		

		//arr1배열에다 난수를 10개 대입하고 있다.
		for(int i=0;i<arr1.length;i++) {
			//범위 : 1~10까지의 난수를 대입
			arr1[i] = (int)(Math.random()*10)+1; //math.random기본형이 double이기때문에 int형으로 강제 캐스팅해야한다.
		}
		
		//배열의 값들을 보기좋게 출력
		for(int i=0;i<arr1.length;i++) {
			if(i == 9) {
				System.out.print(arr1[i]);
			}
			else {
				System.out.print(arr1[i]+ ",");
			}
		}
		System.out.println();
		//Arrays클래스는 배열을 조작하기 쉽게 만들어 놓은 유틸리티 클래스
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(chArr));
		
		//주소값 출력
		//출력스트림에다가 참조변수를 넣으면, 참조변수명.toString()호출이된다.
		System.out.println(arr1.toString()); //타입@16진수
		System.out.println(arr1);
		//char타입은 주소를 출력할려면 반드시 toString()호출해야 한다.
		System.out.println(chArr.toString());
		System.out.println(chArr);
	}

}
