package Question151_200;

import java.io.IOException;

class Video{
public void play() throws IOException {
System.out.print("Video played.");
}
}
class Game extends Video{
public void play() throws Exception{ // 조상과 부모의 throws가 같아야함, 같으면 답은 : Video played.Game played.
super.play();
System.out.println("Game played.");
}
}
public class Examp155 {

	public static void main(String[] args) {
		
		try {
			new Game().play();
		} catch (Exception e) {
			System.out.println(e.getClass());
		}
	}
	
	
	//답 :B. A compilation error occurs.
//	하위 클래스는 더 일반적인 예외가 아닌 더 구체적인 예외를 throw해야합니다.

}
