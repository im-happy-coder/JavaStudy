package examp02;

import java.time.ZoneId;

public class ZoneIdClass {

	public static void main(String[] args) {
//		31_2 시간대(시차)를 적용한 코드 작성 그리고 출력 포맷의 지정
//		ZoneId 인스턴스 생성 위한 문자열 확인 방법 = ZoneId = 시간대 정보
		
//		시간 대별 문자열 정보 전체 출력 방법
//		ZoneId.getAvailableZoneIds().stream().sorted().forEach(s->System.err.println(s)); //모든 전세계 시간대를 보여줌
		
//		일부 정보만 선별해서 출력하는 방법
//		ZoneId.getAvailableZoneIds().stream().filter(s->s.startsWith("Asia")).sorted().forEach(s->System.out.println(s));//Asia지역만 시간대 보여줌
		
		ZoneId paris = ZoneId.of("Europe/Paris"); //유럽(국가) 파리(도시)
		System.out.println(paris); //파리의 시간대 정보를 반영한 ZoneId 생성
	}

}
