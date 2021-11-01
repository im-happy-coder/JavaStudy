package example04;

public class Television implements RemoteControl{

	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
		
	}

	@Override
	public void setVolume(int volume) {
		//볼륨 0~10사이에 값으로 유지
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println("TV의 볼륨이 최대치 값은 10입니다.");
			this.volume = RemoteControl.MAX_VOLUME;
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			System.out.println("TV의 볼륨이 최소치 값은 0입니다.");
			this.volume = RemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);
	}
	
	
}
