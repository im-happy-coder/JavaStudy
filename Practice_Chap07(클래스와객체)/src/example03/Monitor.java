package example03;

public class Monitor {   //모니터설계도
	
	//멤버변수(필드,속성)선언
	String color;  //모니터 색상
	int channel;   //모니터 채널
	int volume;    //소리 볼륨
	boolean power;  //모니터 전원ON/OFF (기본false)
	
	
	//멤버메서드(기능)선언
	//Monitor를 켜거나 끄는 기능을 하는 메서드
	public void power() {  			//리턴 타입이 void이면 return 필요하지 않는다
		
		if(!this.power) {
			System.out.println("모니터가 켜졌습니다."); 
			this.power = !power;
		}
		else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;
		}
		
	}
	
	public void volumeUP() {
		System.out.println("현재 볼륨 : " + (++this.volume));
	}
	
	public void volumeDOWN() {
		System.out.println("현재 볼륨 : " + (--this.volume));
	}
	
	public void channelUP() {
		this.channel++;
		System.out.println("현재 채널 : " + this.channel); //this : 클래스의 주소(new라는 연산자가 인스턴스를 생성하면 비로소 활성화가 이뤄진다.)
	}
	
	public void channelDOWN() {
		//this.channel--;
		System.out.println("현재 채널 : " + (--this.channel));  
	}
	
	@Override
		public String toString() { //toString 멤버변수의 주소나 원하는 값을 보고 싶을때 사용
			return "현재 채널 : " + this.channel + " , " +  "현재 볼륨  : " + this.volume;
		}

}
