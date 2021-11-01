package example04;

public class ReferenceParamArrayEx {

	public static void main(String[] args) {
		
		int[] arr = new int[] { 10, 20, 30, 40, 50};
		System.out.println("Change()메서드 호출 전의 값  :  " + arr[0]);
		System.out.println("main() arr의 주소값 : " + arr);
		Change(arr);//배열명은 곧 주소다.
//		Change(new int[] {10,20,30}); //좌측과 같이 주소값을 넘겨도 된다.
		System.out.println("Change()메서드 호출 후 main()의 값  :  " + arr[0]); //(Call by reference)주소가 넘어갔기 때문에 999가 출력됨
		
	}
	
	public static void Change(int[] arr) {
		System.out.println("Change() arr의 주소값 : " + arr);
		arr[0] = 999;
		System.out.println("Change()메서드 내의 값 : " + arr[0]);
		return;
	}

}
