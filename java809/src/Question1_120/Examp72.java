package Question1_120;

public class Examp72 {
	public static void main(String[] args) {
		int rateOfInterest = 0;
		String accountType = "LOAN";
		switch (accountType) {
		case "RD":
		rateOfInterest = 5;
		break;
		case "FD":
		rateOfInterest = 10;
		break;
		default:
		assert false: "No interest for this account"; //line n1
		}
		System.out.println ("Rate of interest:" + rateOfInterest);
//		and the command:
//		java -ea RateOfInterest
//		What is the result?
	}
}
//B. An AssertionError is thrown.



/*
-ea 옵션을 주지 않고 실행했을 경우 A. Rate of interest: 0

-ea 옵션을 주었을 경우 An AssertionError is thrown.


Java의 assertion 문은 일반적으로 메서드의 매개 변수 범위가 전달되었는지 확인하기 위해 private 메서드 내에서 사용됩니다. 
assertion의 assertion 문이 false이면 AssertionError가 발생합니다.


*/