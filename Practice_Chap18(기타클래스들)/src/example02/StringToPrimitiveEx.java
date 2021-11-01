package example02;

public class StringToPrimitiveEx {

	public static void main(String[] args) {
		
		int value1 = Integer.parseInt("100");  //.parseInt()는 String객체에서 int형 값을 뽑아 내는 메서드
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
	}

}
