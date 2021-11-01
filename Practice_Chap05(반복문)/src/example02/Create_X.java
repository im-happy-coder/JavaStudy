package example02;

public class Create_X {

	public static void main(String[] args) {
//		*    *        //1번째 값 찍고 5번째 값 찍음
//		 *  *         //2번째 값 찍고 4번째 값 찍음
//         *          //3번째 값 찍음
//		 *  *		  //2번째 값 찍고 4번째 값 찍음
//		*    *	      //1번째 값 찍고 5번째 값 찍음
		
		//x, y는 서로 자리를 바꾸어 가면서, 조건에 대입이 되고
		//있으며, *의 자리값이 된다.
		int x=1;
		int y=5;
		
		for(int i=1; i<=5; i++) {         //5행
			for(int j=1; j<=5; j++) {     //5열
				if(j == x || j == y) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(); //줄바꿈
			x++;
			y--;
		}

	}

}
