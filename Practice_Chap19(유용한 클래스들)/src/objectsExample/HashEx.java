package objectsExample;

public class HashEx {

	public static void main(String[] args) {

		Person person1 = new Person(30, "홍길동", new int[] {178, 68});
		Person person2 = new Person(30, "홍길동", new int[] {178, 68});
		
		int[] arr1 = new int[] {178, 68};
		int[] arr2 = new int[] {178, 68};
		
		
		//배열에 대한 해쉬코드는 new라는 객체를 통해서 새로운 메모리를 가지기 때문에 주소가 다를 수 밖에 없다.
//		System.out.println(arr1.hashCode());
//		System.out.println(arr2.hashCode());
		System.out.println();
		System.out.println(person1.hashCode());
		System.out.println(person2.hashCode());
	}

}
