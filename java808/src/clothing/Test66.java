package clothing;

interface Exportable1{
	void export(); //인터페이스의 추상 메서드는 기본이 abstrack public 임
}
class Tool1 implements Exportable{
	  public void export() { //public만 가능 위에가 public이기 때문에
		// TODO Auto-generated method stub
		
	}
}
class ReportToll1 extends Tool1 implements Exportable{
	public void export() {
		// TODO Auto-generated method stub
	}
}
public class Test66 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
