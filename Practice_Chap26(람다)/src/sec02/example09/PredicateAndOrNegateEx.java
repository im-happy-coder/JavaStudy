package sec02.example09;

import java.util.function.IntPredicate;

public class PredicateAndOrNegateEx {

	public static void main(String[] args) {
		
		IntPredicate intPredicateA = x -> {return (x % 2) == 0;}; //2의 배수를 true인지 확인
		IntPredicate intPredicateB = x -> {return (x % 3) == 0;}; //3의 배수를 true인지 확인
		
		System.out.println("15는 2의 배수입니까?  " + intPredicateA.test(15));
		System.out.println("15는 3의 배수입니까?  " + intPredicateB.test(15));
		
		//And()는 둘다 true여야 true 리턴한다.
		IntPredicate intPredicateAB = intPredicateA.and(intPredicateB);
		System.out.println("6은 2와 3의 공배수입니까?  " + intPredicateAB.test(6));
		
		
		
		
		//Or()는 둘 중 하나라도 true면 true리턴
		intPredicateAB = intPredicateA.or(intPredicateB);
		System.out.println("7은 2나 3의 배수입니까?  " + intPredicateAB.test(7));
		
		
		
		//Negate() = NOT ----- true이면 false리턴,,,false면 true리턴
		intPredicateAB = intPredicateA.negate();  //intPredicateA 는 2의 나머지가 0이면 true니까 8은 짝수가되고 negate()를 호출해서 값이 반대로 나온다
		System.out.println("8은 짝수 입니가?  " + intPredicateAB.test(8));  //값이 반대로 나온다
	}

}
