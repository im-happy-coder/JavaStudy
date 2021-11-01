package Question201_248;
enum USCurrency {
PENNY (1),
NICKLE(5),
DIME (10),
QUARTER(25);
private int value;
USCurrency(int value) { //private 추가 
//private USCurrency(int value) 
this.value = value;
}
public int getValue() {return value;}
}
public class Examp222 {

	public static void main(String[] args) {
		USCurrency usCoin = new USCurrency.DIME; X
//		USCurrency usCoin = USCurrency.DIME; O 
		System.out.println(usCoin.getValue());
		
//		B.Make the USCurrency enumeration constructor private.
//		C.Remove the new keyword from the instantion of usCoin.
		// new 인스턴스를 지워야합니다.
		
		
		
		
//		https://www.briefmenow.org/oracle/which-two-modifications-enable-the-given-code-to-compile/
	}

}
