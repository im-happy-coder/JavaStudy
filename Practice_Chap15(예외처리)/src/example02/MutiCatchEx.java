package example02;

import java.util.Arrays;

public class MutiCatchEx {

	public static void main(String[] args) {
		//다중 Catch
		try {
			
			int[] arr = new int[3];
			System.out.println(Arrays.toString(arr));
//			arr[3] = 100; //예외 발생-방이 부족하니까  -> arr[0], 1, 2 까지 있음 방은 -ArrayIndexOutOfBoundsException
			//위에서 예외가 발생하면 아래는 컴파일되지 않는다.!
			int result = 10/0; //예외 발생-Arithmetic
			System.out.println(result);
			
			//Catch구문에서 항상 Exception클래스는 맨 마지막에 와야 한다.!!
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스를 초과하였습니다.");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}  catch (Exception e) { //최고 조상클래스 Exception은 위에 있을 수 없다 - 무조건 아래에 있어야함!
			System.out.println("예외 발생");
		} finally {
			System.out.println("종료");
		}

	}

}
