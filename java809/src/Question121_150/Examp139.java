package Question121_150;

import java.util.Locale;
import java.util.ResourceBundle;

public class Examp139 {

	public static void main(String[] args) {
//		1 행에 독립적으로 삽입 될 때 코드가 "Wie geht ’s?"를 인쇄 할 수 있도록하는 두 개의 코드 조각은 무엇입니까?
//		Which two code fragments, when inserted at line 1 independently, enable the code to print “Wie geht’s?”
		Locale currentLocale;
		 currentLocale = new Locale ("de", "DE");//line n1
		 currentLocale = new Locale.Builder ().setLanguage ("de").setRegion ("DE").build();//line n1
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale);
//		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle");//이렇게하면 Hou are you를 출력
		System.out.println(messages.getString("inquiry"));
	}

}
/*
properties 파일은 Text 파일이며 ResourceBundle는 다음과 같은 이름의 파일을 검색한다.

<Resource명> "_" language1 "_" country1 "_" variant1
<Resource명>  "_" language1 "_" country1
<Resource명>  "_" language1
<Resource명>  




Eclipse에서 프로젝트 파일을 마우스 오른쪽 버튼으로 클릭하고 Build Path 에서 "new source Folder"을 선택하십시오
*/