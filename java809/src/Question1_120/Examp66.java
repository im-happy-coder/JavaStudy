package Question1_120;

import java.time.LocalDate;
import java.time.Month;

public class Examp66 {

	public static void main(String[] args) {
		LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
		LocalDate nextYear = valentinesDay.plusYears(1);
		nextYear.plusDays(15); //line n1  
//		System.out.println(nextYear.plusDays(15));// 출력문을 주어야 15일이 플러스 된다. 2016-02-29
//		System.out.println(nextYear.plusDays(16)); //2016년은 2월 29일까지 밖에 없으므로 plusDays(16)을 주면  3월 1일이 된다. 2016-03-01
		// 출력문이 없으므로 아무런 영향을 주지 않는다.
		System.out.println(nextYear);
		
		
	}

}
//답 :  A. 2016-02-14

// 183문제