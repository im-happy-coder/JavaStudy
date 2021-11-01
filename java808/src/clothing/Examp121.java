package clothing;

import java.util.ArrayList;
import java.util.List;

public class Examp121 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Tech");
		arrayList.add("Expert");
		arrayList.set(0, "Java");  //0번쨰 배열의 값을 Java로 바꿈
		arrayList.forEach(a -> a.concat("Forum"));
		arrayList.replaceAll(s-> s.concat("Group"));
		System.out.println(arrayList);

	}

}
