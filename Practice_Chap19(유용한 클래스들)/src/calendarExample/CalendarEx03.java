package calendarExample;

import java.util.Calendar;

public class CalendarEx03 {

	public static void main(String[] args) {
		
		Calendar today1 = Calendar.getInstance();
		Calendar today2 = Calendar.getInstance(); //현재시간
		//set()날짜를 설정
		today1.set(2015, 7, 15); //시간을 설정
		//시차 구하기  //1일=24*60*60
		long diff = (today2.getTimeInMillis() - today1.getTimeInMillis()) / 1000;
		long diffDay = diff / (24*60*60); // 지난 일 수 구하는공식
		System.out.println("20150715~현재 시간까지  지난 초 : " + diff);
		System.out.println("20150715~현재 시간까지 지난 일 수 : " + diffDay);
	}

}
