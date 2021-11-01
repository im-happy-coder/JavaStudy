package objectsExample;

import java.util.Arrays;
import java.util.Objects;

public class Person {

	int age;
	String name;
	int[] arr;
	
	public Person(int age, String name, int[] arr) {
		super();
		this.age = age;
		this.name = name;
		this.arr = arr;
	}
	
	@Override						// this.arr.hashCode()를 주었을때 배열에서 해쉬코드를 불러와서 서로 주소가 다르게 나왔다.
	public int hashCode() {			//배열 arr같은 경우는 arr[0] arr[1] ...등 코드가 길어지는 문제가 있다 //this.arr  = Arrays.toString(this.arr).hashCode()를 사용
		//하위호환을 아래와 같이 작성을하면 된다.(구버전 해쉬코드 JDK 1.5이하) 아래와 같이 작성
//		return this.age + this.name.hashCode() + Arrays.toString(this.arr).hashCode(); //name은 String이기 때문에 int타입인 hashcode로 반환 할수 없으므로 name.hashCode()로 바꿔줘야한다.
		//신규개발 할때, 아래와 같이 작성을 하면 해쉬코드 얻기가 상당히 수월하다( 신버젼)
		return Objects.hash(this.age, this.name, Arrays.toString(this.arr)); //Objects.hash()는 배열이든 String이든 뭐가 오든 상관없다 //Objects는 Arrays.toString(this.arr)를 사용
	}
	
}
