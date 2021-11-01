package example02;

public class Member {
	
	int iv = 100;        //인스턴스 멤버 변수
	static int cv = 200; //static 멤버 변수
	
	//인스턴스 메서드
	public void imethod() {
		System.out.println("iv : " + this.iv);
//		System.out.println("cv : " + Member.cv);  //클래스명.정적변수명
	}
	//static 메서드
	public static void smethod() {
		 //안된다 이유는 언제 인스턴스가 만들어질지는 아무도 모르기 때문이다.
		 //System.out.println("iv : " + this.iv);
		
		 //cv는 static변수이기 때문에 인스턴스 생성없이도 접근가능해야 하는데,
		 //static메서드 내에서는 얼마든지 접근이 가능하다 
		 //메모리 상단 클래스영역에(static)이 같은 방에 존재하기 때문이다
		System.out.println("cv : " + Member.cv);
	}

}
