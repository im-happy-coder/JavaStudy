package example01;

//설계도, 붕어빵틀을 만드는 작업
public class FieldInit extends Object {  //붕어빵 설계도임 //extends Object 컴파일 시 자동생성 (생략가능)
	//기본형 변수
	byte byteField;	     //1
	short shortField;    //2
	int intField;        //4(디폴트 타입(기본))
	long longField;		//8
	
	boolean boolField;	//1
	char charField;		//2
	
	float floatField;	//4
	double doubleField; //8
	
	//참조형변수
	int[] arrField;		//4
	String strField;	//4
	
	
	//this : 객체자기자신의 주소
	//super : 조상객체의 주소
	
	
	//toString() : 클래스의 멤버변수(필드)의 값들을 수시로 확인하고자 할 때나, 
	//원하는 포맷으로 멤버변수들을 출력하고자 할때 사용을 많이 한다.
	@Override //annotation : 컴파일러에게 강한 컴파일 요구
	public String toString() {
		String str = "byteField : " + byteField + " shortField : " + shortField + " intField" + intField 
						+ " boolField : " + boolField + " strField : " + strField;
		
		return str;
	}
	
}
