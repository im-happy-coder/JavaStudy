package Question1_120;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

//In 2015, daylight saving time in New York, USA, begins on March 8th at 2:00 AM. As a result, 2:00 AM becomes 3:00 AM.
//2015 년 미국 뉴욕의 일광 절약 시간 제가 3 월 8 일 오전 2시에 시작됩니다. 결과적으로 오전 2 시가 오전 3 시가됩니다.
public class Examp97 {

	public static void main(String[] args) {
		ZoneId zone = ZoneId.of("America/New_York"); //시간 기준을 제시
		ZonedDateTime dt = ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1, 0), zone); //1:00이지만 뉴욕기준 1시간 더 추가
		//ZonedDateTime = LocalDateTime + 타임존/시차
		ZonedDateTime dt2 = dt.plusHours(2); //2시간을 추가했기때문에  difference(차이)는 2가 된다.
		System.out.println(DateTimeFormatter.ofPattern("H:mm - ").format(dt2)); //2시에서 2시간 더 추가해서 4시간
		System.out.println("difference: " + ChronoUnit.HOURS.between(dt, dt2));
	}

}


//답 : 4:00 - difference: 2


/*
 ZoneID를 통해서 타임존 정보를 넘기면 원하는 지역의 시간을 얻을 수 있습니다.
ZonedDateTime 클래스는 타임존 또는 시차 개념이 필요한 날짜와 시간 정보를 나타내기 위해서 사용됩니다. 
*/