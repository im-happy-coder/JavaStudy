package example03;

public class Product {
	
	static int number = 0;  //정적변수
	int countNo; 			//인스턴스변수
	int[] arr = new int[10];
	
	
	//정적 초기화 블럭 (단, 한번만 실행)
	static{
			System.out.println("정적 초기화 블럭 호출됨");
	}
	
	//인스턴스 초기화 블럭 (정적멤버 사용할 수 있음) 반대로 (정적 초기화 블럭은 인스턴스변수 사용 불가)
	{
		System.out.println("인스턴스 초기화 블럭 호출됨");
		++number;
		this.countNo = number;
		//복잡한 초기화 같은 경우는 초기화 블럭 실행문 작성하면 가독성이 좋아진다.
		for(int i=0; i<arr.length;i++) {
			this.arr[i] = (int)(Math.random()*10)+1;
		}
	}
	
	public Product() {
		System.out.println("기본 생성자 호출됨");
	}
	
	
}
