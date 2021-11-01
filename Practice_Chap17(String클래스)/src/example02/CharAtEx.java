package example02;

public class CharAtEx {

	public static void main(String[] args) {
		
		String ssn = "980203-2456781";
		//특정 문자를 받고자 할 때 사용하는 CharAt()
		char sex = ssn.charAt(7);
		
		if(sex == '1' || sex == '3') {
			System.out.println("남자입니다.");
		}
		else if(sex == '2' || sex == '4') {
			System.out.println("여자입니다.");
		}
		else {
			System.out.println("사람이 아닙니다.");
		}
	}

}
