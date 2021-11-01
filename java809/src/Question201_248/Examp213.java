package Question201_248;
class Foo<K, V> {
private K key;
private V value;
public Foo (K key, V value) {this.key = key; this.value = value;}
public static <T> Foo<T, T> twice (T value) {return new Foo<T, T> (value, value);}
public K getKey () {return key;} 
public V getValue () {return value;}
}
public class Examp213 {

	public static void main(String[] args) {
//		Which option fails?
//		A.	Foo<String, Integer> mark = new Foo<String, Integer> ("Steve", 100););
//		B. Foo<String, String> pair = Foo.<String>twice ("Hello World!");
//		C  Foo<?, ?> percentage = new Foo <> (97, 32););
//		D. Foo<String, String> grade = new Foo <> ("John", "A");
		 

//		All codes success!
	// 위 코드는 모두 가능
		
		
		//만약 고르라고 하면 C의  ";" 때문에 C일 수 도 있다.
	}

}
