package examp01;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class ResourceBundleEx1 {

	public static void main(String[] args) {
//		애플리케이션을 현지화하기 위해 현지화 된 값으로 키 세트를 정의하는 리소스 번들이 있습니다. 리소스 번들은 속성 파일 또는 클래스 일 수 있습니다.
//		이를 지원하기 위해 java.util.ResourceBundle두 개의 하위 클래스가있는 추상 클래스 가 있습니다.
//		java.util.PropertyResourceBundle
//		각 로케일은 특성 파일로 표시됩니다. 키와 값은 유형 String입니다.
//		java.util.ListResourceBundle
//		각 로케일은 메소드를 대체하는이 클래스의 서브 클래스로 표시됩니다 Object[][] getContents(). 
//		반환 된 배열은 키와 값을 나타냅니다. 키 유형은이어야 String하지만 값은 모든 객체가 될 수 있습니다.
//
//		두 메소드 모두에서 이름 (파일 또는 클래스의)은 Java가 자원 번들을 검색하고 해당 로케일과 일치시킬 수 있도록 허용하는 규칙을 따릅니다.
//		그 이름 규칙은 다음과 같습니다.
//		package.Bundle_language_country_variant
//
//		예를 들면 :com.example.MyBundle_fr_FR
		
//		리소스 번들 이름 만 필요합니다 (기본 이름이 아닌 경우 패키지 이름).
//		예를 들어 다음과 같은 이름의 번들을 가질 수 있습니다 (클래스와 동일하지만 속성 파일로 작업한다고 가정).
//		MyBundle.properties
//		MyBundle_en.properties
//		MyBundle_en_NZ.properties
//		MyBundle_en_US.properties
//		특정 로케일에 속하는 번들을 판별하기 위해 Java는 로케일의 특성과 일치하는 가장 구체적인 번들을 찾으려고합니다.
//		1. Java는 먼저 이름이 전체 로케일과 일치하는 번들을 검색합니다.
//		package.bundle_language_country_variant
//
//		2. 찾을 수없는 경우 이름의 마지막 구성 요소를 삭제하고 검색을 반복합니다.
//		package.bundle_language_country
//
//		3. 찾을 수없는 경우 이름의 마지막 구성 요소를 삭제하고 검색을 반복합니다.
//		package.bundle_language
//
//		4. 그래도 찾을 수 없으면 마지막 구성 요소가 다시 삭제되고 번들 이름 만 남습니다.
//		package.bundle
//		아무것도 발견되지 않으면 MissingBundleException가 발생합니다.
		
//		더 중요한 것은
//		프로그램에서 일치하는 리소스 번들의 키와 해당 부모 중 하나를 사용할 수 있습니다.
//		리소스 번들의 부모는 이름은 같지만 구성 요소가 더 적은 것입니다. 예를 들어 MyBundle_es_ES의 부모는 다음과 같습니다.
//		MyBundle_es
//		MyBundle
		
//		예를 들어, 기본 locale을 가정하고 en_US프로그램이 기본 패키지에있는 해당 파일과 기타 속성 파일을 다음 값과 함께 사용하고 있다고 가정 합니다.
//		MyBundle_EN.properties
//		s = buddy
//
//		MyBundle_es_ES.properties
//		s = tío
//
//		MyBundle_es.properties
//		s = amigo
//
//		MyBundle.properties
//		hi = Hola
		
//		다음과 같이 리소스 번들을 만들 수 있습니다.
		
		 Locale spain = new Locale("es", "ES");
	     Locale spanish = new Locale("es");
	     ResourceBundle rb = ResourceBundle.getBundle("examp01.MyBundle", spain); //package.Bundle
	     System.out.format("%s %s\n",rb.getString("hi"), rb.getString("s"));
	     rb = ResourceBundle.getBundle("examp01.MyBundle", spanish); System.out.format("%s %s\n",rb.getString("hi"), rb.getString("s"));
	     System.out.println("----------------------------------------------------------------");
//	     hi는 부모 속성파일에 키값으로 가져왔다.
//	     Hola tío            
//	     Hola amigo 

//	          로케일을 지정하지 않으면 ResourceBundle클래스는 시스템의 기본 로케일을 사용합니다.
//	   	 시스템의 기본 local이 en_US라고 한다면  아래 코드의 결과는 Hola buddy
//	     ResourceBundle rb1 = ResourceBundle.getBundle("examp01.MyBundle");
//	     System.out.format("%s %s\n", rb1.getString("hi"), rb1.getString("s"));
		
		
//	     다음 메소드를 사용하여 리소스 번들의 spain의 모든 키값 를 가져올 수도 있습니다 keySet().
// 		 출력 (부모 키도 인쇄 함) :
	     ResourceBundle rb2 =
	         ResourceBundle.getBundle("examp01.MyBundle", spain);
	     Set<String> keys = rb2.keySet();
	     keys.stream()
	         .forEach(key ->
	             System.out.format("%s %s\n", key, rb2.getString(key)));
		
		
//	     Properties 파일을 사용하지 않고  클래스를 사용하는 경우 프로그램은 다음과 같습니다.
//	   PropertyResourceBundle와 ListResourceBundle같은 클래스에서 상속합니다.
	 /*
	     package bundles;
	     public class MyBundle_EN extends ListResourceBundle {
	         @Override
	         protected Object[][] getContents() {
	             return new Object[][] {
	                 { "s", "buddy" }
	             };
	         }
	     }

	     package bundles;
	     public class MyBundle_es_ES extends ListResourceBundle {
	         @Override
	         protected Object[][] getContents() {
	             return new Object[][] {
	                 { "s", "tío" }
	             };
	         }
	     }

	     package bundles;
	     public class MyBundle_es extends ListResourceBundle {
	         @Override
	         protected Object[][] getContents() {
	             return new Object[][] {
	                 { "s", "amigo" }
	             };
	         }
	     }

	     package bundles;
	     public class MyBundle extends ListResourceBundle {
	         @Override
	         protected Object[][] getContents() {
	             return new Object[][] {
	                 { "hi", "Hola" }
	             };
	         }
	     }

	     public class Test {
	         public static void main(String[] args) {
	             Locale spain = new Locale("es", "ES");
	             Locale spanish = new Locale("es");

	             ResourceBundle rb =
	                 ResourceBundle.getBundle("bundles.MyBundle", spain);
	             System.out.format("%s %s\n",
	                 rb.getString("hi"), rb.getString("s"));

	             rb = ResourceBundle.getBundle("bundles.MyBundle", spanish);
	             System.out.format("%s %s\n",
	                 rb.getString("hi"), rb.getString("s"));
	         }
	     }
	     클래스를 사용할 때 다음과 같이 다른 유형의 값을 가질 수 있습니다 String.
		public class MyBundle extends ListResourceBundle {
		    @Override
		    protected Object[][] getContents() {
		        return new Object[][] {
		                { "hi", "Hola" },
		                { "number", new Integer(100) }
		        };
		    }
		}
			객체 값을 얻기 위해 다음을 사용합니다.
			Integer num = (Integer)rb.getObject("number");
			대신 rb.getString(key). 사실이 방법은 다음과 같은 지름길 일뿐입니다.
			String val = (String)rb.getObject("hi");*/
		
		
		
		
		
	}

}
