package example04;

public class ReferenceParamEx {
	
	public static void main(String[] args) {
		//참조형매개변수
		//Call by reference
				
		A a = new A();
		a.data = 77;
		System.out.println("메서드 호출전 main()내의 값  : " + a.data);
		//동생한테 "시계가 어딨니"라고 물어보는 형태라서 값을 읽고 수정도 할 수 있다.
		//Call by reference(주소에 의한 호출) - read+write
		ReferenceParamEx.dataChange(a);
		System.out.println("dataChange()메서드 호출 후 " + a.data);
	}
	//int[], double[], String --> 참조변수형태 호출
		public static void dataChange(A a) {
		//a라는 주소값이 매개변수로 넘어 왔기 때문에 주소를 공유한다.
		//a라는 주소를 공유를 하게 되면 호출한 곳에서 영향을 무조건 받는다.
		a.data = 44;
		System.out.println("dataChange()메서드 내의 값 : " + a.data);
		return;
	}
}
