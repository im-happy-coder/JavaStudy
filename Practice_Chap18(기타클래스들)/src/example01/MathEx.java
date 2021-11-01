package example01;

public class MathEx {

	public static void main(String[] args) {
		
		//abs() 절대값
		int v1 = Math.abs(-5);
		double v2 = Math.abs(-7.88);
		System.out.println(v1);
		System.out.println(v2);
		
		//올림값
		double v3 = Math.ceil(5.3);
		System.out.println(v3);
		
		//내림값
		double v4 = Math.floor(5.3);
		System.out.println(v4);
		
		//MAX 둘 중에 최대값
		int v5 = Math.max(10, 5);
		System.out.println(v5);
		
		//MIN 둘 중에 최소값
		int v6 = Math.min(10, 5);
		System.out.println(v6);
		
		//랜덤값 0.0~0.9
		double v7 = Math.random();
		System.out.println(v7);
		
		//가까운 정수의 실수값
		double v8 = Math.rint(5.3);
		System.out.println(v8);
		
		//반올림값 - 무조건 소수점 첫째 자리에서만 반올림이 가능하다.
		long v9 = Math.round(5.5);
		System.out.println(v9);
		
		//소수점 셋째자리에서 반올림 하는 값은 어떻게 하냐
		double value = 12.3456;
		double temp1 = value * 100;  // 먼저 100을 곱하고  -> 1234.56
		System.out.println(temp1);
		long temp2 = Math.round(temp1); //round로 반올림 1235
		System.out.println(temp2);  
		double v10 = temp2 / 100.0; // 다시 나눠줘야한다. 1235/100.0
		System.out.println(v10);	// 결과 : 12.35
	}

}
