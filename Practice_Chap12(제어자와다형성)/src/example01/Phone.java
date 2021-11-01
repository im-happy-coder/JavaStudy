package example01;

public class Phone {
	//private(같은 클래스내에서만 가능)
	//필드(멤버변수)
	//protected 접근 제어자 : 상속 또는 같은 패키지에서 다 접근 가능함. 다른 패키지에서 접근 불가. 다른패키지에서 상속받아도 접근 불가.
	private String model;
	private String color;
	private String company;
	
	//매개변수 생성자
	public Phone(String model, String color, String company) {
		super();
		this.model = model;
		this.color = color;
		this.company = company;
	}

	//getter()제공 (캡슐화 제공) (private는 getter로 데이터 전달)
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public String getCompany() {
		return company;
	}
	
	@Override
	public String toString() {
		String str = "모델  : " + this.getModel() + "색상 : " + this.getColor() + "제조 회사 : " + this.getCompany();
		return str;
	}
	

}
