package Question1_120;

import java.text.NumberFormat;
import java.util.Formatter;
import java.util.Locale;

public class FExamp108 {

	public static void main(String[] args) {
		double d = 15;
		Locale l  = new Locale("en", "US");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(l); //$15.00
//		NumberFormat formatter = NumberFormat.getNumberInstance(l); // 15
//		NumberFormat formatter = NumberFormat.getInstance(l); //15
//		NumberFormat formatter = NumberFormat.getIntegerInstance(l);  //15
//		NumberFormat formatter = NumberFormat.getPercentInstance(l);  //1,500%
		System.out.println(formatter.format(d));
	}

}


/*
NumberFormat 클래스로 표현할 수 있는 포맷의 종류는 다음과 같다.
정수형: getIntegerInstance()
통화 수치: getCurrencyInstance()
퍼센트: getPercentInstance()
*/