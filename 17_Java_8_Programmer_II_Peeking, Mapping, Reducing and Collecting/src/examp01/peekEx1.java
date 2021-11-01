package examp01;

public class peekEx1 {

	public static void main(String[] args) {
//		Peek() 몰래 엿보는 의미, 중간작업
		
//		peek() 간단한 방법입니다.
		Stream<T> peek(Consumer<? super T> action)
//		제공된을 실행 Consumer하고 원본과 동일한 요소로 새 스트림을 반환합니다.
//		대부분의 경우이 메서드는 System.out.println()디버깅 목적으로 사용 됩니다 (스트림에있는 내용을 확인하기 위해).
		System.out.format("\n%d",
		    IntStream.of(1, 2, 3, 4, 5, 6)
		        .limit(3)
		        .peek( i ->
		            System.out.format("%d ", i) )
		        .sum() );
//		출력 :
		1 2 3
		6
//		알림 peek()은 중간 작업입니다. 이 예제에서는에서 forEach()반환 된 값을 인쇄하는 것과 같은 것을 사용할 수 없습니다. 
//		limit()왜냐하면 forEach()은 터미널 작업 이므로 sum()더 이상 호출 할 수 없습니다 .
//		peek()파이프 라인의 특정 지점에서 스트림의 요소를보기위한 것임을 강조하는 것이 중요합니다 . 
//		어떤 식 으로든 스트림을 변경하는 것은 나쁜 습관으로 간주됩니다. 그렇게하려면 다음 방법을 사용하십시오.
	}

}
