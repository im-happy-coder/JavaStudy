package examp02;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class zonedDateTimeClass3 {

	public static void main(String[] args) {
//		날짜와 시각 정보의 출력 포맷 지정
//		y,m,d 년 월 일-----h,m,s 시분초----vv는 시간대 ID의 출력을 의미
		ZonedDateTime date = ZonedDateTime.of(LocalDateTime.of(2019, 4, 25, 11, 20), ZoneId.of("Asia/Seoul"));
		
//		출력의 포맷 정보는 java.time.format.DateTimeFormatter 인스턴스에 담는다.
		DateTimeFormatter fm1 = DateTimeFormatter.ofPattern("yy-m-d");
		DateTimeFormatter fm2 = DateTimeFormatter.ofPattern("yyyy-mm-d, H:m:s");
		DateTimeFormatter fm3 = DateTimeFormatter.ofPattern("yyyy-mm-d, HH:mm:ss VV");
		
//		LocalDate, LocalTime, LocalDateTime, ZonedDateTime에 모두 존재하는 format 메소드 호출한다.
		System.out.println(date.format(fm1));
		System.out.println(date.format(fm2));
		System.out.println(date.format(fm3));
		
	}

}
