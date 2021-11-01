package example01;

public class FieldInitEx { 

	public static void main(String[] args) { //붕어빵을 만드는거임 //제품을 생산 하고 있다.
		//new연산자가 클래스의 있는 멤버들의 바이트크기 만큼
		//힙에다가 메모리 할당을 하며 동시에 초기화를 시켜주는
		//역할을 한다.
		FieldInit fi = new FieldInit();  //fi는 리모컨과 같은 개념이다.
		System.out.println(fi.byteField);
		System.out.println(fi.boolField);
		System.out.println(fi.arrField);
		System.out.println(fi.floatField);
		
		
		System.out.println(fi); 
		
		
		
	}

}
