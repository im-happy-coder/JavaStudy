package Question151_200;


class MyThread implements Runnable{
	private String src[] = {"A", "B", "C"};
	private int count = 0; //line n1
//	public void run() { //line n2 
	public synchronized void run(){ 
		while( count < src.length) {
			System.out.println(src[count]);
			count++;
		}
	}
}
public class Examp166 {
	public static void main(String[] args) {
		MyThread mt = new MyThread();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
			t1.start();
			t2.start();
	}
}

//´ä : C. Replace line n2 with: public synchronized void run () {
