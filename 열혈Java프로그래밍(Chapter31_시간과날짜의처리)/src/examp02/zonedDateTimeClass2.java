package examp02;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zonedDateTimeClass2 {

	public static void main(String[] args) {
//		시간대를 반영한 예제
//		[From 한국 to 프랑스]
//		한국 출발 현지 시간 2017년 12월 9일 14시 30분
//		파리 도착 현지 시간 2017년 12월 9일 17시 25분
//		비행에 걸린 시간은?
		
//		한국 출발 시간 2017-09-09 14:30
		ZonedDateTime departure = ZonedDateTime.of(LocalDateTime.of(2017, 12, 9, 14, 30), ZoneId.of("Asia/Seoul"));
		System.out.println("Departure : " + departure);
		
		
//		파리 도착 시간 2017-09-09 17:25
		ZonedDateTime arrival = ZonedDateTime.of(LocalDateTime.of(2017, 12, 9, 17, 25), ZoneId.of("Europe/Paris"));
		System.out.println("Arrival : " + arrival);
		
		//비행 시간
		System.out.println(Duration.between(departure, arrival));
	}

}
