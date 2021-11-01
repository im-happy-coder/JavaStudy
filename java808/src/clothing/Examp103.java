package clothing;

class LoFileException extends Exception{}
class AccessViolationException extends RuntimeException{}
public class Examp103 {

	public static void main(String[] args) throws LoFileException {
		Examp103 obj = new Examp103();
		try {
			obj.open();
			obj.process();
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("Completed");
		}
		// TODO Auto-generated method stub
	}
		public void process() throws LoFileException {
			System.out.println("process");
			throw new LoFileException();
		}
		public void open()  {
			System.out.println("Opend");
			throw new AccessViolationException();
		}
	}

