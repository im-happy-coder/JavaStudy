package clothing;


class Alpha{
	int ns;
	static int s;
	public Alpha(int ns) {
		// TODO Auto-generated constructor stub
		if(s<ns) {
			s=ns;
			this.ns=ns;
		}
	}
	void doPrint() {
		System.out.println("ns = "+ ns + " s= " + s);
	}
}
public class Examp53 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alpha ref1 = new Alpha(100);
		Alpha ref2 = new Alpha(50);
		Alpha ref3 = new Alpha(125);
		ref1.doPrint();
		ref2.doPrint();
		ref3.doPrint();
	}

}
