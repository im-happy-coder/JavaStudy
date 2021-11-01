package Question1_120;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class FExamp118 {

	public static void main(String[] args) throws Exception{
		//Login time : 2015-01-12T21:58:18.817z
		Instant loginInTime = Instant.now();
		Thread.sleep(1000);
		//Logout time : 2015-01-12T21:58:18.880z
		Instant logoutTime = Instant.now();
		
		loginInTime = loginInTime.truncatedTo(ChronoUnit.MINUTES); //line n1  //MINUTES를 짜르는게 아닌 minute뒤에 초second를 자름
		logoutTime = logoutTime.truncatedTo(ChronoUnit.MINUTES);  //MINUTES를 짜르는게 아닌 minute뒤에 초second를 자름
		
//		System.out.println(loginInTime);
//		System.out.println(logoutTime);
		
		if(logoutTime.isAfter(loginInTime)) {
			System.out.println("Logged out at:"+logoutTime);
		} else {
			System.out.println("Can't logout");
		}
	}

}
   //답 : C. Can't logout

//만약 로그아웃시간이 더 길다면 true를 반환 해서 로그아웃 시간을 출력한다.

/*Truncation(날짜 자르기)
신규 API는 날짜, 시간, 일 등에 해당하는 값 들을 잘라내서 표현할 수 있도록 truncatedTo 라는 메서드를 제공한다.

Instant.now() 정적 메소드를 호출하면 현재 시간의 Instant 객체를 얻을 수 있습니다. 
Instant 객체는 UTC 기준의 ISO 포멧으로 출력됩니다. 그리고 Instant 객체에 getEpochSecond()나 toEpochMilli() 
메소드를 호출하여 초단위 또는 밀리 초 단위 타임스탬프 값을 long 타입으로 얻을 수 있습니다.



//startDateTime이 endDateTime 보다 이전 날짜 인지 비교
//startDateTime.isBefore(endDateTime);    

//동일 날짜인지 비교
//startDateTime.isEqual(endDateTime); 

//startDateTime이 endDateTime 보다 이후 날짜인지 비교
//startDateTime.isAfter(endDateTime);












*/