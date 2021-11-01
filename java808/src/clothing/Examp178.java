package clothing;

import java.time.LocalDateTime;

public class Examp178 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDateTime dt = LocalDateTime.of(2014, 7,31,1,1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt);
	}

}
