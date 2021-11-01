package Question201_248;

import java.time.LocalDate;
import java.time.Month;

public class Examp242 {

	public static void main(String[] args) {
		LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
		LocalDate nextYear = valentinesDay.plusYears(1);
		nextYear.plusDays(15); //line n1
		System.out.println(nextYear);
		
//		A. 2016-02-14
	}

}
