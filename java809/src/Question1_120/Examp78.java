package Question1_120;
interface Doable {
public void doSomething (String s);
}
//답 : C, E
abstract class Job implements Doable { public void doSomething(Integer i) { } 
}
//위는 추상 클래스이므로 일반 메서드를 구현할 수 있고, Doable의 메서드를 오버라이딩 할 수 없다.

class Do implements Doable { public void doSomething(Integer i) { } public void doSomething(String s) { } public void doThat (String s) { } }
//이 클래스는 Doable의 메서드를 무조건 오버라이딩해야하고 다른 추상메서드는 상관없다



//A. public class Task implements Doable { public void doSomethingElse(String s) { } }
// 메서드 이름이 doSomethingElse라서 오류

//B. public abstract class Work implements Doable { public abstract void doSomething(String s) { } public void doYourThing(Boolean b) { } }
//추상 메서드는 본문을 가질 수 없으므로 B는 올바르지 않습니다.

//C. public abstract class Job implements Doable { public void doSomething(Integer i) { } }
//D. public class Action implements Doable { public void doSomething(Integer i) { } public String doThis(Integer j) { } }
//E. public class Do implements Doable { public void doSomething(Integer i) { } public void doSomething(String s) { } public void doThat (String s) { } }





//https://vceguide.com/which-two-class-definitions-compile/
// 위사이트와 비교






public class Examp78 {}
