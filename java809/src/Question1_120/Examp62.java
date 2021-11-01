package Question1_120;

import java.util.Locale;

public class Examp62 {
// Local 클래스는 간단히 말하면 지역의 [언어][나라] 등의 정보를 담고 있는 클래스이다. 
	public static void main(String[] args) {
//		Locale loc1 = "UK";
//		Locale loc2 = Locale.getInstance("ru");
//		Locale loc3 = Locale.getLocaleFactory("RU");
		Locale loc4 = Locale.UK;
		Locale loc5 = new Locale ("ru", "RU");
	}

}
/*
 * Which two code blocks correctly initialize a Locale variable? (Choose two.)
	Locale 변수를 올바르게 초기화하는 두 개의 코드 블록은 무엇입니까? (2 개 선택)


A. Locale loc1 = "UK";
B. Locale loc2 = Locale.getInstance("ru");
C. Locale loc3 = Locale.getLocaleFactory("RU");
D. Locale loc4 = Locale.UK;
E. Locale loc5 = new Locale ("ru", "RU");





답 : D, E




 */