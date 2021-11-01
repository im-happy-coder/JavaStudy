package clothing;

import java.time.LocalDate;

public class Example127 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date = LocalDate.of(2012, 1, 30).plusDays(10);
		date.plusDays(10);
		System.out.println(date);
		
		short s1 = 200;
		Integer s2 = 400;
//		String s3 = (String) (s1+s2);
		long s4 = (long) (s1+s2);
	}

}
