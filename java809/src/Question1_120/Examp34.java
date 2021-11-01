package Question1_120;
class Test<T> {
private T t;
public T get () {
return t;
}
public void set (T t) {
this.t = t;
}
}
public class Examp34 {
	public static void main (String args [ ] ) {
		Test<String> type = new Test<>();
		Test type1 = new Test (); //line n1
		type.set("Java");
		type1.set(100); //line n2
		System.out.print(type.get() + " " + type1.get());
	}
}

// 	답 : Java 100
// 제네릭 타입은 선언하지 않으면 자동 박싱되어 set의 매개값에 맞는 타입이 래핑된다.