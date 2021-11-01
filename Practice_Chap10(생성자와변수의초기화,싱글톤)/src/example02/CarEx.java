package example02;

public class CarEx {

	public static void main(String[] args) {
		//기본형  (정해져있는 옵션)
		Car c1 = new Car();
		System.out.println(c1);
		
		//매개변수형 (자기가 원하는 옵션가능)
		Car c2 = new Car("흰색", "오토", 4);
		System.out.println(c2);
		
		//인스턴스 복제
		Car c3 = new Car(c2); 
		System.out.println(c3);
		
		Car c4 = new Car("파랑", "오토");
		System.out.println(c4);
		
		for(int i=0; i<10; i++) {
			Car c = new Car(c2);
			System.out.println( (i+1) + "번째 차 " + c);
		}
	}

}
