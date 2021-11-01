package Question151_200;


class Bird {
	String name;
	public Bird(String name) {
		this.name = name;
	}
	public void eat() {
		System.out.println(name + "is eating");
	}
}
interface BirdInt{
	Bird getBird(String name);
}

public class Examp200 {

	public static void main(String[] args) {
		//insert code here
//		Which code fragment can be inserted to print: Peacock is eating?
		BirdInt b1 = Bird::new; Bird b = b1.getBird("Peacock");
		b.eat();
	}

}
