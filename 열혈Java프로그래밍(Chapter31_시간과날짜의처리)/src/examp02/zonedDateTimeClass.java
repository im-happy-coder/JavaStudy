package examp02;

import java.time.Duration;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class zonedDateTimeClass {

	public static void main(String[] args) {
//		시간대를 반영한 ZonedDateTime클래스
		
		//이곳의 현재 날짜와 시각
		ZonedDateTime here = ZonedDateTime.now();
		System.out.println(here);
		
		//동일한 날짜와 시각의 파리
		ZonedDateTime paris = ZonedDateTime.of(here.toLocalDateTime(), ZoneId.of("Europe/Paris")); //날짜와 시각 정보만 LocalDateTime인스턴스에 담아서 반환
		System.out.println(paris);
		
		//이곳과 파리의 시차
		Duration diff = Duration.between(here, paris);
		System.out.println(diff);
		
//		2021-02-01T17:31:54.063+09:00[Asia/Seoul] +09:00는 영국 런던(기준)을 근거로해서 기준점보다 9시간 빠르다
//		2021-02-01T17:31:54.063+01:00[Europe/Paris]
//				PT8H = 8시간의 시간차

	}

}
