package example03;

public class RanddomEx {

	public static void main(String[] args) {
		
		//Math.random()의 값은 0.00000~0.99999사이의 값을 발생시킴
		//System.out.println(Math.random());
		
		//주사위 눈을 랜덤으로 발생
		int num = (int)(Math.random()*6) + 1; //1~6까지의 범위의 수를 발생시키는 식
		System.out.println(num);
		
		if(num == 1) {
			System.out.println("1이 나왔네요!");
		}
		else if(num == 2) {
			System.out.println("2이 나왔네요!");
		}
		else if(num == 3) {
			System.out.println("3이 나왔네요!");
		}
		else if(num == 4) {
			System.out.println("4이 나왔네요!");
		}
		else if(num == 5) {
			System.out.println("5이 나왔네요!");
		}
		else {
			System.out.println("6이 나왔네요!");
		}
		//위의 if문을 switch문으로 바꿔보세요...
	}

}
