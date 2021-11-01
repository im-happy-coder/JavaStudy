package examp01;

import java.time.LocalDate;
import java.time.Period;

public class LocalDateClass {

	public static void main(String[] args) {
//		오늘이 며칠이죠? : LocalDate클래스
//		LocalDate는 시각 정보가 생략된 '날짜 정보'를 표현하기 위한 클래스
//		Period
		
		//오늘
		LocalDate today = LocalDate.now();
		System.out.println("Today : " + today);
		
		//올 해의 크리스마스
		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("Xmas :"+xmas);
		
		//올 해의 크리스마스 이브
		LocalDate eve = xmas.minusDays(1);  //eve라는 새로운 인스턴스를 생성한거임
		System.out.println("Xmas Eve: "+ eve);
		
//		시간의 차이 = Duration
//		날짜의 차이 = Period
		
		//크리스마스까지 앞으로 며칠?
		Period left = Period.between(today, xmas);
		System.out.println("Xmas까지 앞으로 " + left.getMonths() + "월" + left.getDays() + "일");
	}

}
