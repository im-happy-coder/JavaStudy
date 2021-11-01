package Question151_200;

class MyClass implements Runnable{ //line n1
	public int value; // line n2
	@Override
	 public synchronized void run() {  //line n3 //synchronized를 붙여주면 결과는 1~100까지 순서대로 실행함
		while(value < 100) {
			value++;
			System.out.println("value : " + value);
		}
	}
}
public class Examp165 {
	public static void main(String[] args) {
//		What change should you make to guarantee a single order of execution (printed values 1 -100 in order)?
//		단일 실행 순서를 보장하려면 어떤 변경을해야합니까 (순서대로 1-100 값 인쇄)?
		
//		MyClass mc = new Thread(mc);문제는 이렇게 나와있음 --- 컴파일 오류 발생
		MyClass mc = new MyClass(); 
		Thread a = new Thread(mc);
		a.start();
		Thread b = new Thread(mc);
		b.start();
		
	}
}
//답 : A. Line 3: public synchronized void run() {