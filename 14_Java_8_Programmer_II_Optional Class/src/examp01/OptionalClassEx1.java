package examp01;

public class OptionalClassEx1 {

	public static void main(String[] args) {
//		Optional클래스
//		Null은 1965년 tony Hoare에 의해서 ALGOL W에서 소개되었으면 컴퓨터 과학의 최악의 실수 중 하나로 간주된다.
		
//		예시:
//		이 코드로 인해 발생할 수있는 문제가 조금 걱정된다면 이미 답을 알고 계실 것입니다.
//		String summary = 
//		  book.getChapter(10)
//		          .getSummary().toUpperCase();
//
//		이 코드의 문제는 이러한 메소드 중 하나가 null참조를 반환하는 경우 (예 : 책에 10 번째 장이없는 경우 NullPointerException) 
//		런타임시 프로그램을 중지 할 때 (자바에서 가장 일반적인 예외)가 발생한다는 것입니다.
//		이 예외를 방지하려면 어떻게해야합니까?
//		아마도 가장 쉬운 방법은 null. 여기에 한 가지 방법이 있습니다.
//				String summary = "";
//				if(book != null) {
//				    Chapter chapter = book.getChapter(10);
//				    if(chapter != null) {
//				        if(chapter.getSummary() != null) {
//				          summary = chapter.getSummary()
//				                        .toUpperCase();
//				        }
//				    }
//				}
//		이 계층의 개체가 null 일 수 있는지 알 수 없으므로 모든 개체에서이 값을 확인합니다. 분명히 이것이 최선의 해결책은 아닙니다. 실용적이지 않고 가독성을 손상시킵니다.
		
//		이 문제를 해결하기 위해 Java 8은 java.util.Optional<T>. 이 클래스의 임무 는 선택적인 값 null을 캡슐화 하는 것입니다.
//		class Chapter {
//		    private String summary;
//		    // Other attributes and methods
//		}
//		Optional클래스 를 사용할 수 있습니다 .
//		class Chapter {
//		    private Optional<String> summary;
//		    // Other attributes and methods
//		}
		
		
//		먼저이 클래스의 인스턴스를 만드는 방법을 살펴 보겠습니다.
//		빈 Optional개체 를 얻으려면 다음을 사용하십시오.
//		Optional<String> summary = Optional.empty();
		
//		of는 null허용안한다.
//		Optional<String> summary = Optional.of("A summary");
		
//		ofNullable는 null허용한다.
//		Optional<String> summary = Optional.ofNullable("A summary");
		
//		Optional에 값 이 포함되어 있는지 알고 싶다면 다음과 같이 할 수 있습니다.
//		if( summary.isPresent() ) {
//		    // Do something
//		}
		
////		또는 더 기능적인 스타일 :
//			summary.ifPresent(s -> System.out.println(s));  //if(만약에) 내용이 있다면 이 내용을 실행하라
			// Or summary.ifPresent(System.out::println);
		
//		Optional의 값을 얻으려면 :
//			String s = summary.get();
//		그러나이 메서드는 에 값이 포함되지 않은 java.util.NoSuchElementException경우 를 throw Optional하므로 ifPresent() 메서드 를 사용하는 것이 좋습니다 .
		
//		또는에 Optional값이 없을 때 무언가를 반환하려는 경우 사용할 수있는 다른 세 가지 메서드가 있습니다.
//		String summaryOrDefault = summary.orElse("Default summary");
//		orElse () 메서드는 Optional이 비어있을 때 인수 (T 유형이어야하며이 경우 문자열이어야 함)를 반환합니다. 그렇지 않으면 캡슐화 된 값을 반환합니다.
		
		
//		String summaryOrDefault =
//		        summary.orElseGet( () -> "Default summary" );
//		orElseGet()메서드는 Supplier<? extends T>가 비어 있을 때 값을 반환하는 인수로를 사용합니다 Optional. 그렇지 않으면 캡슐화 된 값을 반환합니다.
		
//		tring summaryOrException =
//		        summary.orElseThrow( () -> new Exception() );
//		 orElseThrow()메서드는 Supplier<? extends X>를 사용합니다 여기서는 이 비어 X있을 때 throw 할 예외 유형입니다 Optional. 그렇지 않으면 캡슐화 된 값을 반환합니다.
		
//		스트림처럼,의 버전이 Optional기본 요소와 작업에 대한 클래스 OptionalInt, OptionalLong그리고 OptionalDouble당신이 사용할 수있는, 
//		그래서 OptionalInt대신은 Optional<Integer>:
//			OptionalInt optionalInt = OptionalInt.of(1);
//			int i = optionalInt.getAsInt();
		
		
//		filter()방법은 Optional이 리턴 값이 존재하고, Optional이 전제 주어진 일치하는 경우. 그렇지 않으면 빈 값이 반환됩니다.
		String summaryStr =
		    summary.filter(s -> s.length() > 10).orElse("Short summary");
		
		
//		이 map()방법은 일반적으로 한 유형에서 다른 유형으로 변환하는 데 사용됩니다. 값이 있으면 제공된 값을 적용합니다 Function< ? super T, ? extends U >. 예를 들면 :
		int summaryLength = summary.map(s -> s.length()).orElse(0);

//		flapMap()방법은 비슷 map()하지만,이 타입의 인수를 Function<? super T, Optional<U>>상기 값이 존재하는 경우,
//		이 반환 Optional제공된 함수를 적용하여 그 결과. 그렇지 않으면 빈 Optional.
		
		
		키 포인트
		java.util.Optional<T>클래스는 캡슐화 될 수있는 개체를 즉, 옵션 값을 null.
		빈 값은 메소드로 표시됩니다 Optional.empty().
		Optionalwith 메소드 로 객체를 래핑 할 수 of()있지만 NullPointerException객체가 인 경우 a 가 발생합니다 null.
		메서드 가 아닌 경우 지정된 값을 가진 인스턴스를 ofNullable()반환합니다 . 그렇지 않으면 빈 .
		OptionalnullOptional의 값을 얻으려면 Optionalmethod를 사용하십시오 get(). 
		그러나 에 값이 포함되지 않은 java.util.NoSuchElementException경우 a가 발생 Optional하므로 에 값 이 포함 된 경우에만 실행되는 인수로 
		ifPresent()a 를 사용하는 메서드 를 사용하는 것이 좋습니다 .Consumer<T>Optional
		orElse()(가) 때 방법은 인수를 돌려줍니다 Optional비어, 그렇지 않으면 캡슐화 된 값을 반환합니다.
		이 orElseGet()메서드는가 비어 Supplier있을 때 값을 반환하는 a 를 사용합니다 Optional. 그렇지 않으면 캡슐화 된 값을 반환합니다.
		이 orElseThrow()메서드는가 비어 Supplier있을 때 예외를 반환 Optional하는를 사용합니다. 그렇지 않으면 캡슐화 된 값을 반환합니다.
		
		
	}

}
