package Question151_200;

import java.time.LocalDate;
import java.time.Month;

public class Examp183 {

	public static void main(String[] args) {
		LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
		LocalDate next15days = valentinesDay.plusDays (15);
		LocalDate nextYear = next15days.plusYears(1); // line n1
		System.out.println(nextYear);
		
		//2016-03-01
		//2015년도는 2월이 28일까지 밖에 없음

	}

}
/*
 //66번 문제
Given the code fragment:

LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
LocalDate nextYear = valentinesDay.plusYears(1);
nextYear.plusDays(15); //line n1
System.out.println(nextYear);
What is the result?
2016-02-14
*/



