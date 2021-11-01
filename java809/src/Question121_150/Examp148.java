package Question121_150;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Test{
	List<String> list = null;
	public void printValue() {
		System.out.println(getList());
	}
	public List<String> getList(){return list;}
	public void setList(List<String> newList) {list=newList;};
}
public class Examp148 {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("Dog","Cat","Mouse");
		Test t= new Test();
		t.setList(li.stream().collect(Collectors.toList()));
		t.getList().forEach(Test::printValue); //사용불가
//		t.getList().forEach(System.out::print); //이렇게하면 출력됨,, 일때의 답 : DogCatMouse
		//이유 : forEach(Consumer)다 즉, Consumer소비자는 매개값만있고 리턴값이 없다 
		// 그래서 정적 메서드 참조(클래스 :: 메서드) 사용할수 없다.
	}
}


//답 : B. A compilation error occurs.
//B because void forEach(Consumer action)