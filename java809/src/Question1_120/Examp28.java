package Question1_120;

class ImageScanner implements AutoCloseable {
	public void close () throws Exception {
		System.out.println ("Scanner closed.");
	}
	public void scanImage () throws Exception {
		System.out.print ("Scan.");
		throw new Exception("Unable to scan.");
	}
}

class ImagePrinter implements AutoCloseable {
	public void close () throws Exception {
		System.out.print ("Printer closed.");
	}
	public void printImage () {System.out.print("Print."); }
}

public class Examp28 {

	public static void main(String[] args) {
		try (ImageScanner ir = new ImageScanner();
				ImagePrinter iw = new ImagePrinter()) {
				ir.scanImage();
				iw.printImage();
				} catch (Exception e) {
				System.out.print(e.getMessage());
				}
	}

}

//
//ir.scanImage ()는 'Scan'을 인쇄합니다. 그런 다음 예외가 발생합니다.
//그리고 두 클래스 모두 자동 닫을 수 있기 때문에 두 close () 메서드가 모두 호출되지만 반대 순서로 호출되고
//그래서 iw.close ()가 호출되고 ir.close ()
//마지막으로 예외 메시지가 인쇄됩니다.
