package sec01.example03;

@FunctionalInterface  //함수적 인터페이스(@FunctionalInterface) = 추상메서드가 하나인 인터페이스 
public interface MyInterface {
	//2개의 매개변수와 리턴값이 존재하는 추상메서드이다.
	int method(int x, int y);
}
