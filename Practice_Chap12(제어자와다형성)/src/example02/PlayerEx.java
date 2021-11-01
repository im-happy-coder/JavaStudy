package example02;

public class PlayerEx {

	public static void main(String[] args) {
		
		//다형성 미적용 코드(자기 자신을 호출)
		Player player = new Player("이동국", 40, 20, 60);
		player.info();
		System.out.println();
		
		
		
		//다형성이 적용된 코드(필드의 다형성)
		//하지만, 근본은 벗어나지 못한다. 하여 Striker클래스에 있는 getshoot()메서드는
		//player2 참조변수가 접근이 안된다. (근본이 Player이기 떄문이다)
		Player player2 = new Striker("손흥민", 25, 10, 90, 50);
		//메서드에서 상속관계에 있다면, 자손클래스 오버라이딩을 하게 되면, 현재 참조하고 있는
		//인스턴스의 메서드를 호출한다.(new Striker)
		player2.info();
		System.out.println();
		
		
		
		Player player3 = new MidFielder("이강인", 18, 18, 80, 120);
		player3.info();
		System.out.println();
		
		
		Player player4 = new Defender("김영권", 28, 18, 60, 60);
		player4.info();
	}

}
