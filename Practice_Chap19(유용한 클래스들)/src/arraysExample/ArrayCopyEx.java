package arraysExample;

import java.util.Arrays;

public class ArrayCopyEx {

	public static void main(String[] args) {

		int[] arr1 = new int[] { 10, 20, 30, 40};
		
		//1번째 배열 복사 방법(copyOf)
		int[] cloned = Arrays.copyOf(arr1, arr1.length);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
		System.out.println("-----------------------------------");
		
		
		//2번째 배열 복사 방법(copyOfRange) 범위복사
		cloned = Arrays.copyOfRange(arr1, 1, 3);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
		System.out.println("-----------------------------------");
		
		
		
		//3번째 배열 복사 방법(System.arraycopy) 시스템클래스
		System.arraycopy(arr1, 0, cloned, 0, 2);
		System.out.println("arr1 : " + Arrays.toString(arr1));
		System.out.println("cloned : " + Arrays.toString(cloned));
	}

}
