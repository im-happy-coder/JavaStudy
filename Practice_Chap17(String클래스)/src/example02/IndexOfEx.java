package example02;

public class IndexOfEx {

	public static void main(String[] args) {
		//IndexOf()는 찾는 문자열이 있으면 받아오는 메서드이며 찾는 문자열이 없으면 -1을 반환한다.
		//indexOf메서드는 찾기 기능을 할때, 자주 쓰인다.(문서 등)
		String str = "오늘은 자바 공부 가 하기 싫네요";
		int index = str.indexOf("공부"); //indexOf가 리턴하는 타입이 int이므로 int로 받아줘야한다.  indexof에 마우스를 가져다 대면 반환 타입을 볼 수 있다.
		System.out.println("공부의 시작 방 번호 : " + index);

		//공부라는 문자열이 포함되어 있으면..
		if(str.indexOf("공부") != -1) {
			System.out.println("공부와 관련된 내용이군요.");
		}
		else {
			System.out.println("공부와 관련 없는 내용이군요");
		}
	}

}
