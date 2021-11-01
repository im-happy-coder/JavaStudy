package sec02.example04;

import java.util.ArrayList;
import java.util.function.ToIntFunction;

public class FunctionEx02 {
	
	public static ArrayList<Student2> arrayList = new ArrayList<>();
	
	
	public static void main(String[] args) {
		
		
		arrayList.add(new Student2("홍길동", "대구", 100, 80));
		arrayList.add(new Student2("신은혁", "서울", 90, 88));
		arrayList.add(new Student2("김연아", "광주", 77, 100));
		
		
		
		//람다식의 매개변수 t는 Student2를 가르킨다.
		ToIntFunction<Student2> toIntFunction = t -> {return t.getEngscore();};
		average(toIntFunction, "영어");
		
		System.out.println("----------------------------------");
		
		//return은 생략가능하고 return를 생략하면 {}도 생략이 가능하다.
		ToIntFunction<Student2> toIntFunction2 = t -> t.getMatscore();
		average(toIntFunction2, "수학");
		
		
		
	}
	
	
	//Student2객체를 받아서 Int객체로 만든다.
	public static void average(ToIntFunction<Student2> function, String str) {
		int sum = 0;
		double avg = 0.0;
		
		for(Student2 student2 : arrayList) {
			int score = function.applyAsInt(student2);
			sum+=score;
		}
		avg = (double) sum / arrayList.size();
		System.out.println(str + "점수 평균 : " + avg);
	}
	

}
