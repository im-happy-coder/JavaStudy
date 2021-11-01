package clothing;

interface Exportable2{
	void export(); //인터페이스의 추상 메서드는 기본이 abstrack public 임
}
class Tool2 implements Exportable2{
	  public void export() { //public만 가능 위에가 public이기 때문에
		  System.out.println("Tool::export");
	}
}
class ReportToll2 extends Tool2 implements Exportable2{
	public void export() {
		System.out.println("RTool::export");
	}
}
public class Examp112 {

	public static void main(String[] args) {
		Tool2 aTool = new ReportToll2();
		Tool2 bTool = new Tool2();
		callExport(aTool);
		callExport(bTool);

	}
	public static void callExport(Exportable2 ex) {
		ex.export();
	}
}