package Question121_150;

interface Interface1{
	public default  void sayHi() {
		System.out.println("Hi Interface-1");
	}
}
interface Interface2{
	public default  void sayHi() {
		System.out.println("Hi Interface-2");
	}
}
public class Examp141 implements Interface1, Interface2{

	public static void main(String[] args) {
		
		Interface1 obj = new Examp141();
		obj.sayHi();
		
	}

	@Override
	public void sayHi() {
		System.out.println("Hi MyClass");
	}

}

/* 디폴트 메서드는 구현내용을 정의할 수있고
 * 재정의도 가능하다
 */

// 답 : D. Hi MyClass