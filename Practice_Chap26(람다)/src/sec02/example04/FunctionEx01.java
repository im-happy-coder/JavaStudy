package sec02.example04;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

public class FunctionEx01 {
	
	//Function = 매핑자
	
	
	//Arrays클래의 asList()는 매개값으로 들어오는 객체를 딱 고정된 값들로 해서 List<T>으로 리턴해준다.
	private static List<Student> list = Arrays.asList(
			new Student("신은혁", 100, 95),
			new Student("김연아", 90, 98),
			new Student("차주혁", 80, 92),
			new Student("신주아", 81, 99)
			);
	
	public static void main(String[] args) {
		
		Function<Student, String> function = t -> {return t.getName();};
		printString(function);
		
		System.out.println("--------------------------------");
		
		
		
		ToIntFunction<Student> intFunction = t -> {return t.getEngscore();};
		printInt(intFunction,"수학");
		
		
		System.out.println("--------------------------------");
		
		
		ToIntFunction<Student> intFunction2 = t -> {return t.getMatscore();};
		printInt(intFunction,"영어");
	}
	
	
	//Function<T,R>함수적 인터페이스는 T를 매개값으로 하여, R로 맵핑하여 리턴하는 인터페이스이다.
	//여기서는 곧, printString()메서드의 매개변수 타입이 Function<T,R>가 되고,,,람다식이 넘겨주어야한다.
	public static void printString(Function<Student, String> function) {
		for(Student student : list) {
			String str = function.apply(student);
			System.out.println("이름 : " + str + "\t");
		}
		System.out.println();
	}
	
	
	//---------------------------------------------------------
	
	
	public static void printInt(ToIntFunction<Student> function, String str) {
		for(Student student : list) {
			int	score = function.applyAsInt(student);
			System.out.println(str + "점수 : " + score + "\t");
		}
		System.out.println();
	}
}
