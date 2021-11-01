package examp01;

public class whlidCardEx1 {
	public static void main(String[] args) {
//		List<Object> list = new ArrayList<String>();  //컴파일 되지 않는다.
//		그러나 와일드 카드 매개 변수를 사용하도록 선언을 변경하는 경우 :
//			List<?> list = new ArrayList<String>(); //컴파일 된다
		
//		다음 코드는 컴파일되지 않습니다.
//		List<?> list = new ArrayList<String>();
//		list.add("Hi"); // Compile-time error
		
		//첫번째 문제점
//		// 여기에서 모든 유형의 목록을 전달할 수 있습니다.
//		int getSize(List<?> list) {  
//		    return list.size();
		//두번째 문제점
//		class Printer<T> {
//			   public void print(T t) {
//			      System.out.println(t.toUpperCase());// Error
//			   // T가 문자열을 나타내지 않으면 어떻게됩니까?
//			   }
//			}
		
//		해결책은 소위 경계 와일드 카드를 사용하는 것입니다.
//
//		? extends T (상한 와일드 카드)   익상 = extends는 상위 클래스 제한
//		? super T (하한 와일드 카드)     수하  = super는 하위 클래스 제한
		
		//위의 오류 해결법
//		class Printer<T extends String> {
//			   public void print(T t) {
//			      System.out.println(t.toUpperCase());//OK!
//			   }
//			}
//		Printer<String> p1 = new Printer<>(); // OK
//		Printer<Byte> p2 = new Printer<>(); // Error, Byte is not a String
		
		
		//또 다른 해결법
//		List<Object> list =
//		        new ArrayList<String>(); // Error
//		List<? extends Object> list2 =
//		        new ArrayList<String>(); // OK!
//		그래도 목록을 수정할 수 없습니다.
//		list2.add("Hi"); // Compile-time error
//		이유는 같습니다. 컴파일러는 여전히 목록에 어떤 유형이 있는지 알 수 없습니다 (어떤 유형도 추가 할 수 있음).
		
		
		
		List<Integer> listInteger = new ArrayList<>();
		List<Float> listFloat = new ArrayList<>();
		List<Number> listNumber = new ArrayList<>();
		listNumber.add(new Integer(1)); // OK
		listNumber.add(new Float(1.0F)); // OK
		listNumber = listInteger; // Error
		listNumber = listFloat; // Error

		List<? extends Number> listExtendsNum = new ArrayList<>();
		// 이로 인해 오류가 발생합니다.
		// listExtendsNum.add (new Integer (1));
		listExtendsNum = listInteger; // OK
		listExtendsNum = listFloat; // OK
		
		
		//수하 = 하위 클래스제한 ,, 즉 상위 클래스 Object가 가능하기 때문에 list.add가 가능함
//		List<? super Integer> list = new ArrayList<>();
//		list.add(1); // OK!
//		list.add(2); // OK!
		
		
//		따라서 혼동하지 마십시오. 한 가지는 할당 할 수있는 것이고 다른 것은 추가 할 수있는 것입니다. 예를 들면 다음과 같습니다.
		List<Integer> listInteger = new ArrayList<>();
		List<Object> listObject = new ArrayList<>();
		List<? super Number> listSuperNum = new ArrayList<>();
		listSuperNum.add(new Integer(1)); // OK
		listSuperNum.add(new Float(1.0F)); // OK
		listSuperNum = listInteger; // Error!
		listSuperNum = listObject; // OK
		
		
		
		
		//주의 사항
		1.제네릭은 기본 유형에서 작동하지 않습니다.
		// Use Wrappers instead
		List<int> list = new ArrayList<>(); 

		
		
		
		2.유형 매개 변수의 인스턴스를 작성할 수 없습니다.
		class Test<T> {
		   T var = new T();
		   // You don't know the type's constructors
		}

		
		
		
		3.static유형 매개 변수의 필드는 선언 할 수 없습니다 .
		class Test<T> {
		   // If a static member is shared by many instances,
		   // and each instance can declare a different type,
		   // what is the actual type of var?
		   static T var;
		}

		
		
		
		4.유형 삭제로 인해 instanceof제네릭 유형과 함께 사용할 수 없습니다 .

		if(obj instanceof List<Integer>) { // Error
		}
		if (obj instanceof List<?>) {
		    // It only works with the unbounded 
		    // wildcard to verify that obj is a List
		} 

		
		
		
		5.제네릭 유형의 배열을 인스턴스화 할 수 없습니다.
		class Test<T> {
		    T[] array; // OK
		    T[] array1 = new T[100]; // Error
		    List<String>[] array2 = new List<String>[10]; // Error
		}

		
		
		
		
		
		6.제네릭 유형을 생성, 포착 또는 던질 수 없습니다.
		class GenericException<T> extends Exception { } // Error

		<T extends Exception> void method() {
		    try {
		        // ...
		    } catch(T e) {
		        // Error
		    }
		}

		
		
		
		
		7.그러나 throws절 에서 유형 매개 변수를 사용할 수 있습니다 .

		class Test<T extends Exception> {
		    public void method() throws T { } // OK
		}

		
		
		
		
		8.유형 삭제가 매개 변수를 동일한 유형으로 남겨 두는 메서드는 오버로드 할 수 없습니다.

		class Test {
		    // List<String> and List<Integer>
		    // will be converted to List at runtime
		    public void method(List<String> list) { }
		    public void method(List<Integer> list) { }
		}
		
		
		
	}
}
