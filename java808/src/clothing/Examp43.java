package clothing;

import java.util.ArrayList;
import java.util.List;


class App1{
	int foo;  
	static int bar;
	static void process() {
		foo += 10;   // static메서드에는 일반멤버변수 사용 불가능
		bar += 10;
	}
}
public class Examp43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App1 a1 = new App1();
		a1.process();
		System.out.println(a1.bar);
		
		
		App1 a2= new App1();
		a2.process();
		System.out.println(a2.bar);
		
	}

}
