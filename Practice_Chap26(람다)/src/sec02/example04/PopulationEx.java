package sec02.example04;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;

public class PopulationEx {

	public static ArrayList<Population> populations = new ArrayList<Population>();
			
			
			
	public static void main(String[] args) {
		//Population객체 추가
		populations.add(new Population("서울 강남구", 156800));
		populations.add(new Population("서울 강서구", 10800));
		populations.add(new Population("서울 구로구", 78800));
		populations.add(new Population("서울 영등포구", 126800));
		
		
		
		
		Function<Population, String> function = t -> t.getRegion();
		regionPrint(function);
		
		System.out.println("-----------------------------------------");
		
		
		ToDoubleFunction<Population> toDoubleFunction = t -> t.getPopulation();
		avgPrint(toDoubleFunction);
	}

	//지역을 출력하는 메서드
	public static void regionPrint(Function<Population, String>function) {
		for(Population population: populations) {
			String region = function.apply(population);
			System.out.println("지역 : " + region + "\t");
		}
		
	}
		public static void avgPrint(ToDoubleFunction<Population> toDoubleFunction) {
			double sum = 0.0;
			for(Population population: populations) {
				double value = toDoubleFunction.applyAsDouble(population);
				System.out.println("인구 수 : " + value + "\t");
				sum+=value;
			}	
			System.out.println();
			System.out.println("서울 평균 인구수 : " + (sum/populations.size()));
	}
	
}
