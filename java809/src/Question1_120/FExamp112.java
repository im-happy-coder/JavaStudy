package Question1_120;

import java.io.ObjectInputStream.GetField;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class FExamp112 {

	public static void main(String[] args) {
//		LocalTime now = LocalTime.now();  문제는 이건데
		LocalTime now1 = LocalTime.of(6, 30);  //현재시간 오전 6시 30분이라서 이렇게 바꿈
		
		long timeToBreakfast=0;
		LocalTime office_sart = LocalTime.of(7, 30);
		if(office_sart.isAfter(now1)) { //office_sart시간이 now보다 이후 시간인지 비교--- office_sart(7시30분)가 now(6시30분)보다 이후이므로 true
			timeToBreakfast = now1.until(office_sart, ChronoUnit.MINUTES); //office_sart시간(minute)랑 now1(minute)의 시간이랑 비교해서
		} else {
			timeToBreakfast = now1.until(office_sart, ChronoUnit.HOURS);  //isBefore이면 시간차이 1를 출력
		}
		System.out.println(timeToBreakfast);  //답 : C. 60
	}

}
//Assume that the value of now is 6:30 in the morning.
//지금의 값이 오전 6시 30 분이라고 가정합니다.

//startDateTime이 endDateTime 보다 이전 날짜 인지 비교
//startDateTime.isBefore(endDateTime);    

//동일 날짜인지 비교
//startDateTime.isEqual(endDateTime); 

//startDateTime이 endDateTime 보다 이후 날짜인지 비교
//startDateTime.isAfter(endDateTime);
