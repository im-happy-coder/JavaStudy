package arraysExample;

import java.util.Arrays;
import java.util.Objects;

class Car{
	String model;
	
	public Car(String model) {
		this.model = model;
	}
	@Override
	public String toString() {
		return this.model;
	}
}

public class ArraysEqualsDeepEqualsEx {
	
	public static void main(String[] args) {

		int[] ori = new int[] {1, 2};
		int[] cloned = Arrays.copyOf(ori, ori.length);
		
		
		//얕은비교 
		System.out.println(Arrays.equals(ori, cloned));
		System.out.println(Objects.equals(ori, cloned));
		System.out.println(ori);
		System.out.println(cloned);
		
		System.out.println("------------------------------");
		
		Car[] c1 = new Car[2];
		c1[0] = new Car("그랜저");
		c1[1] = new Car("트럭");
		
		Car[] c2 = Arrays.copyOf(c1, c1.length);
		System.out.println(Arrays.equals(c1, c2));
		System.out.println(Objects.equals(c1, c2));
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("------------------------------");
		
		
		//2차원 배열 생성
		int[][] original = new int[][] {
											{1,2},
											{3,4}
										};
										
		//얖은 복사
		int[][] cloned1 = Arrays.copyOf(original, original.length);	//original와 cloned1는 서로 주소를 공유하고 있다. 값도 같다
		System.out.println(Arrays.equals(original, cloned1)); //Arrays.equals original와 cloned1주소값이 같다
		System.out.println(Arrays.deepEquals(original, cloned1)); //값비교
//		System.out.println(Objects.equals(original, cloned1));
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned1[0] : " + cloned1[0]);
		System.out.println(original);
		System.out.println(cloned1);
		System.out.println("------------------------------");
		
		//얖은 복사는 original와 cloned1 둘중 하나만 값이 바껴도 서로 같은 주소를 공유하기 때문에 값이 같이 바뀐다.
		//서로 주소가 같기 때문에 값이 같이 변한다
		cloned1[0][0] = 10;
		System.out.println(Arrays.deepEquals(original, cloned1));
		System.out.println(original[0][0]);
		System.out.println(cloned1[0][0]);
		System.out.println("------------------------------");
		
		
		//깊은 복사
		int[][] cloned2 = Arrays.copyOf(original, original.length);
		cloned2[0] = Arrays.copyOf(original[0], original[0].length);
		cloned2[1] = Arrays.copyOf(original[0], original[0].length);
		
		System.out.println(Arrays.equals(original, cloned2)); 
		System.out.println(Arrays.deepEquals(original, cloned2));
		System.out.println("original[0] : " + original[0]);
		System.out.println("cloned2[0] : " + cloned2[0]);
		System.out.println(original);
		System.out.println(cloned2);
		System.out.println("------------------------------");
		
		cloned2[0][0] = 50;
		System.out.println("------------------------------");
		System.out.println(Arrays.equals(original, cloned2)); 
		System.out.println(Arrays.deepEquals(original, cloned2));
		System.out.println(original[0][0]);
		System.out.println(cloned2[0][0]);
	}

}
