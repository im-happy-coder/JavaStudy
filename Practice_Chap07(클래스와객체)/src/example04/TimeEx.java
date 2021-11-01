package example04;

public class TimeEx {

	public static void main(String[] args) {
		
		Time t1 = new Time();
		//t1.hour = 10;
		System.out.println(t1);
		
		
		//시를 설정
		t1.setHour(10);
		//분를 설정
		t1.setMinute(30);
		//초를 설정
		t1.setSecond(12);
		
		
		System.out.println(t1);
	}

}
