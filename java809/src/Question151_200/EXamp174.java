package Question151_200;

class Foo<K, V>{
	private K key;
	private V value;
	public Foo(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public static <T> Foo<T, T> twice(T value) {return new Foo<T, T>(value, value);}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
}

public class EXamp174 {
	public static void main(String[] args) {
		Foo<String, Integer> mark = new Foo<Object, Object> ("Steve", 100);  //A
		Foo<String, String> pair = Foo.<String>twice ("Hello World!"); //B
		Foo<Object, Object> percentage = new Foo<Object, Object>("Steve", 100); //C
		Foo<String, String> grade = new Foo <> ("John", "A"); // D
		
//		Which option fails?
//		´ä : A. Foo<String, Integer> mark = new Foo<Object, Object> ("Steve", 100);
	}
}
