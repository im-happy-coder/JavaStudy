package Question151_200;

public class Examp170 {

	public static void main(String[] args) {
		int a = 10;
		int b = -1;
		assert (b >=1) : "Invalid Denominator";
		int c = a / b;
		System.out.println (c);
	}

}
//What is the result of running the code with the -da option? --문제잘보자 -da와 -ea 바꿔서 나오는듯

//-da 옵션이면 답이 -10이 나옵니다ㅣ
//-ea 옵션이면 답이 C. An AssertionError is thrown.