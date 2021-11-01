package Question1_120;


public class Examp89 {
		public static void doStuff(String s) {
	try {
		if(s==null) {
			throw new NullPointerException();  //만약 null이 아니면 이 예외를 던지지 않음
		}
	} finally {
		System.out.println("-finally-");  // finally는 try 구문에서 예외가 발생하는 것과 상관없이 언제나 실행되는 로직이다.
	} System.out.println("-doStuff-");
	}
	public static void main(String[] args) {
		
		
		try {
			doStuff(null);   //doStuff("문자열"); 문자열이 들어가면 -finally--doStuff-
		}catch (NullPointerException npe) {
		System.out.println("-catch-");
		}
	}

}

//예외를 던지게 되면 문장이 끝나고 마지막에 실행됨

//만약 null이 문자열이 되면 답 : -finally--doStuff-

//답 : C. ""finally- -catch-
