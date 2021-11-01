package example05;

public class Child extends Parent{
	int x = 20;
	
	
	public Child() {
//		super(); //조상클래스의 기본 생성자를 호출(생략가능) + 기본생성자도 생략가능 (단, 매개변수 생성자를 만들면 불가능)
		super(80); //조상클래스의 매개변수가 있는 생성자를 호출, 생략을 절대로 하면 안됨.
		System.out.println("자손클래스의 생성자 호출");
	}
	
	
	@Override
	public void show() {
		System.out.println("현재 인스턴스의 x = " + x);
		System.out.println("자손 클래스의 this.x = " + this.x);
		System.out.println("조상 클래스의 super.x = " + super.x);
		//super.show();  //조상클래스의 show()메서드를 호출 할수 있다.
	}
	


}
