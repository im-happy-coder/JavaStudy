package example03;

public class BlockEx {
	//인스턴스 초기화 블럭, 인스턴스(new)가 생성될 때마다 호출된다. (힙)
	//인스턴스가 생성자보다 먼저 실행된다.
	{
		System.out.println("인스턴스 초기화 블럭 실행됨");
	}
	
	//정적초기화 블럭, 단 한번만 수행이 이루어짐. (메모리 상단)클래스 영역에 올라감.
	static {
		System.out.println("정적 초기화 블럭 실행됨");
	}

	
	//생성자
	public BlockEx() {
		System.out.println("생성자 호출됨");
	}
	

	//클래스 변수 초기화 순서
	//기본값 -> 명시적 초기화 -> 클래스 초기화 블럭

	//인스턴스 변수 초기화 순서
	//기본값 -> 명시적 초기화 -> 인스턴스 초기화 블럭 -> 생성자
	public static void main(String[] args) {
		
		BlockEx b1 = new BlockEx();
		
		//정적->인스턴스->생성자  (순으로 출력됨

	}

}
