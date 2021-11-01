package Question1_120;




//싱글톤 예시
class ExampleClass {
    //Instance
    private static ExampleClass instance = new ExampleClass();

    //private construct
    private ExampleClass() {}

    public static ExampleClass getInstance() {
        return instance;
    }
}
public class Examp52 {public static void main(String[] args) {}}
/*
싱글 톤 디자인 패턴을 사용하여 싱글 톤 클래스를 작성하려고합니다.
디자인의 단일 특성을 적용하는 두 문장은 무엇입니까? (2 개 선택)
You want to create a singleton class by using the Singleton design pattern.
Which two statements enforce the singleton nature of the design? (Choose two.)

A. Make the class static.
B. Make the constructor private.
C. Override equals() and hashCode() methods of the java.lang.Object class.
D. Use a public reference to point to the single instance.
E. Implement the Serializable interface.
F. Make the single instance created static and final.
 
A. 클래스를 정적으로 만듭니다.
B. 생성자를 비공개로 만듭니다.
C. java.lang.Object 클래스의 equals () 및 hashCode () 메서드를 재정의합니다.
D. 공개 참조를 사용하여 단일 인스턴스를 가리 킵니다.
E. Serializable 인터페이스를 구현합니다.
F. 생성 된 단일 인스턴스를 정적이고 최종적으로 만듭니다.

답 : B, F

*/



