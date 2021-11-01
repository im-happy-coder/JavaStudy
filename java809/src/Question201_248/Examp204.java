package Question201_248;
class UserException extends Exception { }
class AgeOutOfLimitException extends UserException { }
class App {
public void doRegister(String name, int age)
throws UserException, AgeOutOfLimitException {
if (name.length () < 6) {
throw new UserException ();
} else if (age >= 60) {
throw new AgeOutOfLimitException ();
} else {
System.out.println("User is registered.");
}
}
}
public class Examp204 {

	public static void main(String[] args) throws UserException {
		App t = new App ();
		t.doRegister("Mathew", 60);
	}

}
