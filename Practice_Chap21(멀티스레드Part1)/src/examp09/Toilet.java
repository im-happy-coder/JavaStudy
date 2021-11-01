package examp09;
//공유 객체
public class Toilet {

	//플래그 변수 (트루일때 펄스일떄 실행을 해라)
//	private boolean seat;
//	메서드 잠금이 일어난다.
	public synchronized void use() throws Exception{
		
		String name = Thread.currentThread().getName();
		
		//누군가가 화장실에 들어왔을때
//		if(this.seat==false) {
//			this.seat = true;
		System.out.println(name + "가/이 화장실에 입장하였습니다.");

		
		
		Thread.sleep(1000);
		System.out.println(name + "가/이 말 : 아 쉬원하다~~!");
		
//		this.seat = false;
		System.out.println(name + "가/이 화장실 사용을 마쳤습니다.");
		System.out.println();
//		} else {
//			System.out.println(name + "가/이 화장실 사용 중 입니다. 기다리세요!");
//		}
	}
	//비동기화 메서드
	public void noke() {
		System.out.println(Thread.currentThread().getName()  + " 똑 똑 !");
	}
}
