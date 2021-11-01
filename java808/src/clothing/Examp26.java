package clothing;
interface Exportable11{
	void export(); //인터페이스의 추상 메서드는 기본이 abstrack public 임
}
class Tool11 implements Exportable11{
	 public void export() { //public만 가능 위에가 public이기 때문에
		// TODO Auto-generated method stub
		 System.out.println("Tool:export");
		
	}
}

public class Examp26 extends Tool11 implements Exportable11{
	 public void export() {
		// TODO Auto-generated method stub
		System.out.println("RTool::export");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool11 aTool = new Examp26();
		Tool11 bTool = new Tool11();
		callExport(aTool);
		callExport(bTool);
	}
	public static void callExport(Exportable11 ex) {
		ex.export();
	}
}
