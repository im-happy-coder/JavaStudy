package calendarExample;

import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneEx {

	public static void main(String[] args) {

		String[] timezone = TimeZone.getAvailableIDs();
		for(String zoneId : timezone) {
			System.out.println("존 영역 : " + zoneId);
		}
		TimeZone tz = TimeZone.getTimeZone("UCT");  // 타임 존을 Africa/Bissau 이곳으로 선택해서 
		Calendar today = Calendar.getInstance(tz);
		System.out.println(toString(today));
	}
	
	//위에서 선택한 타임존의 현재 시간과 날짜를 알려준다.
	public static String toString(Calendar date) {
		
		int i = date.get(Calendar.AM_PM);
		String str = "";
		if(i == 0)
			str = "AM";
		else 
			str = "PM";
		
		return date.get(Calendar.YEAR)+"년 " + (date.get(Calendar.MONTH)+1) +
				"월 " + date.get(Calendar.DATE) + "일 " + " " + str + " " + date.get(Calendar.HOUR_OF_DAY) + 
				"시 " + date.get(Calendar.MINUTE) + "분 " + date.get(Calendar.SECOND) + "초";
		
	}

}
