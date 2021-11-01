package example02;

public class PhoneEx {

	public static void main(String[] args) {
		
		//추상클래스는 인스턴스를 생성 할 수가 없다
		//Phone phone = new Phone();
		
		
		//다형성
		Phone[] p = new Phone[10];
		p[0] = new SmartPhone(1, "ㅁㅁ", "L");
		p[1] = new FolderblePhone(2, "ㅂㅂ", "삼");
		//근본이 Phone이니깐 SmartPhone이나 FolderblePhone에 선언되어 있는
		//메서드는 사용을 못한다. 왜? 근본이 Phone이기 때문입니다.
		p[0].turnOff();
		p[0].showInfo();
	
		
		
		System.out.println("-------------------------------------");
		
		p[1].turnOff();
		p[1].showInfo();
		
		System.out.println("-------------------------------------");
		
		
		
		SmartPhone smartPhone = new SmartPhone(190815, "홍길동", "LG-V50");
		smartPhone.showInfo();
		smartPhone.turnOn();
		smartPhone.turnOff();
		smartPhone.internetSearch();
		
		System.out.println("------------------------------------");
		
		FolderblePhone fphone = new FolderblePhone(190820, "티아라", "삼성");
		fphone.showInfo();
		fphone.turnOn();
		fphone.turnOff();
		fphone.FoldOn();
		fphone.FoldOff();
		
	}

}
