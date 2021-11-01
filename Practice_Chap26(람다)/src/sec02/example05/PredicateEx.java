package sec02.example05;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateEx {
	public static ArrayList<Student> arrayList = new ArrayList<>();
	public static void main(String[] args) {
		// Predicate = 논리자(Boolean)
		arrayList.add(new Student("김동년", "여자", 20));
		arrayList.add(new Student("이민기", "남자", 60));
		arrayList.add(new Student("김연아", "여자", 100));
		arrayList.add(new Student("신은혁", "남자", 100));
		arrayList.add(new Student("홍길동", "남자", 80));
	
		Predicate<Student> predicateMale = s -> {return s.getSex().equals("남자");};
		double male = avg(predicateMale);
		System.out.println("남자 평균 값 : " + male);
		
		
		
		Predicate<Student> predicateFemale = s -> {return s.getSex().equals("여자");};
		double Female = avg(predicateFemale);
		System.out.println("여자 평균 값 : " + Female);
	}
		//Predicate<T>함수적 인터페이스는 test()의 추상메서드를 가지고 있다.
		//아울러, 매개변수로 Predicate<Student>이다. 하여, 호출하는 곳에서는
		// Predicate<Student>의 추상메서드 test()를 구현한 객체를 받아야하는 것이다.
		public static double avg(Predicate<Student> predicate ) {
			int count = 0;
			int sum = 0;
			
			for(Student student : arrayList) {
				if(predicate.test(student)) {
					count++;
					sum += student.getScore();
				}
			}
			return (double) sum/count;
		}
}
