package examp01;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorandComparableEx1 {

	public static void main(String[] args) {
//		Comparator and Comparable(비교기 및 비교 가능) 
		
//		Comparable은 ComepareTo(인수가1개) 그리고 compareTo자연 순 정렬 ( A, B, C등)
//		Comparator는 Compare(인수가 2개), Comparing(인수가1개)
		
		
		
//		배열 또는 컬렉션을 정렬하기 위해 Java는 매우 유사한 두 가지 인터페이스를 제공합니다.
		java.util.Comparator
		public interface Comparator<T> {
		    int compare(T obj1, T obj2);
		    // Other default and static methods ...
		}
//		
//		
		java.lang.Comparable
		public interface Comparable<T> {
		    int compareTo(T obj);
		}
		
		
		
		
//		Comparable 객체의 구현 방법
		public class Computer implements Comparable<Computer> {
		    private String brand;
		    private int id;

		    public Computer(String brand, int id) {
		        this.brand = brand;
		        this.id = id;
		    }

		    // Let's compare first by brand and then by id
		    public int compareTo(Computer other) {
		        // Reusing the implementation of String
		        int result = this.brand.compareTo(other.brand);

		        // If the objects are equal, compare by id
		        if(result == 0) {
		            // Let's do the comparison "manually"
		            // instead of using Integer.valueOf(this.id).compareTo(other.id)
		            // or Integer.compare(this.id, other.id)
		            if(this.id > other.id) result = 1;
		            else if( this.id < other.id) result = -1;
		            // else result = 0;
		        }
		        return result;
		    }

		    // equals and compareTo must be consistent
		    // to avoid errors in some cases
		    public boolean equals(Object other) {
		        if (this == other) return true;
		        if (!(other instanceof Computer)) return false;
		        return this.brand.equals(((Computer) other).brand)
		            && this.id == ((Computer) other).id;
		    }

		    public static void main(String[] args) {
		        Computer c1 = new Computer("Lenovo", 1);
		        Computer c2 = new Computer("Apple", 2);
		        Computer c3 = new Computer("Dell", 3);
		        Computer c4 = new Computer("Lenovo", 2);

		        // Some comparisons
		        System.out.println(c1.compareTo(c1)); // c1 == c1
		        System.out.println(c1.compareTo(c2)); // c1 > c2
		        System.out.println(c2.compareTo(c1)); // c2 < c1
		        System.out.println(c1.compareTo(c4)); // c1 < c2
		        System.out.println(c1.equals(c4)); // c1 != c2

		        // Creating a list and sorting it
		        List<Computer> list = Arrays.asList(c1, c2, c3, c4);
		        Collections.sort(list);
		        list.forEach(
		           c -> System.out.format("%s-%d\n",c.brand,c.id)
		        );
		    }
		}
//		이 프로그램을 실행하면 다음과 같이 출력됩니다.
		0
		11
		-11
		-1
		false
		Apple-2
		Dell-3
		Lenovo-1
		Lenovo-2
		
		
		
//		java.util.Comparator
		
//		구현 방법은 다음과 같습니다.
		int compare(T o1, T o2);
		
//		Computer이전 예제 의 클래스를 사용하여 Comparator먼저 ID별로 정렬 한 다음 브랜드별로 정렬하는를 만들 수 있으며 반환 된 값의 규칙이 실제로 Comparable's 와
//		동일하므로 다음 compareTo메서드를 사용할 수 있습니다 .
		Comparator<Computer> sortById =
			    new Comparator<Computer>() {
			        public int compare(Computer c1, Computer c2) {
			            int result = Integer.compare(c1.id, c2.id);
			            return result == 0
			                ? c1.brand.compareTo(c2.brand) : result;
			    }
			};

//			또한 다음과 Integer.compare(x, y)같습니다.
			Integer.valueOf(x).compareTo(Integer.valueOf(y))

//			운 좋게도 Comparator함수 인터페이스이므로 내부 클래스 대신 람다 식을 사용할 수 있습니다.
			Comparator<Computer> sortById = (c1, c2) -> {
			    int result = Integer.compare(c1.id, c2.id);
			    return result == 0
			       ? c1.brand.compareTo(c2.brand) : result;
			}

//			따라서 이전 예제 목록에서 사용할 때 :
			List<Computer> list = Arrays.asList(c1, c2, c3, c4);
			Collections.sort(list, sortById);
			list.forEach(
			   c -> System.out.format("%d-%s\n",c.id,c.brand)
			);

//			출력은 다음과 같습니다.
			1-Lenovo
			2-Apple
			2-Lenovo
			3-Dell
		
//			 Comparable기능 인터페이스로도 간주되지만 Comparable비교되는 개체에 의해 구현 될 것으로 예상 되므로 람다 식으로 거의 사용하지 않을 것입니다.
			
			
			
//			인터페이스에 기본 및 정적 메소드가 도입 된 Java 8에서는 다음과 Comparator같은 코드를 단순화 하는 데 유용한 메소드가 있습니다 .

			Comparator<T>
			   Comparator.comparing(Function<? super T, ? extends U>)
			Comparator<T>
			   Comparator.comparingInt(ToIntFunction<? super T>)
			Comparator<T>
			   Comparator.comparingLong(ToLongFunction<? super T>)
			Comparator<T>
			   Comparator.comparingDouble(ToDoubleFunction<? super T>)
		
//			   Function에서 반환 된 값을 사용하여 생성하는 데 사용될 객체의 속성 값을 반환 하는 (람다 식)을 Comparator사용합니다 comparedTo(기본요소로 작업 할 때 버전도 확인).
//			   예를 들면 :
			   Comparator<Computer> sortById =
			             Comparator.comparing(c -> c.id);
//			   또는:
			   Comparator<Computer> sortById =
			             Comparator.comparingInt(c -> c.id);
//			   다음과 같습니다.
			   Comparator<Computer> sortById = new Comparator<Computer>() {
			       public int compare(Computer c1, Computer c2) {
			           return Integer.valueOf(c1.id)
			                       .compareTo(Integer.valueOf(c2.id));
			       }
			   };
		
//			   또 다른 유용한 방법은 thenComparing 두 가지를 연결 Comparators하는 것입니다 (이 static방법 은 방법 이 아님 ).
			   Comparator<T>
			       thenComparing(Comparator<? super T>)
			   Comparator<T>
			       thenComparing(Function<? super T, ? extends U>)
			   Comparator<T>
			       thenComparingInt(ToIntFunction<? super T>)
			   Comparator<T>
			       thenComparingLong(ToLongFunction<? super T>)
			   Comparator<T>
			       thenComparingDouble(ToDoubleFunction<? super T>)

//			   이렇게하면 Comparator다음을 사용하여 ID별로 정렬 한 다음 브랜드별로 정렬 하는 코드를 단순화 할 수 있습니다 .
			   Comparator<Computer> sortByIdThenByBrand =
			           Comparator.comparing((Computer c) -> c.id)
			               .thenComparing(c -> c.brand);

//			   마지막으로 기본 메서드 reversed()는 Comparator원본의 순서를 반대로하는를 만듭니다 Comparator.
			   List<Computer> list = Arrays.asList(c1, c2, c3, c4);
			   Collections.sort(list,
			       Comparator.comparing((Computer c) -> c.id).reversed());
			   list.forEach(
			       c -> System.out.format("%d-%s\n",c.id,c.brand));

//			   출력 :
			   3-Dell
			   2-Apple
			   2-Lenovo
			   1-Lenovo
		
		
		
		
//			   스트림 정렬
//			   스트림 정렬은 간단합니다. 방법
			   Stream<T> sorted()
//			   자연 순서에 따라 정렬 된 요소가있는 스트림을 반환합니다. 예를 들면 :
			   List<Integer> list = Arrays.asList(57, 38, 37, 54, 2);
			   list.stream()
			       .sorted()
			       .forEach(System.out::println);
//			   다음을 인쇄합니다.
			   2
			   37
			   38
			   54
			   57
//			   유일한 요구 사항은 스트림의 요소가 구현되어야 java.lang.Comparable한다는 것입니다 (그렇게하면 자연스러운 순서로 정렬됩니다). 
//			   그렇지 않으면 a ClassCastException가 던져 질 수 있습니다.
			   
//			   다른 순서를 사용하여 정렬하려면 다음을 사용하는이 메서드의 java.util.Comparator버전이 있습니다 (이 버전은와 같은 기본 스트림에 사용할 수 없음 IntStream).
			   Stream<T> sorted(Comparator<? super T> comparator)
//			   예를 들면 :
			   List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .sorted( (s1, s2) -> s2.length() - s1.length() )
			       .forEach(System.out::println);
//			   또는:
			   List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .sorted( Comparator.comparing(
			                   (String s) -> s.length()).reversed() )
			       .forEach(System.out::println);
//			   둘 다 다음을 인쇄합니다.
			   Collections
			   Operations
			   Stream
			   on
//			   첫 번째 코드 조각은 첫 번째 문자열 길이가 두 번째 길이보다 작 으면 양수 값을 반환하고 그렇지 않으면 음수 값을 반환하여 문자열을 내림차순으로 정렬합니다.
//			   두 번째 코드 스 니펫은 Comparator문자열 길이를 자연 순서 (오름차순)로 만든 다음 그 순서를 반대로 만듭니다.
			   
			   
			   
			   
//			   데이터 및 계산 방법
//			   Stream인터페이스는 다음 데이터 및 계산 방법을 제공한다 :

			   long count()
			   Optional<T> max(Comparator<? super T> comparator)
			   Optional<T> min(Comparator<? super T> comparator)

//			   기본 버전의 Stream인터페이스의 경우 다음과 같은 메서드가 있습니다.
//			   IntStream에는
			   OptionalDouble average()
			   long count()
			   OptionalInt max()
			   OptionalInt min()
			   int sum()

//			   LongStream에는
			   OptionalDouble average()
			   long count()
			   OptionalLong max()
			   OptionalLong min()
			   long sum()

//			   DoubleStream에는
			   OptionalDouble average()
			   long count()
			   OptionalDobule max()
			   OptionalDouble min()
			   double sum()

//			   count() 스트림의 요소 수를 반환하거나 스트림이 비어있는 경우 0을 반환합니다.
			   List<Integer> list = Arrays.asList(57, 38, 37, 54, 2);
			   System.out.println(list.stream().count()); // 5

//			   min()에 래핑 된 스트림의 최소값을 반환 Optional하거나 스트림이 비어있는 경우 빈 값을 반환합니다 .
//			   max()에 래핑 된 스트림의 최대 값을 반환 Optional하거나 스트림이 비어있는 경우 빈 값을 반환합니다 .
			   
//			   프리미티브에 대해 이야기 할 때 최소값 또는 최대 값이 무엇인지 쉽게 알 수 있습니다. 
//			   그러나 우리가 (모든 종류의) 객체에 대해 이야기 할 때 자바는 그것들을 비교하는 방법을 알아야 어떤 것이 최대와 최소인지 알 수 있습니다. 
//			   이것이 Stream인터페이스에 Comparatorfor max()및 min()다음이 필요한 이유입니다 .
			   List<String> strings =
			       Arrays.asList("Stream","Operations","on","Collections");
			   strings.stream()
			       .min( Comparator.comparing(
			                    (String s) -> s.length())
			       ).ifPresent(System.out::println); // on을 출력
			   

			   
//			   sum() 스트림에있는 요소의 합계를 반환하거나 스트림이 비어있는 경우 0을 반환합니다.
			   System.out.println(
			       IntStream.of(28,4,91,30).sum()
			   ); // 153

//			   average()에 래핑 된 스트림 요소의 평균을 반환 OptionalDouble하거나 스트림이 비어있는 경우 빈 요소를 반환합니다  .
			   System.out.println(
			       IntStream.of(28,4,91,30).average()
			   ); // 38.25
		
		
			   java.util.ComparatorANOTHER 클래스의 객체 를 정렬하는 데 사용하는 클래스에 의해 구현됩니다 . 
			   정렬하려는 SAME 개체에 java.lang.Comparable의해 구현됩니다 .
			   두 인터페이스의 주요 메서드는 int. 그들의 규칙은 매우 유사합니다.
			   ZERO 가 반환 되면 객체 (또는 첫 번째 인수)가 (두 번째) 인수와 같음 을 의미합니다.
			   다수의 경우 GREATER 0보다 반환되며, 그 오브젝트 (또는 첫 번째 인자)을 의미 GREATER는 제 (초)보다 인수.
			   많은 경우 LESS 0보다 반환되며, 그 오브젝트 (또는 첫 번째 인자)을 의미 LESS 제 (초)보다 인수.
			   comparing(), thenComparing(),과 reversed()의 도우미 방법이 있습니다 Comparator자바 8에 추가 된 인터페이스.
			   인터페이스 의 sorted()메서드 Stream는 자연 순서에 따라 정렬 된 요소가있는 스트림을 반환합니다. 를 Comparator인수로 전달할 수도 있습니다 .
			   count() 스트림의 요소 수를 반환하거나 스트림이 비어있는 경우 0을 반환합니다.
			   min()에 래핑 된 스트림의 최소값을 반환 Optional하거나 스트림이 비어있는 경우 빈 값을 반환합니다 .
			   max()에 래핑 된 스트림의 최대 값을 반환 Optional하거나 스트림이 비어있는 경우 빈 값을 반환합니다 .
			   sum() 스트림의 요소 합계를 반환하거나 스트림이 비어 있으면 0을 반환합니다.
			   average()a로 래핑 된 스트림 요소의 평균을 반환 OptionalDouble하거나 스트림이 비어있는 경우 빈 요소를 반환합니다 .
			   
			   
			   
			   
//			   연습문제
			   List<String> strings =
	            Arrays.asList( "Stream","Operations","on","Collections");
	        strings.stream()
	            .sorted(
	                 Comparator.comparing(
	                     (String s1, String s2) ->
	                             s1.length() - s2.length()
	                 )
	            )
	            .forEach(System.out::print);
//			   이 static메서드 Comparator.comparing는를 나타내는 인수가 하나있는 람다 식을 사용합니다 Function. 두 개의 인수를 사용하려면 BiFunction.


	}

}
