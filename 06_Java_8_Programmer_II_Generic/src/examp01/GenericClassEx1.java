package examp01;

public class GenericClassEx1 {

	public static void main(String[] args) {
//		일반 클래스의 정의 List와 몇 가지 메서드를 살펴보면이 클래스가 제네릭과 함께 작동하도록 설계되는 방법을 알 수 있습니다.
//
//		public interface List<E> extends Collection<E> {
//		    boolean add(E e);
//		    Iterator<E> iterator();
//		}
//		E for element = 요소
//		K for a map key = 키
//		V for a map value = 벨류
//		T, U for data types = 데이터 타입
//		List<String> list = null;
//		E에 값이 지정되고 String유형 E이 정의 된 위치 String가 사용됩니다.
		
		
		//제네릭 메서드
//		class Utils {
//		    public static <T> void print(T t) {
//		        System.out.println(t);
//		    }
//		}
//
//		이것은 유형의 인수를 취하는 메소드를 정의합니다 T. 다음은 일반 메서드의 두 가지 예입니다.
//		<T> void genericMethod1(List<T> list) { }
//		<T, U> T genericMethod2(U u) {
//		    T t = null;
//		    return t;
//		}
//
//		메서드가 자신의 제네릭 형식을 선언 할 때 반환 형식 앞에 지정해야합니다 (클래스 이름 뒤에 선언하는 클래스와 달리).
//		첫 번째 예제의 메서드를 호출하려면 다음과 같이 정상적으로 수행 할 수 있습니다.
//		Utils().print(10);
//		또는 점과 메서드 이름 사이에 유형을 명시 적으로 지정합니다.
//		Utils().<Integer>print(10);
	}

}
