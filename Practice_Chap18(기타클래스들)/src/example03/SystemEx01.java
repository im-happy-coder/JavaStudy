package example03;

public class SystemEx01 {

	public static void main(String[] args) {

		for(int i=0; i<10; i++) {
			System.out.println(i);
//			if( i == 5) {
//				System.exit(0);
//			}
		}

		for(int i=0; i<10; i++) {
			System.out.println(i);
			if( i == 5) {
				//System.exit()는 프로그램을 종료, ()안에는 0을 준다.
				System.exit(0); // i가 5가 되었을때 프로그램을 종료한다.  = break문은 블럭을 빠져나가는 것이다.
			}
		}
	}

}
