package example02;

class A {
	int data1 = 10;
	int data2 = 30;
}
public class AccumulatorEx {

	public static void main(String[] args) {

		Accumulator ac = new Accumulator();
		
		int iresult = ac.add(10, 50);
		System.out.println("result  :  "  +  iresult);
		
		//접미사를 반드시 붙이도록 합시다
		//L을 붙이지 않으면 int형(기본형)으로 출력되는걸 볼 수 있다.
		long lresult = ac.add(100, 7500L);
		System.out.println("lresult  :  "  +  lresult);
		
		lresult = ac.add(1000L, 10);
		System.out.println("lresult  :  "  +  lresult);
		
		double dresult = ac.add(107.88, 11.55);
		System.out.println("dresult  :  "  +  dresult);
		
		long arrResult = ac.add(new int[] {1, 2, 3, 4, 5});
		System.out.println("arrResult  :  "  +  arrResult);
		
		iresult = ac.add(new A());
		System.out.println("iresult  :  "  +  iresult);
	}

}
