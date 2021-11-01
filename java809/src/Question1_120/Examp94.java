package Question1_120;

class Product2{
	String pname;
	public Product2(String pname) {
		this.pname = pname;
	}
	
}
public class Examp94 {

	public static void main(String[] args) {
		Product2 p1 = new Product2("PowerCharger");
		Product2 p2 = p1;
		System.out.println(p1.equals(p2));  //equals 메소드는 비교하고자 하는 대상의 내용 자체를 비교하지만, == 연산자는 비교하고자 하는 대상의 주소값을 비교합니다.
		Product2 p3 = new Product2("PowerCharger");
		System.out.println(p1.equals(p3)); //false
	}

}

// 답 : D. true false
//자바에서는,
//String o1 ="java"
//String o2 = new String("java"); 이 둘을 다르게 취급한다. 밑에 String은 자바라는 값을 가진 객체로 취급한다.
//그리고 객체는 값이 같더라도 같은위치에 존재하지 않게된다. 그래서 o1 == o2 라고하면 다른 위치에 있기 때문에 false라는 값이 출력된다. 
//원시데이터 타입이 아닌 객체들은 equals라는 메소드를 가진다.
//따라서 원시데이터타입에는 동등비교연산자를 쓰면되고 객체나 비원시데이터타입에는 equals를 쓰면된다.
//그러나, String의 경우 특혜를 받고있다. 같은값을 집어넣었을때 변수가 같은 곳을 가리킨다.
//(허나 예외로 전시간에 입력값을 똑같이 줬는데 false가 떨어졌었다. 이는 내부적으로 입력값이 다른곳에 저장되었다는 뜻이다. )마치 원시데이터타입처럼 동작한다.