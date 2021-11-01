package example03;

//인터페이스의 본질은 추상메서드 이다
//static final은 부수적  개념
public interface A {
	int MAX = 10; //static final 생략가능하다 즉, int MAX = 10;은  static final int MAX = 10;이다.
	void method(); //인터페이스는 public abstract 생략가능하다  즉, 이 문장은 public abstract void method();이다.
}
