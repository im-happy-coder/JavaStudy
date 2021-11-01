package examp01;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeClass {

	public static void main(String[] args) {
//		2시간 10분 뒤에 어떄 ? : LocalTime 클래스
//		LocalTime은 시각 정보를 나타내는 클래스
		
		//현재 시각
		LocalTime now = LocalTime.now();
		System.out.println("지금 시각 : " + now);
		
		//2시간 10분 뒤 화상 미티 예정
		LocalTime mt = now.plusHours(2);
		mt = mt.plusMinutes(10);
		
		//화상 미팅 시각
		System.out.println("화상 미팅 시각 : " + mt);
		
		//PC방의 PC 이용 시작 시각
		LocalTime start = LocalTime.of(14, 24, 35);
		System.out.println("PC 이용 시작 시각 : " + start);
		
		//PC방의 PC이용 종료 시각
		LocalTime end = LocalTime.of(17, 31, 19);
		System.out.println("PC이용 종료 시각 : " + end);
		
		//PC이용 시간 계산
		Duration between = Duration.between(start, end); //시간 차 계산에는 이경우에도 Duration클래스가 사용된다.
		System.out.println("총 PC 이용 시간 : " + between); //PT3H6M44S으로 나옴
		
//		초 Instant 차이 = Duration
//		날짜 LocalDate 차이 = Period
//		시분초 LocalTime 차이 = Duration
	}

}
