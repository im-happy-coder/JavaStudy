package example02;

public class CalculatorEx {

	public static void main(String[] args) {

		Calculator cal = new Calculator();
		//인스턴스메서드 호출
		int addresult = cal.add(100, 200);
		System.out.println("addresult : " + addresult);
		
		//static메서드 호출
		long mulResult = Calculator.multiply(100, 20);
		System.out.println("multiply : " + mulResult );
		//static메서드 호출
		double divResult = Calculator.divide(100.88, 10.55);
		System.out.println("divResult : " + divResult);
		
		//정적 메서드의 예시(선언부에 static제어자(s)가 붙어 있다.) -- 자바닥스에서 확인을 했다
		//Integer.parseInt("100");
		//Math.random();
	}

}
