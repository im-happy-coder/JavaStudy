package Question151_200;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class Examp157 {

	public static void main(String[] args) {
		//사진참고
//		flush()는 현재 버퍼에 저장되어 있는 내용을 클라이언트로 전송하고 버퍼를 비운다.
//		D. bw.flush();
		ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 1, 0, 0, 0, ZoneId.of("UTC-7"));
		ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5")); 
		long hrs =ChronoUnit.HOURS.between(depart, arrive); //line n1
		 System.out.println("Travel time is" + hrs + "hours");
		
	}

}
