package example04;

import example04.Outside.Inner;

public class Ex {

	public static void main(String[] args) {


		Outside outside = new Outside();
		Outside.Inner inner = outside.new Inner();
		
		inner.showInfo();
		outside.show();
	}

}
