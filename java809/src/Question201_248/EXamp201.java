package Question201_248;


class Emp {
	public void calcLeave() {
		System.out.println("12");
	}
}
public class EXamp201 {

	public static void main(String[] args) {
		//insert code here
		Emp e = new Emp() {
			public void calcLeave() {
				System.out.println("13");
			}
		};
		e.calcLeave();
	}

}
//Which code fragment can be inserted to print 13?
