package Question1_120;

interface LengthValidator{
	boolean checkLength(String str);
}
public class FExamp110 {

	public static void main(String[] args) {
		
		boolean res = new LengthValidator() {
			@Override
			public boolean checkLength(String str) {
				return str.length() >5 && str.length() <10;
			}
		}.checkLength("Hello");
		
		
//		http://ocpj8.javastudyguide.com/ch10.html
		
		//		 ´ä : B. Predicate
	
	}

}
