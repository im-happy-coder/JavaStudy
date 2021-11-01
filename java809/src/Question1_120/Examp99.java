package Question1_120;

class Resource implements AutoCloseable{
	public void close() throws Exception {
		System.out.println("Close-");
	}
	public void open() {
		System.out.println("OPen-");
	}
}
public class Examp99 {

	public static void main(String[] args) {
		Resource res1 = new Resource();
		try {
			res1.open();
			res1.close();
		} catch (Exception e) {
			System.out.println("Exception- 1");
		}
		//여기까지 출력은 OPEN CLOSE
		
//		try(res2 = new Resource()) { //line 1  //올바른 답은 Resource res2 = new Resource()) 이렇게 새로 인스턴스를 만들어줘야한다.
		try(Resource res2 = new Resource()) {
			res2.open();
		} catch (Exception e) {
			System.out.println("Exception -2 ");
		}
	}

}


//답 : C. A compilation error occurs at line n1.



//res2로 인스턴스를 새로 만들면
//답은 OPen-Close-OPen-Close-