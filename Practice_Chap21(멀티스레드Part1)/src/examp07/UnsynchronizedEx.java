package examp07;

public class UnsynchronizedEx {

	public static void main(String[] args) {
		//공유 객체 생성
		Calcurator calcurator = new Calcurator();
		
		//문제가 무엇입니까? 출력결과를 보면, User-2스레드가 설정한 값으로 
		//User-1 스레드도 출력한다. (데이터의 신뢰성이 붕괴)
		//동기화 처리를 함으로써 객체의 잠금이 일어나면서 데이터의 신뢰성을 
		//확보해준다.
		
		User1 user1 = new User1();
		user1.setCalcurator(calcurator);
		user1.start();
		
		
		User2 user2 = new User2();
		user2.setCalcurator(calcurator);
		user2.start();
		
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
		System.out.println(calcurator.getMemory());
	}

}
