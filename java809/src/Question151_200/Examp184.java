package Question151_200;
class UserException extends Exception { }
class AgeOutOfLimitException extends UserException { }
class App {
public void doRegister(String name, int age)
throws UserException, AgeOutOfLimitException {
if (name.length () <= 60) {
throw new UserException ();
} else if (age > 60) {
throw new AgeOutOfLimitException ();
} else {
System.out.println("User is registered.");
}
}
}
public class Examp184 {

	public static void main(String[] args) throws UserException {
		App t = new App ();
		t.doRegister("Mathew", 60);
	}
	//답 :C. A UserException is thrown.

}
//https://www.briefmenow.org/oracle/what-is-the-result-974/   --문제 유형 똑같 참고