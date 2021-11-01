package example01;

public class StringBuilderEx {

	public static void main(String[] args) {

		//StringBuilder, StringBuffer클래스는 버퍼(임시저장메모리)를
		//이용하기 때문에 새로운 인스턴스가 생성되는것이 아니라, 하나의 인스턴스를
		//가지고 문자열을 조작할 수 있다.
		StringBuilder sBuilder = new StringBuilder("JAVA");
//		System.out.println(sBuilder.hashCode()); //주소를 보는 법 =.hashCode()
		
		sBuilder.append("Program"); //append 메서드를 사용해도 같은 주소를 가진다.
		System.out.println(sBuilder);
//		System.out.println(sBuilder.hashCode());
		
		sBuilder.insert(1, "나");  // 1번째 문자 "나"를 삽입
		System.out.println(sBuilder);
		
		sBuilder.insert(1, 100);  
		System.out.println(sBuilder);
		
		sBuilder.setCharAt(0, 'R');  // 0번째 문자를 'R'로 바꾼다.
		System.out.println(sBuilder);
		
		sBuilder.reverse();
		System.out.println(sBuilder);
		
		sBuilder.delete(0, 3); //0부터 3번째까지 지운다 (마지막 번호는 안된다- 0,1,2)
		System.out.println(sBuilder);
		
		int length = sBuilder.length();
		System.out.println("총 문자 수 : " + length);
	}

}
