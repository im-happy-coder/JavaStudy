package examp03;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class ReportCard{
	private int kor; //국어
	private int eng; //영어
	private int math;//수학
	public ReportCard(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
}
public class MappingEx3 {

	public static void main(String[] args) {
//		중간연산 
//		맵핑(Mapping) 예제3:
		
		ReportCard[] cards = {
				new ReportCard(70, 80, 90),
				new ReportCard(90, 80, 70),
				new ReportCard(80, 90, 80)
		};
		
		//ReportCard인스턴스로 이뤄진 스트림 생성
		Stream<ReportCard> sr = Arrays.stream(cards);
		//여기선 ㅁㅁㅁ 3개의 스트림이 생성되며, 3개는 ReportCard1, ReportCard2, ReportCard3 이렇게 총 3개를 나타내고
		//각각의 ReportCard는 점수를 3개씩(국,영,수) 가지게 된다. 1:3
		
		
		//학생들의 점수 정보로 이뤄진 스트림 생성
		IntStream si = sr.flatMapToInt(
				r-> IntStream.of(r.getKor(), r.getEng(), r.getMath()));
		//r은 ReportCard1,2,3의 각각의 인스턴스를 가르키고, 
		//각각의 ReportCard1,2,3은 국어 점수, 영어점수, 수학점수로 이루어진 스트림을 람다식을 작성했다.
		
		//평균을 구하기 위한 최종 연산 average 진행
		double avg = si.average().getAsDouble();
		System.out.println("avg : " + avg);

//		OptionalDouble average()는 인터페이스 IntStream, LongStream, DoubleStream에 존재하는 메소드
		
	}

}
