package examp05;

public class CompareEx {

	public static void main(String[] args) {
		
		
		int result = Compare.compare(100, 200); //compare는 앞에수가 작으면 -1 같으면 0 앞에가 크면 1
		System.out.println(result);
		
		
//		String클래스는 Number클래스하고 아무런 관계가 없다
//		Compare.compare("홍길동", "장발장");
		
//		Number클래스는 Object클래스의 자손이기 때문에 매개변수 타입으로 적합하지 않다.
//		Compare.compare(new Object(), new Object());
		
		result = Compare.compare(new Integer(100), new Double(75.11));  //앞에거가 큰 수 이므로 1이 나옴
		System.out.println(result);
		
//		Number는 추상 클래스이므로 인스턴스를 생성하지 못한다.
//		result = Compare.compare(new Number(), new Number());
		
	}

}
