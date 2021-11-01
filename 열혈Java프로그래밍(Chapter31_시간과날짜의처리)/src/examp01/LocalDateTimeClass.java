package examp01;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeClass {

	public static void main(String[] args) {
//		지금으로부터 22시간 35분 뒤의 시각과 날짜는 ? : LocalDateTime 클래스
//		LocalDate는 날짜정보, LocalTime은 시각 정보를, LocalDateTime은 시각 정보와 날짜 정보를 동시에 나타낸다.
		
		//현재 날짜와 시각
		LocalDateTime dt = LocalDateTime.now();
		System.out.println(dt);
		
		//영국 바이어와 22시간 35분 뒤 화상 미팅 예정
		LocalDateTime mt = dt.plusHours(22);
		mt = mt.plusMinutes(35);
		
		//영국 바이어와 화상 미팅 날짜와 시각
		System.out.println(mt);
		
		System.out.println("---------------------------------------------");
//		두 LocalDateTime 인스턴스 간의 시각과 날짜의 차
		LocalDateTime today = LocalDateTime.of(2020, 4, 25, 11, 20); //현재 시각
		LocalDateTime flight1 = LocalDateTime.of(2020, 5, 14, 11, 15); //항공편1의 출발 시간
		LocalDateTime flight2 = LocalDateTime.of(2020, 5, 13, 15, 30); //항공편2의 출발 시간
		
		//빠른 항공편을 선택하는 과정
		LocalDateTime myFlight;
		if(flight1.isBefore(flight2))
			myFlight = flight1;
		else
			myFlight = flight2;
		
		//빠른 항공편의 비행 탑승까지 남은 날짜 계산
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());//toLocalDate(): 날짜에 대한 정보를 LocalDate인스턴스에 담아서 반환
		//빠른 항공편의 비행 탑승까지 남은 시간 계산
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());//toLocalTime(): 시간에 대한 정보를 LocalDate인스턴스에 담아서 반환
		
		//비행 탑승까지 남은 날짜와 시간 출력
		System.out.println(day);
		System.out.println(time);
	}

}
