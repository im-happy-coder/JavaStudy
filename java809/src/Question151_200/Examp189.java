package Question151_200;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Examp189 {

	public static void main(String[] args) {
											//of(년,  월, 일 , 시, 분, 초, 나노초, ZoneID.of(세계시간))
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 1, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5")); 
		long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1   //여기서 시간차이를 구함 --MINUTES하면 360이 나옴
		System.out.println("Travel time is" + hrs + "hours");
		
		
		//답 : B. Travel time is 6 hours
		
// 쉽게 구하는법.....  (1+7)-(9+5)=6		
	}

}
