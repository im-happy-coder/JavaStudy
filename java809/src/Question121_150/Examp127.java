package Question121_150;

class ProductCode<T, S extends T> {
	T c1;
	S c2;
}
public class Examp127 {

	public static void main(String[] args) {
		ProductCode<Number, Integer> c1 = new ProductCode<Number, Integer>(); /* c1
		instantiation */
		ProductCode<Number, String> c2 = new ProductCode<Number, String>(); /* c2
		instantiation */
		
//ProductCode 클래스를 정의하라는 요청을 받았습니다. P
//roductCode 클래스의 정의는 c1 인스턴스화가 성공하도록 허용해야하며 c2 인스턴스화에서 컴파일 오류를 발생시킵니다.
//요구 사항을 충족하는 ProductCode 정의는 무엇입니까?
//You have been asked to define the ProductCode class. 
//The definition of the ProductCode class must allow c1 instantiation to succeed and 
//		cause a compilation error on c2 instantiation.
//Which definition of ProductCode meets the requirement?
		
		//문제에서 c2는 컴파일 오류를 발생시키라고 했으므로 답은 B
	}
}


// B. class ProductCode<T, S extends T> {
//T c1;
//S c2;
//}