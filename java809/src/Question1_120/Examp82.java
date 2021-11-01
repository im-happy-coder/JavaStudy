package Question1_120;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Examp82 {

	public static void main(String[] args) {
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5")); 
		long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
		System.out.println("Travel time is" + hrs + "hours");
	} //답 : Travel time is4hours

}
/*
ZonedDateTime는 LocalDateTime과 달리 타임존 또는 시차 개념을 가지고 있는 클래스입니다.
public 생성자를 제공하지 않기 때문에 객체를 생성할 때는 now()나, of()와 같은 정적 메소드를 사용하도록 설계되어 있습니다.
ZoneID를 통해서 타임존 정보를 넘기면 원하는 지역의 시간을 얻을 수 있습니다.




ChronoUnit.HOURS.between(depart, arrive)은  두 매개변수의 시간차이를 Hours 시간으로 나타낸다
하지만, ZoneId.of("UTC-7"),ZoneId.of("UTC-5") 서로의 국가 시간을 다르게 했으므로
시간차이는 6이 나오지만
UTC-7-UTC-5 = 2
6-2 = 4HOURS
*/