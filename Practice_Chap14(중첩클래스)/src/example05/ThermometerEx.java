package example05;

public class ThermometerEx {

	public static void main(String[] args) {

		Thermometer thermometer = new Thermometer();
		thermometer.setChangabe(new AnalogThemometer());
		thermometer.viewTemperature();
		
		
		thermometer = new Thermometer();
		thermometer.setChangabe(new DigitalThemometer());
		thermometer.viewTemperature();
		
		
		
		//중첩 인터페이스 이므로 익명구현 객체를 얻는 것은 안된다.
//		Thermometer.TemperatureChangable thermometer2 = new Thermometer.TemperatureChangable() {
//			//익명 구현 객체
//			@Override
//			public void OnChangable() {
//				System.out.println("익명 구현 객체로 만듬");
//				
//				
//			}
//			
//		};
//		Thermometer t = (Thermometer)thermometer2;
//		t.viewTemperature();
		
	}

}
