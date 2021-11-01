package examp01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx01 {

	public static void main(String[] args) {
		
//		ArrayList는 제네릭 타입이다. 그래서 Warning이 뜬다.
//		하여 없애고 싶다 우측상단 검색버튼을 클릭하여,  Error입력-->preference에 가서 Generics탭에 있는 것을 모두 ignore로 바꾸면 된다.
		
		ArrayList list = new ArrayList<>(); //기본적으로 10개의 방을 생성한다.
		System.out.println("총 크기 : " + list.size()); //저장된 객체가 하나도 없기 때문에 0을 리턴함.
		
		//객체 추가하기
		list.add("111");    //boolean add(Object o) --> 순차적 추가
		list.add("222");
		list.add("333");
		list.add("444");
		list.add(new Integer(333)); // list.add(111) 자동박싱
		System.out.println(list.size());
		System.out.println("ArrayList의 주소 " + list.hashCode());
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//0번째 인덱스에 "333" 추가하기
		list.add(0, "333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//앞에서 부터 검색하여 "333"을 삭제한다. (가까운 것 한개만 삭제)
		//객체 삭제하기
		list.remove("333");
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		
		System.out.println(list.remove("333"));
		System.out.println("ArrayList에 있는 값 : " + list.toString());
		
		//저장된 객체의 인덱스를 찾아오기(없으면 -1리턴한다.)
		System.out.println("index = " + list.indexOf("333"));
		System.out.println("index = " + list.indexOf(333));
		
		
		
		
//		아래와 같이 삭제하면 객체가 남는다. 남는 이유는 인덱스0를 삭제할때, i가 0이니까 당연히 0인덱스에 있는 객체는 삭제되지만 
//		이후 i값이 증가 되고, list의 객체들은 앞으로 당겨지면서 제대로 삭제 되지 않는다.
//		하여, 삭제를 시킬려면 항상 뒤에서 부터 삭제를 해주는 것이다.
//		for(int i=0; i<list.size(); i++) {
//			list.remove(i);
//		}
		
		
		//아래와 같이 삭제를 하면 IndexOutOFBoundsException이 발생한다. 이유는
		//size()값이 4인데, 인덱스는 3까지 있으니까 그렇다
//		for(int i=list.size(); i>=0;i--) {
//			list.remove(i);
//		}
		
		
		//올바른 방법 //list.clear(); 객체 통으로 전부 삭제
		for(int i=list.size()-1; i>=0;i--) {
			list.remove(i);
		}
		System.out.println("ArrayList에 있는 값 : " + list.toString());
	}

}
