package example05;

public class AnalogThemometer implements Thermometer.TemperatureChangable {
	int temperture = 100;
	@Override
	public void OnChangable() {
		System.out.println("아날로그 온도계입니다.");
		System.out.println(this.temperture + "도 입니다.");
	}
}
