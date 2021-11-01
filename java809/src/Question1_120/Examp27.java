package Question1_120;
enum USCurrency {
PENNY (1),
NICKLE(5),
DIME (10),
QUARTER(25);
private int value;
USCurrency(int value) {  //private USCurrency(int value) 
this.value = value;
}
public int getValue() {return value;}
}
public class Examp27 {
	public static void main(String[] args) {
		USCurrency usCoin =new USCurrency.DIME;  //USCurrency usCoin = USCurrency.DIME;  
		System.out.println(usCoin.getValue());
		}
		
	}

//Examtopic 사이트는 C는 맞는데 B가 public이 아닌 private가 되어야 하는데 답이 이상함
//B. Make the USCurrency enumeration constructor public.
//C. Remove the new keyword from the instantion of usCoin.


//이게 정답
//B.Make the USCurrency enumeration constructor private.  ---- B. USCurrency 열거 생성자를 private 으로 만듭니다.
//C.Remove the new keyword from the instantion of usCoin. ---- C. usCoin 인스턴스에서 new 키워드를 제거
// 
