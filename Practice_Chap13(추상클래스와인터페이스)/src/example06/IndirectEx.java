package example06;

public class IndirectEx {

	public static void main(String[] args) {
		// A와 B,C의 인다이렉트 관계
		I i = new B();
		i.method();
		
		i = new C();
		i.method();
	}

}
