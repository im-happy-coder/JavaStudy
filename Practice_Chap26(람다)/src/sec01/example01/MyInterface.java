package sec01.example01;

@FunctionalInterface  //함수적 인터페이스(@FunctionalInterface) = 추상메서드가 하나인 인터페이스 
public interface MyInterface {
	void method();
//	void method1(); //추상메서드가 2개 이상이 되면 컴파일 예외를 발생시킴.
}
