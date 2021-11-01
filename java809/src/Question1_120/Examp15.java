package Question1_120;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Examp15 {
	public enum Continent {ASIA, EUROPE}
	String name;
	Continent region;
	
	public Examp15 (String na, Continent reg) {
	name = na;
	region = reg;
	}
	
	  
	public String getName () {return name;}
	public Continent getRegion () {return region;}
	

	public static void main(String[] args) {
		List<Examp15> couList = Arrays.asList (
				
				new Examp15 ("Japan", Examp15.Continent.ASIA),
				new Examp15 ("Italy", Examp15.Continent.EUROPE),
				new Examp15 ("Germany", Examp15.Continent.EUROPE));
		
//				Map<Examp15.Continent, List<String>> regionNames = 
//				couList.stream()
//				.collect(Collectors.groupingBy (Examp15 ::getRegion,Collectors.mapping(Examp15::getName, Collectors.toList())));
//				System.out.println(regionNames);
				//List일때의 답 : {ASIA=[Japan], EUROPE=[Italy, Germany]}
		
				Map<Examp15.Continent, Set<String>> regionNames1 = 
				couList.stream()
				.collect(Collectors.groupingBy (Examp15 ::getRegion,Collectors.mapping(Examp15::getName, Collectors.toSet())));
				System.out.println(regionNames1);
				//Set일때의 답 : {EUROPE=[Italy, Germany], ASIA=[Japan]}
				
				
				//toList를 사용할때는 List순서대로 나온다
				// 즉 , ASIA 위에 EUROPE가 있으면 EUROPE가 먼저 나옵니다.
				

				
	}

}
