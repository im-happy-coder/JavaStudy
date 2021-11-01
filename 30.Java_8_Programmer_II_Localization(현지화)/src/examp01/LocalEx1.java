package examp01;

import java.util.Locale;

public class LocalEx1 {

	public static void main(String[] args) {
//		Localization=현지화=지역화
//		표현 방법 : 언어_국가 = fr_CA
		
		Locale locale = Locale.getDefault(); //현재 자신의 언어와 국가를 나타낸다.
		System.out.println(locale);
		 
		System.out.println("Country Code: " + locale.getCountry()); //Country(국가) 코드
		System.out.println("Country Name: " + locale.getDisplayCountry()); //Country(국가) 이름
		System.out.println("Language Code: " + locale.getLanguage()); //해당국가 언어 코드
		System.out.println("Language Name: " + locale.getDisplayLanguage()); //해당국가 언어 이름
		
		System.out.println("---------------------------------------------------------------------");
		
//		자바에서 지원하는 모든 로케일을 가져올 수 도 있다.
//		Locale [] locales = Locale.getAvailableLocales();
//		Arrays.stream(locales).forEach(System.out::println);
		
//		Locale인스턴스 를 만드는 방법에는 세 가지 방법.
//		Locale(String language)
//		Locale(String language, String country)
//		Locale(String language, String country, String variant)

//		1번째 방법 : 생성자 사용
		Locale chinese = new Locale("zh");
		Locale CHINA = new Locale("zh", "CN");
		System.out.println("Country Code: " + CHINA.getCountry()); //Country(국가) 코드
		System.out.println("Country Name: " + CHINA.getDisplayCountry()); //Country(국가) 이름
		System.out.println("Language Code: " + CHINA.getLanguage()); //해당국가 언어 코드
		System.out.println("Language Name: " + CHINA.getDisplayLanguage()); //해당국가 언어 이름
		System.out.println("---------------------------------------------------------------------");
//		2번째 방법 : forLanguageTag (String) 팩토리 메서드 사용
		Locale german = Locale.forLanguageTag("de");
		System.out.println("Country Code: " + german.getCountry()); //Country(국가) 코드
		System.out.println("Country Name: " + german.getDisplayCountry()); //Country(국가) 이름
		System.out.println("Language Code: " + german.getLanguage()); //해당국가 언어 코드
		System.out.println("Language Name: " + german.getDisplayLanguage()); //해당국가 언어 이름
		System.out.println("---------------------------------------------------------------------");
//		3번쨰 방법 :  Locale.Builder 사용
		Locale japan = new Locale.Builder().setRegion("JP").setLanguage("jp").build();
		System.out.println("Country Code: " + japan.getCountry()); //Country(국가) 코드
		System.out.println("Country Name: " + japan.getDisplayCountry()); //Country(국가) 이름
		System.out.println("Language Code: " + japan.getLanguage()); //해당국가 언어 코드
		System.out.println("Language Name: " + japan.getDisplayLanguage()); //해당국가 언어 이름
		System.out.println("---------------------------------------------------------------------");
		
//		위의 세가지 방법 중 하나에 잘못된 인수를 전달하면 예외가 발생하지 않고 잘못된 정보로 출력이 된다.
		Locale badLocale = new Locale("a", "A"); // No error
		System.out.println(badLocale); // It prints a_A
		System.out.println("---------------------------------------------------------------------");
//		따라서 Locale클래스는 일부 공통 언어 및 국가에 대해 사전 정의 된 상수도 제공 한다는 사실을 아는 것이 좋습니다 . 예를 들면 다음과 같습니다.
//		Locale.GERMAN
//		Locale.KOREAN
//		Locale.UK
//		Locale.ITALY
		System.out.println(Locale.getDefault()); // 현재 나의 기본 언어_국가 출력
		Locale.setDefault(new Locale("en", "US")); //나의 언어_국가 정보를 바꿈
		System.out.println(Locale.getDefault()); //바꾼 값으로 출력
		
	}

}
