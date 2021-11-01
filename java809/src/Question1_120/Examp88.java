package Question1_120;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class Examp88 {

	public static void main(String[] args) {
		
		Locale currentLocale = new Locale.Builder().setRegion("FR").setLanguage("fr").build();
		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle", currentLocale); //일때는 MessagesBundle_fr_FR의 키와 값을 가져옴
//		ResourceBundle messages = ResourceBundle.getBundle("MessagesBundle"); // 일때는 기본 MessagesBundle의 키와 값을 가져옴
		Enumeration<String> names = messages.getKeys();
		while(names.hasMoreElements()) {
			String key = names.nextElement();
			String name = messages.getString(key);
			System.out.println(key + " = "+ name);
		}
	}

}
//답 : A. username = Entrez le nom d'utilisateur password = Entrez le mot de passe
