package clothing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Examp215 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date = LocalDate
				.parse("2014-05-04")
				.format(DateTimeFormatter.ISO_DATE_TIME);
		System.out.println(date);
	}

}
